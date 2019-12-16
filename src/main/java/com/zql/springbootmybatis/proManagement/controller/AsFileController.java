package com.zql.springbootmybatis.proManagement.controller;

import com.zql.springbootmybatis.proManagement.entity.AsFile;
import com.zql.springbootmybatis.proManagement.entity.AsRank;
import com.zql.springbootmybatis.proManagement.service.AsFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: zql
 * @CreateDate: 2019/11/3$ 15:24$
 */
@RestController
@RequestMapping(value = "/asFile")
public class AsFileController {
    @Autowired
    private AsFileService asFileService;

    @RequestMapping("/findById")
    public AsFile findById(AsFile asFile){
        System.out.println(asFile);
        return asFileService.findById(asFile);
    }

    @RequestMapping("/findAllAsFile")
    public ResponseObject findAllAsFile(){
        return ResponseObject.success().data(asFileService.findAllAsFile());
    }

    @RequestMapping("/findAsFileByAsId")
    public ResponseObject findAsFileByAsId(AsRank asRank){
        return ResponseObject.success().data(asFileService.findAsFileByAsId(asRank));
    }
}
