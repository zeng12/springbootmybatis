package com.zql.springbootmybatis.proManagement.mapper;

import com.zql.springbootmybatis.proManagement.entity.AsRank;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AsMapper
 */
@Repository
public interface AsRankMapper {
    AsRank findById(AsRank asRank);

    List findAllAs(String customer);
}
