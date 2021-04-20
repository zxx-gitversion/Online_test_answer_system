package com.zxd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String Test(){
        System.out.printf("进入了控制层");
        return "哈哈哈";
    }
}
