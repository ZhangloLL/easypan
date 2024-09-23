package com.easypan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhl
 * @date 2024/09/23 22:11
 **/

@RestController
public class test {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
