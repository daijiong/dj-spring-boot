package com.gupaoedu.course.actuator;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.stereotype.Component;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 *
 * 自定义JMX Bean注册器
 **/
@Component
public class GpApplicationMXBeanRegistrar implements ApplicationContextAware, EnvironmentAware, InitializingBean, DisposableBean {

    private ConfigurableApplicationContext applicationContext;

    private Environment                    environment = new StandardEnvironment();

    private final ObjectName               objectName  = new ObjectName("com.gupaoedu.course.actuator:type=SystemInfo");

    public GpApplicationMXBeanRegistrar() throws MalformedObjectNameException {
    }

    @Override
    public void destroy() throws Exception {
        ManagementFactory.getPlatformMBeanServer().unregisterMBean(this.objectName);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        server.registerMBean(new SystemInfo(), this.objectName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = (ConfigurableApplicationContext) applicationContext;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
