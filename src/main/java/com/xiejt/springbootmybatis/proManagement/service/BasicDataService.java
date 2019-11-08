package com.xiejt.springbootmybatis.proManagement.service;

/*
 * @功能描述
 * @Author xiejt
 **/

import com.xiejt.springbootmybatis.proManagement.entity.AsRank;
import com.xiejt.springbootmybatis.proManagement.mapper.AsRankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicDataService {

    @Autowired
    private AsRankMapper asRankMapper;



    public AsRank findById(AsRank asRank) {
        return asRankMapper.findById(asRank);
    }

    public List findAllAs(String customer) {
        return asRankMapper.findAllAs(customer);
    }
}
