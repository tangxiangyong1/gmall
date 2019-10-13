package com.grain.service;

import com.grain.bean.PmsBaseCatalog1;
import com.grain.bean.PmsBaseCatalog2;
import com.grain.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatelogService {
    public List<PmsBaseCatalog1>  getcatelog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
