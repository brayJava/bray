package com.whiteplanet.web.service.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.DepartmentFunctionMapper;
import com.whiteplanet.mapper.model.DepartmentFunction;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.entry.GlobalPageVo;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @Author: HeWei
 * @Description: 科室相关 重构点(1.命名规范 2.用户自定义科室不能入科室表，只保留在用户表中
 *               3.查询分页模式，由于大数据量时limit的效率问题 探讨是否优化成流式分页模式)
 * @Date: Created in 16:12 2017
 * @Modified By:
 */
@Service
@Transactional
public class DepartmentFunctionService extends BaseService{
    @Autowired
    private DepartmentFunctionMapper departmentFunctionMapper;

    /**
     * 根据条件查询科室列表
     * @param data
     * @return
     */
    public ReturnResult searchDepartmentFun(GlobalPageVo data){
        //模糊查询
        List<DepartmentFunction> list = departmentFunctionMapper.
                selectByLikeName(data.getText(),data.getCount());
        if(list.size()>0){
            //遍历list,组合返回数据
            List<Map<String,Object>> returnList = new ArrayList<>();
            for (DepartmentFunction item : list){
                Map<String,Object> map = new HashMap<>();
                map.put("id",item.getId());
                map.put("name",item.getName());

                returnList.add(map);
            }
            return new ReturnResult(returnList);
        }else{
            logger.debug(">>>>>>>>>>根据查询条件:[{}]查询科室信息,无记录",data.getText());
            return ReturnResult.RESULT_NONE;
        }

    }

    /**
     * 新建科室(待重构)
     * @param data
     * @param phone
     * @return
     */
    public ReturnResult addDepartmentFun(SingleStringBean data,String phone){
        //todo
        //查找是否存在 其他科室(用户自定义添加科室的父科室)  如果没有 新建一条记录
        DepartmentFunction otherFun = departmentFunctionMapper.selectOther();
        if (otherFun == null) {
            DepartmentFunction newOtherFun = new DepartmentFunction();
            newOtherFun.setCode("9999");
            newOtherFun.setName("其他科室");
            newOtherFun.setCreateDate(new Date());
            newOtherFun.setId(WPStringUtil.GETuuid());
            //insert
            departmentFunctionMapper.insertSelective(newOtherFun);
        }
        //根据父id和查询条件查询数据
        DepartmentFunction newDepFun = departmentFunctionMapper.selectByPidAndName(otherFun.getId(),data.getParam());
        if(newDepFun == null){
            //如果为空，新建数据
            newDepFun.setCreateDate(new Date());
            newDepFun.setId(WPStringUtil.GETuuid());
            newDepFun.setPid(otherFun.getId());
            newDepFun.setName(data.getParam());
            newDepFun.setUseCount(1);
            //insert
            departmentFunctionMapper.insertSelective(newDepFun);
            //构建返回数据
            Map<String,Object> map = new HashMap<>();
            map.put("id",newDepFun.getId());
            map.put("name",newDepFun.getName());

            logger.debug(">>>>>>>>>>用户:[{}]新增科室:[{}]成功",phone,data.getParam());
            return new ReturnResult(map);
        } else {
            return ReturnResult.DATA_EXIST;
        }

    }
}
