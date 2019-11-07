package com.example.shardingsphere2.controller;

import com.example.shardingsphere2.entity.UserInfo;
import com.example.shardingsphere2.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author breet
 * @date 2019/11/6 16:41
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private UserInfoService userService;

    @GetMapping("/select")
    public List<UserInfo> select() {
        return userService.getUserList();
    }

    @PostMapping("/insert")
    public Boolean insert(UserInfo user) {
        return userService.save(user);
    }
}
