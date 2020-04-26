package com.wlq.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author wuliuqing
 * @date 2020/4/26 17:46
 **/
@EnableAutoConfiguration
public class DubboZkConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboZkConsumerApplication.class, args);
    }
}
