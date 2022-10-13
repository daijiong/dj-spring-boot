package com.gupaoedu.course.actuator;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public interface SystemInfoMBean {

    int getCpuCore();

    long getTotalMemory();

    void shutdown();
}
