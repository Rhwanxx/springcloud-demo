package com.wrh.eurekaconsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2019/3/26 16:30
 */
@RestController
public class ConsumeController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name){
        return helloRemote.hello(name);
    }

}
