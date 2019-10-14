package com.grain.service;

import com.grain.bean.PmsProductInfo;

import java.util.List;

public interface SupService {
    List<PmsProductInfo> spuList(String catalog3Id);
}
