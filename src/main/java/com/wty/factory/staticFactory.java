package com.wty.factory;

import com.wty.dao.UserDao;
import com.wty.dao.impl.UserDaoImpl;

public class staticFactory {


    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
