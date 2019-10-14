package com.grain.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.grain.bean.PmsProductInfo;
import com.grain.manage.mapper.PmsProductInfoMapper;
import com.grain.service.SupService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SupServiceImpl implements SupService {

    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        PmsProductInfo PmsProductInfo=new PmsProductInfo();
        PmsProductInfo.setCatalog3Id(catalog3Id);
        return (List<PmsProductInfo>) pmsProductInfoMapper.select(PmsProductInfo);
    }
}
