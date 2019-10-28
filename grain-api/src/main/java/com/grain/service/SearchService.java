package com.grain.service;

import com.grain.bean.PmsSearchParam;
import com.grain.bean.PmsSearchSkuInfo;

import java.util.List;

public interface SearchService {
    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam);
}
