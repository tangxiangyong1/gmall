package com.grain.service;

import com.grain.bean.PmsProductImage;
import com.grain.bean.PmsProductInfo;
import com.grain.bean.PmsProductSaleAttr;

import java.util.List;

public interface SupService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    List<PmsProductImage> spuImageList(String spuId);
}
