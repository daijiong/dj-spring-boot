package com.gupaoedu.course.spring2x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test2Class {
    public static void main(String[] args) {
        // 通过applicationContext.xml配置文件方式创建spring容器
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        // 根据bean类型来获取bean
        System.out.println(context.getBean(Test2Service.class));
    }
}
