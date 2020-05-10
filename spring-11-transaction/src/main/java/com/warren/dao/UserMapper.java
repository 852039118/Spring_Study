package com.warren.dao;

import com.warren.pojo.User;

public interface UserMapper {
    void addUser(User user);
    int deleteUser(int id);
}
