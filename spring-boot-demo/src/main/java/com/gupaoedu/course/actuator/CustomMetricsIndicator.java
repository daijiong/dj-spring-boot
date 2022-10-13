package com.gupaoedu.course.actuator;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

@Endpoint(id = "custom")
public class CustomMetricsIndicator {

    @ReadOperation
    public Map<String, Object> time() {
        Map<String, Object> result = new HashMap<>();
        Date time = new Date();
        result.put("当前时间:", time.toString());
        return result;
    }
}
