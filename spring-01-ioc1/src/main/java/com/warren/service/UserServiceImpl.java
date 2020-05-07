package com.warren.service;

import com.warren.dao.UserDao;
import com.warren.dao.UserDaoImpl;
import com.warren.dao.UserDaoMySQLImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
