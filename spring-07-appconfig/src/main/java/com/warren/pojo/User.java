package com.warren.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //说明这个类被Spring接管了，注册到了容器中
public class User {
    @Value("纯JAVA注解配置，NO-XML - import")  //属性注入值
    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
