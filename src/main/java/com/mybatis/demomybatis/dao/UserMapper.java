package com.mybatis.demomybatis.dao;

import com.mybatis.demomybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author smxr
 * @date 2020/7/8
 * @time 15:22
 */
@Mapper
public interface UserMapper {
//    @Select("select *from user;")
    List<User> selectUserAll();
    User selectUserById(String phoneNumber);
    @MapKey("phoneNumber")
    Map<String,User> selectUserMapAll();
    @MapKey("phoneNumber")
    Map<String,User> selectUserMapById(String phoneNumber);
    User selectUserByNameOrPhoneNumber(User user);
    boolean updateUser(User user);
}
