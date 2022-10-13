package com.gupaoedu.course.redis;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class RedisController {

    @Autowired //在这里能够实现注入的前提是？ IOC存在实例（自动装配）
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/redisTemplate")
    public String redisTemplateSay() {
        redisTemplate.opsForValue().set("name", "david");
        return redisTemplate.opsForValue().get("name");
    }

    @Autowired
    RedissonClient redissonClient;

    @GetMapping("/redissonClient")
    public String redissonClient() {
        RBucket bucket = redissonClient.getBucket("name");
        if (bucket.get() == null) {
            bucket.set("gupaoedu.com");
        }
        return bucket.get().toString();
    }

}
