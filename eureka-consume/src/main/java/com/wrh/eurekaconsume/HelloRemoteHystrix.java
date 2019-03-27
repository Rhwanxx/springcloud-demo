package com.wrh.eurekaconsume;

import org.springframework.stereotype.Component;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2019/3/27 15:06
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello,"+name+"this message send failed";
    }
}
