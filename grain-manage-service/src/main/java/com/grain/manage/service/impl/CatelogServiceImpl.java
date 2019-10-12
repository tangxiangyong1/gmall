package com.grain.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.grain.bean.PmsBaseCatalog1;
import com.grain.manage.mapper.PmsBaseCatalog1Mapper;
import com.grain.service.CatelogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CatelogServiceImpl implements CatelogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
   /* @Autowired
    PmsBaseCatalog2Mapper pmsBaseCata2og1Mapper;
    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCata3og1Mapper;*/

    @Override
    public List<PmsBaseCatalog1> getcatelog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }
}
