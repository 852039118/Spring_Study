package com.warren.demo01;

public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent(){
        seeHouse();
        host.rent();
        contract();
    }

    public void seeHouse(){
        System.out.println("代理带你去看房子！");
    }
    public void contract(){
        System.out.println("代理和你签合同！");
    }
}
