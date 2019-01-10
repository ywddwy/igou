package cn.itsource.zuul_gateway_9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class zuul_gateway_9527 {
    public static void main(String[] args) {
        SpringApplication.run(zuul_gateway_9527.class);
    }
}
