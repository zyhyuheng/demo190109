package com.example.demo190109.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autuor zhaoyh
 * @data 2019/1/9 11:33
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @GetMapping
    public String index(){
        return "Hello Word";
    }
}
