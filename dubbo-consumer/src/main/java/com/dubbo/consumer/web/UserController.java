package com.dubbo.consumer.web;

import com.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YYT on 2017/7/3.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userServiceOne;

    @RequestMapping("/hello.html")
    @ResponseBody
    public String sayHello(String name) {
        String welcome = userServiceOne.sayHello(name);
        return welcome;
    }
}
