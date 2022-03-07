package com.lang.fegin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Raye on 2017/5/22.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class FeginClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginClientApplication.class, args);
    }

}
