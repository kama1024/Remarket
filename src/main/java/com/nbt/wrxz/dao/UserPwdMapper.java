package com.nbt.wrxz.dao;

import com.nbt.wrxz.pojo.UserPwd;
import org.apache.ibatis.annotations.Param;

public interface UserPwdMapper {
    UserPwd findByUserId(Integer userId);
    int insert(@Param("uid") int uid, @Param("password") String password);
}
