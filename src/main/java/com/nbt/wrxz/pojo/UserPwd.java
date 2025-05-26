package com.nbt.wrxz.pojo;

public class UserPwd {
    private Integer id;

    private String password;  // 加密后的密码
    private Integer uid;       // 关联 user 表的 Id

    public UserPwd() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getters and Setters（省略）
}