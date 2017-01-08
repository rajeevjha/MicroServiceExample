package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/*
 * As long as Spring Cloud Bus AMQP and RabbitMQ are on the classpath any Spring Boot application will try to contact a RabbitMQ 
 * server on localhost:5672 (the default value of spring.rabbitmq.addresses)
 */
@SpringBootApplication
@EnableConfigServer 
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
