package com.chenzejie.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-13 14:14
 * @Modified By:
 */

/**
 * 1.开启服务注册与发现功能（配置nacos的注册中心地址）
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableDiscoveryClient
public class GulimallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallGatewayApplication.class, args);
    }
}
