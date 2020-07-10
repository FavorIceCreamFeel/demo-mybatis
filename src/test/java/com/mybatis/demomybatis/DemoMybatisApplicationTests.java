package com.mybatis.demomybatis;

import com.mybatis.demomybatis.pojo.User;
import com.mybatis.demomybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoMybatisApplicationTests {
    private static final Logger logger= LoggerFactory.getLogger(DemoMybatisApplication.class);
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        userService.selectUserAll().forEach(System.out::println);
        System.out.println();
        User user = userService.selectUserById("17513234584");
        System.out.println(user.toString());
        Map<String, User> stringUserMap = userService.selectUserMapAll();
        System.out.println();
        for (Map.Entry<String, User> stringUserEntry : stringUserMap.entrySet()) {
            System.out.println("key: "+stringUserEntry.getKey()+"  value: "+stringUserEntry.getValue());
        }
        System.out.println();
        Map<String, User> userMap = userService.selectUserMapById("17513234584");
        System.out.println(userMap.toString());
    }
    @Test
    void contextLoadingSQL(){

    }
}
