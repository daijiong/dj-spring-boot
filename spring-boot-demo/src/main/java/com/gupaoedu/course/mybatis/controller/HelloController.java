package com.gupaoedu.course.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gupaoedu.course.mybatis.dao.entity.User;
import com.gupaoedu.course.mybatis.services.IUserService;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class HelloController {

    @Autowired
    IUserService userService;

    @GetMapping("/test")
    public String test() {
        User user = new User();
        user.setName("Mic");
        userService.insert(user);
        return "Hello Spring Boot";
    }
}
