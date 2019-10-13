package com.grain.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.grain.bean.PmsBaseAttrInfo;
import com.grain.manage.mapper.PmsBaseAttrInfoMapper;
import com.grain.manage.mapper.PmsBaseAttrValueMapper;
import com.grain.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;
    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo=new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
    }
}
