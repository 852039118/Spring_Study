package com.warren.demo02;

//静态代理
public class Proxy {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add(){
        log("add");
        userService.add();
    }
    public void delete(){
        log("delete");
        userService.delete();
    }
    public void update(){
        log("update");
        userService.update();
    }
    public void select(){
        log("select");
        userService.select();
    }

    //日志方法
    public void log(String msg){
        System.out.println("[debug] 执行了" + msg + "方法！");
    }
}
