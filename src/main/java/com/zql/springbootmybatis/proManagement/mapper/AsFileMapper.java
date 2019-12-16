package com.zql.springbootmybatis.proManagement.mapper;

import com.zql.springbootmybatis.proManagement.entity.AsFile;
import com.zql.springbootmybatis.proManagement.entity.AsRank;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: zql
 * @CreateDate: 2019/11/3$ 15:27$
 */
@Repository
public interface AsFileMapper {
    AsFile findById(AsFile asFile);

    List findAllAsFile();

    List findAsFileByAsId(AsRank asRank);
}
