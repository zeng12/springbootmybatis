package com.xiejt.springbootmybatis.proManagement.controller;

//基础数据管理

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiejt.springbootmybatis.proManagement.entity.AsRank;
import com.xiejt.springbootmybatis.proManagement.service.BasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/basicData")
public class BasicDataController {
    @Autowired
    private BasicDataService basicDataService;

    @RequestMapping("/findById")
    public AsRank findById(AsRank asRank){
        System.out.println(asRank);
        return basicDataService.findById(asRank);
    }

    @RequestMapping("/findAllAs")
    public ResponseObject findAllAs(@RequestParam(name="customer",required = false) String customer){
        System.out.println("String customer==="+customer);
        return ResponseObject.success().data(basicDataService.findAllAs(customer));
    }

    @RequestMapping("/findAsFl")
    public ResponseObject findAsFl(AsRank asRank){
        System.out.println("asRank==="+asRank);
        return ResponseObject.success().data(asRank.getId() * asRank.getCustomer() * asRank.getPeer() % 3);
    }

    @RequestMapping("/findGxyc")
    public ResponseObject findGxyc(@RequestParam(name="data",required = false) String listStr){
        List<AsRank> list = new Gson().fromJson(listStr, new TypeToken<List<AsRank>>(){}.getType());
        AsRank as1 = list.get(0);
        AsRank as2 = list.get(1);
        long num = ((as1.getId()%2)+(as2.getId()%2)+(as1.getCustomer()*as2.getCustomer()+as1.getId()+as2.getId()))%3;
        return ResponseObject.success().data(num);
    }

}
