package com.dubbo.provider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by YYT on 2017/7/3.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        //context.start();
        System.err.println("服务已经启动...");
        System.in.read();
    	//InputStream is = new FileInputStream("classpath:dubbo-provider.xml");
    }
}
