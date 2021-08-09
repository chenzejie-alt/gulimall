package com.chenzejie.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-10 0:05
 * @Modified By:
 */
@SpringBootApplication
@MapperScan("com.chenzejie.gulimall.member.dao")
public class GulimallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }
}
