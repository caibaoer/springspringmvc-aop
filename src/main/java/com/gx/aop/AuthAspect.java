package com.gx.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Classname AuthAspect
 * @Description TODO
 * @Date 2021/8/19 16:44
 * @Created by huangwencai
 */
@Aspect
//@Component
public class AuthAspect {
    public AuthAspect() {
        System.out.println("AuthAspect cons...");
    }

    //定义切点
    @Pointcut("execution(* com.gx.service.UserService.printUser(..))")
    public void pointCut() {}

    //定义切点
    @Pointcut("execution(* com.gx.controller.TController.printUser2(..))")
    public void pointCut2() {}



    //前置处理
    @Before("pointCut()")
    public void auth() {
        System.out.print(System.getProperty("file.encoding"));
        System.out.println("check servive..");
    }

    //前置处理
    @Before("pointCut2()")
    public void auth2() {
        System.out.println("check controller...");
    }
}
