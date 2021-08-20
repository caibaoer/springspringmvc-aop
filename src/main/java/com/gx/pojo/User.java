package com.gx.pojo;

import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Date 2021/8/19 13:31
 * @Created by huangwencai
 */
public class User {
    private String name;
    private int age;
    private Date birth;
    private boolean flag;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", flag=" + flag +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
