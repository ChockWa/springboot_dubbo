package com.beauty.source.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.beauty.source.service.SourceService;

@Service
public class SourceServiceImpl implements SourceService {

    public String getSource() {
        return "SourceService";
    }
}
