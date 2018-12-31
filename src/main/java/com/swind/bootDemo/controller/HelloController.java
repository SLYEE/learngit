package com.swind.bootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孙立业 on 2018/12/31.
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @RequestMapping(value = "")
    public String hello () {
        return "Hello world";
    }


}
