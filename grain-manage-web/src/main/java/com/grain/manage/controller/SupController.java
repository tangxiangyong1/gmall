package com.grain.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.bean.PmsProductInfo;
import com.grain.service.SupService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SupController {

    @Reference
    SupService supService;

   @RequestMapping("spuList")
   public List<PmsProductInfo>  spuList(String catalog3Id){
       List<PmsProductInfo> pmsProductInfos= supService.spuList(catalog3Id);
       return pmsProductInfos;
   }

}
