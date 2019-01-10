package cn.itsource.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class service_8001 {
    public static void main(String[] args) {
        SpringApplication.run(service_8001.class);
    }
}
