package com.example.demo5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo5
 * @description:
 * @author: 贾昌创
 * @create: 2021-01-19 17:10
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String info(){

        return "Hello SpringBoot";
    }
}
