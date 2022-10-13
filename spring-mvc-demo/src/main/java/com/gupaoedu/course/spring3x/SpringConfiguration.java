package com.gupaoedu.course.spring3x;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@ComponentScan("com.gupaoedu.course.spring3x")
@Configuration
public class SpringConfiguration {

    @Bean
    public Test3Service test3Service() {
        return new Test3Service();
    }

    /**
     * 依赖注入
     * @param test3Service spring容器中存在的一个对象
     * @return
     */
    @Bean
    public Test4Service test4Service(@Autowired Test3Service test3Service) {
        Test4Service test4Service = new Test4Service();
        test4Service.setTest3Service(test3Service);
        return test4Service;
    }

}
