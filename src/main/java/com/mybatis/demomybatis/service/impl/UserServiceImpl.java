package com.mybatis.demomybatis.service.impl;

import com.mybatis.demomybatis.dao.UserMapper;
import com.mybatis.demomybatis.pojo.User;
import com.mybatis.demomybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author smxr
 * @date 2020/7/8
 * @time 15:32
 */
@Service
public class UserServiceImpl implements UserService{
    private static final Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectUserAll() {
        logger.info("注解方式执行");
        return userMapper.selectUserAll();
    }

    @Override
    public User selectUserById(String phoneNumber) {
        logger.info("Mapper方式执行");
        return userMapper.selectUserById(phoneNumber);
    }

    @Override
    public Map<String, User> selectUserMapAll() {
        return userMapper.selectUserMapAll();
    }

    @Override
    public Map<String, User> selectUserMapById(String phoneNumber) {
        return userMapper.selectUserMapById(phoneNumber);
    }

    @Override
    public User selectUserByNameOrPhoneNumber(User user) {
        return userMapper.selectUserByNameOrPhoneNumber(user);
    }
}
