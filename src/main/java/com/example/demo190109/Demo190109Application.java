package com.example.demo190109;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class}) 禁用SpringSecurity自带的登录验证
public class Demo190109Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo190109Application.class, args);
    }

}

