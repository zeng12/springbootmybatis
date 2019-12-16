package com.zql.springbootmybatis.common.aop;

import java.lang.annotation.*;

/**
 * @author zql
 * @Description: 自定义注解--》不需要登录验证的注解
 * @date : 2019-10-9 20:47
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NoLogin {
}
