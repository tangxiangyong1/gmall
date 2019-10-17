package com.grain.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.bean.PmsProductImage;
import com.grain.bean.PmsProductInfo;
import com.grain.bean.PmsProductSaleAttr;
import com.grain.manage.controller.util.PmsUploadUtil;
import com.grain.service.SupService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
public class SupController {

    @Reference
    SupService supService;

   @RequestMapping("spuList")      //查询sup属性
   public List<PmsProductInfo>  spuList(String catalog3Id){
       List<PmsProductInfo> pmsProductInfos= supService.spuList(catalog3Id);
       return pmsProductInfos;
   }
   @RequestMapping("fileUpload")  //图片
   public String  fileUpload(@RequestParam("file")MultipartFile multipartFile){
      String img=  PmsUploadUtil.uploadImg(multipartFile);
       System.out.println(img);
       return  img;
   }



@RequestMapping("spuSaleAttrList")
public List<PmsProductSaleAttr> spuSaleAttrList(String spuId){

    List<PmsProductSaleAttr> pmsProductSaleAttrs = supService.spuSaleAttrList(spuId);
    return pmsProductSaleAttrs;
}



@RequestMapping("saveSpuInfo")  //保存属性后台
    public  String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
       supService.saveSpuInfo(pmsProductInfo);
       return  "success";
}

    @RequestMapping("spuImageList")
    @ResponseBody
    public List<PmsProductImage> spuImageList(String spuId){

        List<PmsProductImage> pmsProductImages = supService.spuImageList(spuId);
        return pmsProductImages;
    }

}
