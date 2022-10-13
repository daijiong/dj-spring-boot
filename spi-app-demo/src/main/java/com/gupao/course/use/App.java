package com.gupao.course.use;

import java.util.ServiceLoader;

import com.gupao.course.spi.DataBaseDriver;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ServiceLoader<DataBaseDriver> serviceLoader = ServiceLoader.load(DataBaseDriver.class);
        for (DataBaseDriver dataBaseDriver : serviceLoader) {
            System.out.println(dataBaseDriver.buildConnect("Test"));
        }
    }
}
