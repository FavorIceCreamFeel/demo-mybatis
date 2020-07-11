package com.mybatis.demomybatis.service;

import com.mybatis.demomybatis.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author smxr
 * @date 2020/7/8
 * @time 15:27
 */
public interface UserService {
    List<User> selectUserAll();
    User selectUserById(String phoneNumber);
    Map<String,User> selectUserMapAll();
    Map<String,User> selectUserMapById(String phoneNumber);
    User selectUserByNameOrPhoneNumber(User user);
    boolean updateUser(User user);
}
