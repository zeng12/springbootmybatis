package com.zql.springbootmybatis.proManagement.service;

import com.zql.springbootmybatis.proManagement.entity.User;
import com.zql.springbootmybatis.proManagement.mapper.AsRankMapper;
import com.zql.springbootmybatis.proManagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MainService {

    @Value("${timeout.oout}")
    private int timeout;

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AsRankMapper asRankMapper;

    public User findUserByUserName() {
        Map map = new HashMap();
        map.put("username", "zhangsan");
        return userMapper.findUserByUserName(map);
    }

    public List findAllUsers() {
        System.out.println("timeOut==="+timeout);
        Map map = new HashMap();
        return userMapper.findAllUsers(map);
    }

    public List findUsersByZhMm() {
        Map map = new HashMap();
        map.put("username", "zhangsan");
        map.put("password", "11111");
        return userMapper.findUsersByZhMm(map);
    }
}
