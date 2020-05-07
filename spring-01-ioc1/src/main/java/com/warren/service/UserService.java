package com.warren.service;

import com.warren.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
