package com.warren.demo02;

import org.junit.Test;

public class Client {
    @Test
    public void general(){
        UserServiceImpl userService = new UserServiceImpl();

        userService.add();
        userService.delete();
        userService.update();
        userService.select();
    }

    @Test
    public void proxy(){
        Proxy proxy = new Proxy();
        proxy.setUserService(new UserServiceImpl());

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.select();
    }
}
