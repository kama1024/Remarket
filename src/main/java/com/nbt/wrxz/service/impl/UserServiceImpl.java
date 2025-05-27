package com.nbt.wrxz.service.impl;

import com.nbt.wrxz.dao.UserMapper;
import com.nbt.wrxz.pojo.User;
import com.nbt.wrxz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String identifier, String password) {
        User user = userMapper.findByEmailOrPhone(identifier);
        if (user == null) return null;

        User userpwd = userMapper.findById(user.getId());
        if (userpwd != null && BCrypt.checkpw(password, userpwd.getPassword())) {
            return user;
        }
        return null;
    }

    @Override
    public boolean register(User user, String password) {
        user.setType(0); // 默认普通用户
        user.setCreatetime(new Date());
        int rows = userMapper.insertUser(user);
        if (rows > 0) {
            String hash = BCrypt.hashpw(password, BCrypt.gensalt());
            userMapper.insert(user.getId(), hash);
            return true;
        }
        return false;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
