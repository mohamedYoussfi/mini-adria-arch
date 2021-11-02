package com.adria.contratservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.adria.contratservice","com.adria.commonapi"})
public class ContratServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContratServiceApplication.class, args);
    }

}
