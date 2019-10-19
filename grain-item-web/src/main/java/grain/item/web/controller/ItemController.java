package grain.item.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.bean.PmsProductSaleAttr;
import com.grain.bean.PmsSkuInfo;
import com.grain.service.SkuService;
import com.grain.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemController {

     @Reference
      SkuService skuService;
@Reference
    SpuService spuService;
      @RequestMapping("{skuId}.html")
     public String skuId(@PathVariable String skuId, ModelMap map){

     PmsSkuInfo pmsSkuInfo=skuService.getSkuById(skuId);
     map.put("skuInfo",pmsSkuInfo);
          //销售属性列表
          List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrListCheckBySku(pmsSkuInfo.getProductId(),pmsSkuInfo.getId());
          map.put("spuSaleAttrListCheckBySku",pmsProductSaleAttrs);
          return  "item";
      }

}
