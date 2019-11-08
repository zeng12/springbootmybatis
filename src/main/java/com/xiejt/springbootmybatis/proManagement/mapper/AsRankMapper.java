package com.xiejt.springbootmybatis.proManagement.mapper;

import com.xiejt.springbootmybatis.proManagement.entity.AsRank;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * AsMapper
 */
@Repository
public interface AsRankMapper {
    AsRank findById(AsRank asRank);

    List findAllAs(String customer);
}
