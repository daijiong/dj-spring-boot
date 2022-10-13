package com.gupaoedu.course.actuator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class EndpointConfiguration {

    @Bean
    public CustomMetricsIndicator customMetricsIndicator() {
        return new CustomMetricsIndicator();
    }
}
