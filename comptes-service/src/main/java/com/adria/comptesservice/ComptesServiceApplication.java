package com.adria.comptesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.adria.comptesservice","com.adria.commonapi"})
@EnableFeignClients
public class ComptesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComptesServiceApplication.class, args);
    }

}
