package com.chenzejie.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-09 23:58
 * @Modified By:
 */

/**
 * 1.如何使用Nacos作为配置中心，统一管理配置？
 * （1）引入依赖
 *      <dependency>
 *          <groupId>com.alibaba.cloud</groupId>
 *          <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *      </dependency>
 * （2）创建一个bootstrap.properties配置文件
 * spring.application.name=gulimall-coupon
 * spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * （3）需要给配置中心添加一个默认叫 数据集（Data Id）gulimall-coupon.properties。默认规则：应用名.properties
 * （4）给应用名.properties添加任何配置
 * （5）动态获取配置
 *      @RefreshScope：动态获取并刷新配置
 *      @Value("${配置项的名}")：获取到配置
 * 如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 *  2.细节
 *  （1）命名空间：配置隔离；
 *  默认的命名空间是：public（保留空间），默认新增的所有配置都在public空间。
 *  一、开发，测试，生产各个环境之间互相隔离配置：利用命名空间来做环境配置
 *  注意：在bootstrap.properties配置上需要使用哪个命名空间下的配置。
 *  spring.cloud.nacos.config.namespace=3d9cb52d-ff79-4fda-b8d3-e3b6eee1411b
 *  二、每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *  （2）配置集：所有的配置的集合
 *  （3）配置集ID：类似文件名
 *  Data ID：类似文件名
 *  （4）配置分组：
 *  默认的配置集都属于：DEFAULT_GROUP；每个命名空间可以定义自己的配置分组，例如：
 *  1111,618,1212,等等
 *  在这个项目中，每个微服务创建自己的命名空间，每个命名空间再使用配置分组区分环境（dev环境，test环境，prod环境）
 * 3.同时加载多个配置集
 *（1）微服务任何配置信息，任何配置文件都可以放在配置中心中；
 *（2）只需要在bootstrap.properties说明加载配置中心中哪些配置文件即可。
 *（3）@Value，@ConfigurationProperties
 * 以前springboot任何方式从配置文件中获取值，都能使用。
 * 配置中心有的有先使用配置中心的值。
 *
 *
 */
@SpringBootApplication
@MapperScan("com.chenzejie.gulimall.coupon.dao")
@EnableDiscoveryClient
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }
}
