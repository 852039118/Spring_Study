package com.warren.dao;

import com.warren.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
}
