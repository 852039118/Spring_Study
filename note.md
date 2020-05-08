## 常用依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <!--指定要扫描的包，这个包下的注解就会生效-->
    <context:component-scan base-package="com.warren"/>
    <!--开启注解的支持-->
    <context:annotation-config/>
</beans>
```

## 注解说明
- @Autowired：自动装配通过类型，名字
    如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value=""")来配合指定
- @Nullable：字段标记了这个注解，说明这个字段可以为null
- @Resource：自动装配通过名字，类型
- @Component：组件，放在类上，说明这个类被Spring管理了，就是bean！
    + @Controller   : 放在controller上
    + @Repository   : 放在dao上
    + @Service      : 放在service上
- @Value("")