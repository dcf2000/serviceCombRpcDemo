package com.s.service.impl;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Administrator
 * @Date 2020/6/8 0008 下午 8:10
 * @Version 1.0
 */
@SpringBootApplication
@EnableServiceComb
public class RpcProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(RpcProviderApp.class, args);
    }
}
