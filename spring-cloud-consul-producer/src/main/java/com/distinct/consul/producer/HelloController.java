package com.distinct.consul.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author markhuang
 * @since 2018/12/19 17:44
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

        return "hello consul";
    }
}
