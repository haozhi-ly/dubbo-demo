package com.dubbo.consumer.web;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.UserService;


/**
 * Created by YYT on 2017/7/3.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.sayHello("ly"));  
    }
}
