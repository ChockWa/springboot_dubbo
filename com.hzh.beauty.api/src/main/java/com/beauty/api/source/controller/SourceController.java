package com.beauty.api.source.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.beauty.source.service.SourceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SourceController {

    @Reference
    private SourceService sourceService;

    @ResponseBody
    @RequestMapping("/getSource")
    public String getSource(){
        return sourceService.getSource();
    }
}
