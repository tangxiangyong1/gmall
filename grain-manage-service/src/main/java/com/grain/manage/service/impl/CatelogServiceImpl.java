package com.grain.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.grain.bean.PmsBaseCatalog1;
import com.grain.bean.PmsBaseCatalog2;
import com.grain.bean.PmsBaseCatalog3;
import com.grain.manage.mapper.PmsBaseCatalog1Mapper;
import com.grain.manage.mapper.PmsBaseCatalog2Mapper;
import com.grain.manage.mapper.PmsBaseCatalog3Mapper;
import com.grain.service.CatelogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CatelogServiceImpl implements CatelogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCata2og1Mapper;
    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCata3og1Mapper;

    @Override
    public List<PmsBaseCatalog1> getcatelog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
          PmsBaseCatalog2 pmsBaseCatalog2=new PmsBaseCatalog2();
          pmsBaseCatalog2.setCatalog1Id(catalog1Id);
          List<PmsBaseCatalog2> pmsBaseCatalog2s=pmsBaseCata2og1Mapper.select(pmsBaseCatalog2);

        return pmsBaseCatalog2s;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3=new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);

        return pmsBaseCata3og1Mapper.select(pmsBaseCatalog3);
    }
}
