package com.nbt.wrxz.service;

import com.nbt.wrxz.pojo.User;

public interface UserService {
    User login(String identifier, String password);
    boolean register(User user, String password);
    User findById(Integer id);
}
