package com.chenzejie.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-09 23:58
 * @Modified By:
 */

@SpringBootApplication
@MapperScan("com.chenzejie.gulimall.coupon.dao")
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }
}
