package com.gx.ServiceImpl;

import com.gx.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2021/8/19 17:22
 * @Created by huangwencai
 */
@Service
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("UserServiceImpl cons...");
    }

    @Override
    public void printUser() {
        System.out.println("user...");
    }
}
