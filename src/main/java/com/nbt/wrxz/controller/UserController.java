package com.nbt.wrxz.controller;

import com.nbt.wrxz.pojo.User;
import com.nbt.wrxz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/login.do", method = RequestMethod.GET)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login.do")
    public Map<String, Object> login(@RequestBody Map<String, String> data) {
        String identifier = data.get("identifier");
        String password = data.get("password");

        User user = userService.login(identifier, password);
        Map<String, Object> result = new HashMap<>();
        if (user != null) {
            result.put("success", true);
            result.put("user", user);
        } else {
            result.put("success", false);
            result.put("message", "登录失败，账号或密码错误");
        }
        return result;
    }

    @RequestMapping(value = "/registered.do", method = RequestMethod.POST)
    public Map<String, Object> register(@RequestBody Map<String, String> data) {
        User user = new User();
        user.setUsername(data.get("username"));
        user.setPhone(data.get("phone"));
        user.setEmail(data.get("email"));
        user.setAvatar(data.containsKey("avatar") ? data.get("avatar") : "");
        String password = data.get("password");

        boolean success = userService.register(user, password);
        Map<String, Object> result = new HashMap<>();
        result.put("success", success);
        result.put("message", success ? "注册成功" : "注册失败");
        return result;
    }
}
