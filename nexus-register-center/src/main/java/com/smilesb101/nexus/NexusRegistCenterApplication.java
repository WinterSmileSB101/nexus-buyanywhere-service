package com.smilesb101.nexus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NexusRegistCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexusRegistCenterApplication.class, args);
    }
}
