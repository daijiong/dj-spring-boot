package com.gupaoedu.course.spring3x;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// 使用@Import动态导入配置
@Import(SpringConfiguration.class)
public class ImportConfiguration {

    @Bean
    public Test5Service test5Service() {
        return new Test5Service();
    }
}
