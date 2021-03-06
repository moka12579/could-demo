package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @EnableHystrix 开启断路器
 */
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class OrderAppRun {
    public static void main(String[] args) {
        SpringApplication.run(OrderAppRun.class,args);
    }
}
