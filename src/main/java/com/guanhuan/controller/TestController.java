package com.guanhuan.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "����API", description = "����API")
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/hello")
    public String hello(String name) {
        return "hello "+name;
    }

}
