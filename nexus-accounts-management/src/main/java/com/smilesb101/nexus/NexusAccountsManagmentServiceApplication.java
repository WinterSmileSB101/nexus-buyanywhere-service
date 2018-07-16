package com.smilesb101.nexus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@SpringBootApplication
public class NexusAccountsManagmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexusAccountsManagmentServiceApplication.class, args);
    }
}
