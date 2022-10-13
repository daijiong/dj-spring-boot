package com.gupaoedu.course.spring3x.enable;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("com.gupaoedu.course.spring3x.enable")
@EnableScheduling
@Configuration
public class TaskConfiguration {

}
