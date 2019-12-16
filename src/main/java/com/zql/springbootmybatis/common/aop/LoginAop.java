package com.zql.springbootmybatis.common.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author zql
 * @Description: 登录判断Aop，拦截所有Controller和有@RequestMapping注解的方法，不拦截有@NoLogin注解的方法
 * @date : 2019-10-9 20:49
 */

//@Aspect
//@Component
public class LoginAop {
//    private static final Logger log = LogManager.getLogManager(LoginAop.class);

//    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)&&!@annotation(com.xiejt.springbootmybatis.common.aop.NoLogin)")
    public void login(){

    }

//    @Around("login()")
    public Object validate(){
        System.out.println("所有接口請求登陸驗證===============");
        return "error";
    }
}
