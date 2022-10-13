package com.gupaoedu.course.spring1x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        // 通过applicationContext.xml配置文件方式获取spring容器
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        // 根据bean类型来获取bean
        System.out.println(context.getBean(TestService.class));
        // 根据bean名称来获取bean
        System.out.println(context.getBean("helloService"));
    }
}
