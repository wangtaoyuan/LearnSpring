package com.wty.dao.impl;

import com.wty.dao.UserDao;

public class UserDaoImpl implements UserDao {
    // 重写无参构造函数
    public UserDaoImpl() {
        System.out.println("UserDaoImpl building...");
    }


    public void init() {
        System.out.println("Init...");
    }


    public void destroy() {
        System.out.println("destroying...");
    }


    public void save() {
        System.out.println("saving...");
    }
}
