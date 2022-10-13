package com.gupaoedu.course.spring3x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5Class {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfiguration.class);
        Test5Service test5Service = applicationContext.getBean(Test5Service.class);
        System.out.println(test5Service);
        Test4Service test4Service = applicationContext.getBean(Test4Service.class);
        System.out.println(test4Service);
        Test3Service test3Service = test4Service.getTest3Service();
        System.out.println(test3Service);
    }
}
