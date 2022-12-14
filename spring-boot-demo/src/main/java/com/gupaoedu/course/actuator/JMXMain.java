package com.gupaoedu.course.actuator;

import java.io.IOException;
import java.lang.management.ManagementFactory;

import javax.management.*;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public class JMXMain {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException,
                                           IOException {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("com.gupaoedu.course.actuator:type=SystemInfo");
        SystemInfo systemInfo = new SystemInfo();
        mBeanServer.registerMBean(systemInfo, objectName);
        System.in.read();
    }
}
