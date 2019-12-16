package com.zql.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zql.springbootmybatis.proManagement.mapper")
@SpringBootApplication
public class SpringbootmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmybatisApplication.class, args);
	}

}
