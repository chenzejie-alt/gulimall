package com.chenzejie.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-10 0:25
 * @Modified By:
 */
@SpringBootApplication
@MapperScan("com.chenzejie.gulimall.ware.dao")
public class GulimallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplication.class, args);
    }
}
