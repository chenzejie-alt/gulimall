package com.chenzejie.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-10 0:14
 * @Modified By:
 */
@SpringBootApplication
@MapperScan("com.chenzejie.gulimall.order.dao")
public class GulimallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }
}
