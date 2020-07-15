package com.mybatis.demomybatis;

import com.mybatis.demomybatis.pojo.User;
import com.mybatis.demomybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.util.logging.resources.logging;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.SimpleFormatter;

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
        User user=new User();
//        User user2 = userService.selectUserByNameOrPhoneNumber(user);
//        logger.info("动态SQL: 空实体类查询"+user2.toString());
        user.setPhoneNumber("17513234581");
        User user1 = userService.selectUserByNameOrPhoneNumber(user);
        logger.info("动态SQL: 根据手机号查询"+user1.toString());
//        user.setPhoneNumber(null);//属性值可以为null 但不可以为“”
//        user.setPhoneNumber("");//属性值可以为null 但不可以为“”
        user.setUserName("root");
        User user3 = userService.selectUserByNameOrPhoneNumber(user);
        logger.info("动态SQL: 根据用户名查询"+user3.toString());
        user.setUserSex("男");
        user.setAddress("火锅大道");
        user.setUserName(null);
        boolean boo = userService.updateUser(user);
        logger.info("动态SQL: 根据实体类更新"+boo);
        User user2 = userService.selectUserByChoose(user);
        logger.info("动态SQL: 动态choose查询"+user2.toString());
    }
    @Test
    void contextLoadingSQL2(){
        User user=new User();
//        User user2 = userService.selectUserByNameOrPhoneNumber(user);
//        logger.info("动态SQL: 空实体类查询"+user2.toString());
//        user.setPhoneNumber("17513234581");
//        user.setPhoneNumber(null);//属性值可以为null 但不可以为“”
//        user.setPhoneNumber("");//属性值可以为null 但不可以为“”
//        user.setUserName("root");
        user.setUserSex("男");
        user.setAddress("火锅大道");
        User user2 = userService.selectUserByChoose(user);
        logger.info("动态SQL: 动态choose查询"+user2.toString());
    }

    @Test
    void contextLoadingDate(){
        LocalDate now = LocalDate.now();
        logger.info("当前时间："+now.toString());
        Instant now1 = Instant.now();
        logger.info("当前时间戳："+now1.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        logger.info("old 时间："+format);
        long l = System.currentTimeMillis();
        logger.info("old 时间戳："+l);

        LocalDateTime now2 = LocalDateTime.now();
        logger.info("LocalDateTime："+now2.toString());
    }
}
