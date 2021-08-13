package com.chenzejie.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-10 0:14
 * @Modified By:
 */
@SpringBootApplication
@MapperScan("com.chenzejie.gulimall.order.dao")
@EnableDiscoveryClient
public class GulimallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }
}
