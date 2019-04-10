package com.wrh.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2019/3/26 15:56
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello,"+name+",this is two message";
    }
}
