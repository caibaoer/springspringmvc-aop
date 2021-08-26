package com.gx.controller;

import com.gx.configuration.ConfigurationTestDemo;
import com.gx.pojo.User;
import com.gx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TController
 * @Description TODO
 * @Date 2021/8/19 13:31
 * @Created by huangwencai
 */
@RestController
public class TController {
    public TController() {
        System.out.println("TController ...");
    }

    @Autowired
    UserService userService;

    @Autowired
    ConfigurationTestDemo configurationTestDemo;

    @RequestMapping("user")
    public String printUser(User user) {
        System.out.println(user.toString());
        userService.printUser();
        return "ok";
    }



    @RequestMapping("user2")
    public String printUser2(User user) {
        System.out.println(user.toString());
        return "ok";
    }

    @RequestMapping("testConfiguration")
    public String testConfiguration() {
        configurationTestDemo.test();
        return "ok";
    }
}
