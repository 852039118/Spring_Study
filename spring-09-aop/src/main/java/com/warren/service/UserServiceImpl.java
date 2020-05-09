package com.warren.service;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一次！");
    }

    public void delete() {
        System.out.println("删除了一次！");
    }

    public void update() {
        System.out.println("修改了一次！");
    }

    public void select() {
        System.out.println("查询了一次！");
    }

    //更改原有的业务代码，是大忌！！！
}
