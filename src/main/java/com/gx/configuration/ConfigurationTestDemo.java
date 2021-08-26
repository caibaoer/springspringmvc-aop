package com.gx.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * @Classname ConfigurationTestDemo
 * @Description TODO
 * @Date 2021/8/26 9:30
 * @Created by huangwencai
 */
@Configuration
public class ConfigurationTestDemo {


    public ConfigurationTestDemo() {
        System.out.println("ConfigurationTestDemo...");
    }

    public void  test(){
        System.out.println("ConfigurationTestDemo test...");
    }
}
