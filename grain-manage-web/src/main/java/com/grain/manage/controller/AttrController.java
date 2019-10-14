package com.grain.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.bean.PmsBaseAttrInfo;
import com.grain.bean.PmsBaseAttrValue;
import com.grain.bean.PmsBaseSaleAttr;
import com.grain.service.AttrService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;

    @RequestMapping("attrInfoList")

    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        return attrService.attrInfoList(catalog3Id);
    }



    @RequestMapping("saveAttrInfo")
    public String saveAttrInfo(@RequestBody  PmsBaseAttrInfo pmsBaseAttrInfo){
         String  success= attrService.saveAttrInfo(pmsBaseAttrInfo);

        return success;
    }


    @RequestMapping("baseSaleAttrList")
    public List<PmsBaseSaleAttr> baseSaleAttrList(){

        return attrService.baseSaleAttrList();
    }

    @RequestMapping("getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        List<PmsBaseAttrValue> pmsBaseAttrValues= attrService.getAttrValueList(attrId);

        return pmsBaseAttrValues;
    }
}
