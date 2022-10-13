package com.gupaoedu.course.spring3x.enable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskMain {

    public static void main(String[] args) {
        // 使用xml方式
        //        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        // 使用配置类方式
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskConfiguration.class);
    }
}
