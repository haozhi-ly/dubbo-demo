package com.test;

import com.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-consumer.xml")
public class Test {
    @Autowired
    private UserService userServiceOne;

    @Autowired
    private UserService userServiceTwo;

    @org.junit.Test
    public void consumerTest(){
        System.out.println(userServiceOne.sayHello("ly"));
        System.out.println(userServiceTwo.sayHello("ly"));
    }

}
