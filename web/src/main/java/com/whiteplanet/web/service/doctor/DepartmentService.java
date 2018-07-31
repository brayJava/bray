package com.whiteplanet.web.service.doctor;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.DepartmentMapper;
import com.whiteplanet.mapper.model.Department;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 15:08 2017
 * @Modified By:
 */
@Service
@Transactional
public class DepartmentService extends BaseService{
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 根据部门code 查询职称list  code 类型 A01医师 A02技师 A03护士 A04药师 A05行政
     * @param data
     * @return
     */
    public ReturnResult findByCode(SingleStringBean data){
        /**
         * add by wuzhiyuan on 2017/12/19 16:30
         * 初始化部门名称
         */
        if(StringUtils.isEmpty(data.getParam())) {
            List<Department> departments = departmentMapper.selectParent();
            if(!CollectionUtils.isEmpty(departments)) {
                JSONArray jsonArray = new JSONArray();
                JSONObject jsonObject =  new JSONObject();
                departments.forEach(department -> {
                    jsonObject.put("id",department.getId());
                    jsonObject.put("code",department.getCode());
                    jsonObject.put("name",department.getName());
                    jsonArray.add(jsonObject);
                });
                return new ReturnResult(jsonArray);
            } else {
                return new ReturnResult(JSONArray.toJSON(new ArrayList<>()));
            }
        }
        //get the list from db and go through it
        List<Department> list = departmentMapper.selectPositionByCode(data.getParam());
        if (list.size()>0){
            List<Map<String,Object>> returnList = new ArrayList<>();
            for (Department item:list){
                Map<String,Object> map = new HashMap<>();
                map.put("id",item.getId());
                map.put("name",item.getName());
                /*
                 * 最低诊费产品逻辑: 医生只能选择自己对应职称最低诊费标准以上的诊费 否则为0
                 * 例如: 某医生职称为主任医师 最低诊费为100 那么该医生输入的诊费应该大于等于100 或者为0
                 */
                map.put("min",item.getMinMoney());//最低诊费

                returnList.add(map);
            }
            return new ReturnResult(returnList);
        }else{
            logger.debug(">>>>>>>>>>根据部门code:[{}]查询职称信息,无记录",data.getParam());
            return ReturnResult.RESULT_NONE;
        }

    }
    /**
     * 新增职称 为admin管理后台预留方法，由于会重构数据模型，暂时置空
     * @param department
     * @return
     */
    public ReturnResult addNewDepartment(Department department){
        //todo
        return null;
    }
}
