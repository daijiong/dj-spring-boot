package com.gupaoedu.course.mybatis.services.impl;

import com.gupaoedu.course.mybatis.dao.entity.User;
import com.gupaoedu.course.mybatis.dao.mappers.UserMapper;
import com.gupaoedu.course.mybatis.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;  //代理对象

    @Override
    public int insert(User user) {
        //TODO 业务逻辑
        return userMapper.insert(user);
    }
}
