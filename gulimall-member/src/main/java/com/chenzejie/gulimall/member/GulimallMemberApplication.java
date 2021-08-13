package com.chenzejie.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-10 0:05
 * @Modified By:
 */

/**
 * 1.想要远程调用别的服务
 * （1）引入open-feign
 * （2）编写一个接口，告诉springcloud这个接口需要调用远程服务
 *      声明接口的每一个方法都是调用哪个远程服务的哪个请求：@FeignClient("被远程调用的服务名")
 * （3）开启远程调用功能：@EnableFeignClients("feign所在的包")
 */
@SpringBootApplication
@MapperScan("com.chenzejie.gulimall.member.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.chenzejie.gulimall.member.feign")
public class GulimallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }
}
