package com.zql.springbootmybatis.proManagement.service;

import com.zql.springbootmybatis.proManagement.entity.AsFile;
import com.zql.springbootmybatis.proManagement.entity.AsRank;
import com.zql.springbootmybatis.proManagement.mapper.AsFileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: zql
 * @CreateDate: 2019/11/3$ 15:25$
 */
@Service
public class AsFileService {

    @Autowired
    private AsFileMapper asFileMapper;

    public AsFile findById(AsFile asFile) {
        return asFileMapper.findById(asFile);
    }

    public List findAllAsFile() {
        return asFileMapper.findAllAsFile();
    }

    public List findAsFileByAsId(AsRank asRank) {
        return asFileMapper.findAsFileByAsId(asRank);
    }
}
