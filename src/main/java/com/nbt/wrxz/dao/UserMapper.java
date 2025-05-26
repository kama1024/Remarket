package com.nbt.wrxz.dao;

import com.nbt.wrxz.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByEmailOrPhone(@Param("identifier") String identifier);
    User findById(Integer id);
    int insertUser(User user);
}
