package com.example.demo190109.controller.sys;

import com.example.demo190109.entity.sys.UserEntity;
import com.example.demo190109.repository.sys.UserRepository;
import com.example.demo190109.service.sys.CustomUserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autuor zhaoyh
 * @data 2019/1/14 14:42
 */
@RestController
@Slf4j
public class RegisterController {
    @Autowired
    private CustomUserServiceImpl customUserService;
    @RequestMapping(value = "reg",method = RequestMethod.GET)
    public String register(@RequestParam("userName")String userName,@RequestParam("password")String password){
        boolean a=customUserService.registerUser(userName,password);
        if (!a)return "reg";
        return "login";
    }
}
