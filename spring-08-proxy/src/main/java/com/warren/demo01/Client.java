package com.warren.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理
        Proxy proxy = new Proxy(host);


        proxy.rent();
    }
}
