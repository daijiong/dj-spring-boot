package com.gupaoedu.course.springbootdemo;

import com.gupaoedu.course.demo.GupaoEduCore;
import com.gupaoedu.course.importselector.GpRedisTemplate;
import com.gupaoedu.course.importselector.GpSqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gupaoedu.course.importselector.EnableConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@EnableConfiguration
@SpringBootApplication
@ComponentScan({"com.gupaoedu.course.mybatis", "com.gupaoedu.course.actuator"})
@MapperScan("com.gupaoedu.course.mybatis.dao.mappers")
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDemoApplication.class, args);
//        GpRedisTemplate gpRedisTemplate = applicationContext.getBean(GpRedisTemplate.class);
//        System.out.println(gpRedisTemplate);
//        GpSqlSessionFactory gpSqlSessionFactory = applicationContext.getBean(GpSqlSessionFactory.class);
//        System.out.println(gpSqlSessionFactory);
        System.out.println(applicationContext.getBean(GupaoEduCore.class));
    }
}
