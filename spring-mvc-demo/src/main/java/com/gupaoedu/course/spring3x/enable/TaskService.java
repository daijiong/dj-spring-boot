package com.gupaoedu.course.spring3x.enable;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime() {
        System.out.println("current Time:" + new Date());
    }
}
