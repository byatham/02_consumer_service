package com.anu.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
public class Application {

	public static void main(String[] args) {

        log.info("consumer application has been started >>>>>");
		log.debug("consumer application has been started >>>>>");
		SpringApplication.run(Application.class, args);
		log.info("consumer application has been ended >>>>>");

	}

}
