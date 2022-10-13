package com.gupao.course.spi;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public class MysqlDriver implements DataBaseDriver {
    @Override
    public String buildConnect(String s) {
        return "Mysql的驱动实现:" + s;
    }
}
