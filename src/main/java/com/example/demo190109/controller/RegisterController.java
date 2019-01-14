package com.example.demo190109.controller;

import com.example.demo190109.entity.UserEntity;
import com.example.demo190109.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autuor zhaoyh
 * @data 2019/1/14 14:42
 */
@RestController
public class RegisterController {

    @Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String register(@RequestParam("userName")String userName,@RequestParam("password")String password){
        System.out.println("=========="+userName);
        String pwd=new BCryptPasswordEncoder().encode(password);
        UserEntity userEntity = new UserEntity();
        userEntity.setPassword(pwd);
        userEntity.setUsername(userName);
        userRepository.save(userEntity);
        return "login";
    }
}
