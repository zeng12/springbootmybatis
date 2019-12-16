package com.zql.springbootmybatis.proManagement.controller;

import com.zql.springbootmybatis.proManagement.entity.User;
import com.zql.springbootmybatis.proManagement.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/main")
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping("/login")
    public User findUserByUserName(){
        return mainService.findUserByUserName();
    }

    @RequestMapping("/findAllUsers")
    public List findAllUsers(){
        return mainService.findAllUsers();
    }

    @RequestMapping("/findUsersByZhMm")
    public List findUsersByZhMm(){
        return mainService.findUsersByZhMm();
    }
}
