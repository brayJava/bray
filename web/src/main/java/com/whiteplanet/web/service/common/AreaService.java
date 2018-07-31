package com.whiteplanet.web.service.common;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.ArsfcGeoCityMapper;
import com.whiteplanet.mapper.ArsfcGeoCountryMapper;
import com.whiteplanet.mapper.ArsfcGeoDistrictMapper;
import com.whiteplanet.mapper.ArsfcGeoProvinceMapper;
import com.whiteplanet.mapper.model.ArsfcGeoCity;
import com.whiteplanet.mapper.model.ArsfcGeoProvince;
import com.whiteplanet.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HeWei
 * @Description: 区域数据
 * @Date: Created in 17:57 2017
 * @Modified By:
 */
@Service
@Transactional
public class AreaService extends BaseService {
    @Autowired
    private ArsfcGeoCityMapper arsfcGeoCityMapper;
    @Autowired
    private ArsfcGeoCountryMapper arsfcGeoCountryMapper;
    @Autowired
    private ArsfcGeoDistrictMapper arsfcGeoDistrictMapper;
    @Autowired
    private ArsfcGeoProvinceMapper arsfcGeoProvinceMapper;

    /**
     * 根据前端定制化要求 组合省市数据
     * @return
     */
    public ReturnResult getProAndCity(){
        //初始化map
        Map<String,Object> provinceMap = new HashMap<>();
        Map<String,Object> proItemMap = new HashMap<>();
        //查询省信息后进行数据组建
        List<ArsfcGeoProvince> proList = arsfcGeoProvinceMapper.selectAll();
        for (ArsfcGeoProvince proItem : proList){
            proItemMap.put("value",proItem.getAdcode());
            proItemMap.put("text",proItem.getName());
        }
        provinceMap.put("options",proItemMap);
        //初始化map
        Map<String,Object> cityMap = new HashMap<>();
        Map<String,Object> cityItemMap = new HashMap<>();
        //查询市信息后进行数据组建
        List<ArsfcGeoCity> cityList = arsfcGeoCityMapper.selectAll();
        for (ArsfcGeoCity cityItem : cityList){
            cityItemMap.put("value",cityItem.getAdcode());
            cityItemMap.put("text",cityItem.getName());
            cityItemMap.put("parentVal",cityItem.getParentadcode());
        }
        cityMap.put("options",cityItemMap);
        //构建返回list
        List<Map<String,Object>> returnList = new ArrayList<>();
        returnList.add(provinceMap);
        returnList.add(cityMap);

        return new ReturnResult(returnList);
    }
}
