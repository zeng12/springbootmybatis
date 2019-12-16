package com.zql.springbootmybatis.common.baseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BaseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map findMap(String sql){
        return jdbcTemplate.queryForMap(sql);
    }

    public List findList(String sql){
        return jdbcTemplate.queryForList(sql);
    }
}
