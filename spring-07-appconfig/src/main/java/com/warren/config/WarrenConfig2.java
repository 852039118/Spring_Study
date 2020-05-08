package com.warren.config;

import com.warren.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//这个也会被Spring容器托管，注册到容器中，因为它本身就是一个@Component
//@Configuration表示这是一个配置类，就和我们之前配置的applicationContext.xml和beans.xml
@Configuration
@ComponentScan("com.warren.pojo")
public class WarrenConfig2 {

    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字就相当于bean标签的id属性
    //这个方法的返回类型，就相当于bean标签的class属性
    //这个方法的返回值，就是返回要注入到bean的对象
    @Bean
    public User getUser(){  //getUser为Bean的id
        return new User();
    }
}
