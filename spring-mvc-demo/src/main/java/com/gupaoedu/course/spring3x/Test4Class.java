package com.gupaoedu.course.spring3x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4Class {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Test4Service test4Service = applicationContext.getBean(Test4Service.class);
        System.out.println(test4Service);
        Test3Service test3Service = test4Service.getTest3Service();
        System.out.println(test3Service);
    }
}
