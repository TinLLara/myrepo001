package com.szcxsl.springboot.controller;

import com.szcxsl.springboot.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @restController 包含了 @Controller与 @ResponseBody注解
 * （标识了controller并返回给浏览器，对象返回则为json）
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private User user;
    @RequestMapping("/get")
    public User getUserById() {
        return user;
    }
}
