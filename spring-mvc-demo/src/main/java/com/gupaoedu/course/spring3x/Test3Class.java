package com.gupaoedu.course.spring3x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3Class {

    public static void main(String[] args) {
        // 通过注解配置方式创建spring容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 根据bean类型来获取bean
        System.out.println(applicationContext.getBean(Test3Service.class));
    }
}
