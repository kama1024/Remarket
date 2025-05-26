package com.nbt.wrxz.pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String phone;
    private String email;
    private Integer type;          // 用户类型（0普通用户 1管理员）
    private String creditrating;   // 信用评级
    private String deliveryaddress;// 收货地址
    private String realName;       // 真实姓名
    private String gender;         // 性别
    private Date createtime;       // 创建时间
    private String avatar;         // 头像
    private String hideinformation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreditrating() {
        return creditrating;
    }

    public void setCreditrating(String creditrating) {
        this.creditrating = creditrating;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getHideinformation() {
        return hideinformation;
    }

    public void setHideinformation(String hideinformation) {
        this.hideinformation = hideinformation;
    }
}