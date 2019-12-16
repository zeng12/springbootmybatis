package com.zql.springbootmybatis.proManagement.controller;

//基础数据管理

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zql.springbootmybatis.proManagement.entity.AsRank;
import com.zql.springbootmybatis.proManagement.service.BasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@RestController
@RequestMapping(value = "/basicData")
public class BasicDataController {
    @Autowired
    private BasicDataService basicDataService;

    @RequestMapping("/findById")
    public AsRank findById(AsRank asRank) {
        System.out.println(asRank);
        return basicDataService.findById(asRank);
    }

    @RequestMapping("/findAllAs")
    public ResponseObject findAllAs(@RequestParam(name = "customer", required = false) String customer) {
        System.out.println("String customer===" + customer);
        return ResponseObject.success().data(basicDataService.findAllAs(customer));
    }

    @RequestMapping("/findAsFl")
    public ResponseObject findAsFl(AsRank asRank) {
         /**
         System.out.println("asRank==="+asRank);
         return ResponseObject.success().data(asRank.getId() * asRank.getCustomer() * asRank.getPeer() % 3);
         //return ResponseObject.success().data(asRank.getId() * asRank.getCustomer() * asRank.getPeer() % 3);
          **/
        int res = 0;
        try {
            String temp = asRank.getCustomer() + " " + asRank.getProvider() + " " + asRank.getPeer() + " " +
                    asRank.getCone() + " " + asRank.getApa() + " " + asRank.getDark() + " " + asRank.getAlexa()
                    + " " + asRank.getDarkAndAlexa() + "" + " " + asRank.getTransit() + " " + asRank.getBetweeness()
                    + " " + asRank.getCloseness() + " " + asRank.getCluster() +
                    " " + asRank.getType();
            String[] args = new String[]{"python", "E:\\PycharmProject\\LastProgram\\AdaboostNew\\AdaboostNew.py", temp};
            Process proc = Runtime.getRuntime().exec(args);// 执行py文件

            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                if (line.equals("[13]")) {
                    res = 2;
                } else if (line.equals("[2]")) {
                    res = 1;
                } else if(line.equals("[4]")){
                    res = 0;
                }
            }
            in.close();
            proc.waitFor();

        }catch(Exception e){
            e.printStackTrace();;
        }
        return ResponseObject.success().data(res);

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
