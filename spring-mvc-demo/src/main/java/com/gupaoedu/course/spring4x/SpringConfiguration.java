package com.gupaoedu.course.spring4x;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    /**
     * spring4.x开始添加了@Conditional的特性
     * DemoService这个bean在满足GpCondition类中的match方法时才会被加载
     * @return
     */
    @Conditional(GpCondition.class)
    @Bean
    public DemoService demoService() {
        return new DemoService();
    }
}
