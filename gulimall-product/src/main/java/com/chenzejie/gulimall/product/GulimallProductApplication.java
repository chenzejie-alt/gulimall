package com.chenzejie.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-09 23:09
 * @Modified By:
 */

/**
 * 1.导入MyBatis-Plus依赖
 * 2.配置：（1）配置数据源：导入数据库，在application.yml配置数据源相关信息
 * （2）配置MyBatis-Plus：使用@MapperScan；告诉MyBatis-Plus，sql映射文件位置
 *
 */
@SpringBootApplication
@MapperScan("com.chenzejie.gulimall.product.dao")
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
