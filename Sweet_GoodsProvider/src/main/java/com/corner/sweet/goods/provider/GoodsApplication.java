package com.corner.sweet.goods.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: SweetMeats
 * @DESCRIPTION:
 * @USER: Ming
 * @DATE: 2020/2/3 9:14:51
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.corner.sweet.goods.provider.dao")
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
