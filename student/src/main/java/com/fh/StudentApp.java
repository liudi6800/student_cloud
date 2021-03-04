package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient//声明fegin
@EnableHystrix// 熔断器  需要两个注解
@EnableCircuitBreaker
public class StudentApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(StudentApp.class,args);
    }
}
