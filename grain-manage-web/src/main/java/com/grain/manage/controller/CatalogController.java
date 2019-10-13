package com.grain.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.bean.PmsBaseCatalog1;
import com.grain.bean.PmsBaseCatalog2;
import com.grain.bean.PmsBaseCatalog3;
import com.grain.service.CatelogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {



    @Reference
    CatelogService catelogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getcatelog1(){
        List<PmsBaseCatalog1> pmsBaseCatalog1s = catelogService.getcatelog1();
        return pmsBaseCatalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> pmsBaseCatalog2s = catelogService.getCatalog2(catalog1Id);
        return pmsBaseCatalog2s;
    }
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3s = catelogService.getCatalog3(catalog2Id);
        return pmsBaseCatalog3s;
    }


}
