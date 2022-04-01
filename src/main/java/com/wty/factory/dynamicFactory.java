package com.wty.factory;

import com.wty.dao.UserDao;
import com.wty.dao.impl.UserDaoImpl;

public class dynamicFactory {

    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
