package com.wanrh.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2019/3/28 15:28
 */
@RestController
public class HelloController {

    @Value("${wanrh.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String hello(){
        return this.hello;
    }

}
