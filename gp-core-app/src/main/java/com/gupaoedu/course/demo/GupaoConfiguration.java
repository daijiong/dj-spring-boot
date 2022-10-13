package com.gupaoedu.course.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisOperations;

// 只有当classpath中存在RedisOperations这个类的时候才会加载这个Configuration
//@ConditionalOnClass({ RedisOperations.class })
@Configuration
public class GupaoConfiguration {
    @Bean
    public GupaoEduCore gupaoEduCore() {
        return new GupaoEduCore();
    }
}
