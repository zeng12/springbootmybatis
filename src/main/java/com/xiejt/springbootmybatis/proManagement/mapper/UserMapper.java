package com.xiejt.springbootmybatis.proManagement.mapper;

import com.xiejt.springbootmybatis.proManagement.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author xiejt
 * @Description:
 * @date : 2019-9-20 8:50
 */
@Repository
public interface UserMapper {
    User findUserByUserName(Map map);

    List findAllUsers(Map map);

    List findUsersByZhMm(Map map);
}
