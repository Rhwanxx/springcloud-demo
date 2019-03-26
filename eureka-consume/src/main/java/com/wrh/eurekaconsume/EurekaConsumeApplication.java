package com.wrh.eurekaconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient//启用服务注册与发现
@EnableFeignClients//启用feign远程调用
@SpringBootApplication
public class EurekaConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumeApplication.class, args);
    }

}
