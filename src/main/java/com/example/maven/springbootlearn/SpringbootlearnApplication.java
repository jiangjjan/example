package com.example.maven.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableAspectJAutoProxy
@SpringBootApplication
@EnableRedisRepositories(basePackages = {"com.example.maven.springbootlearn.redis_demo"})
public class SpringbootlearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootlearnApplication.class, args);
	}

}