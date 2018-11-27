package com.techprimers.db.springbootmys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@EnableAutoConfiguration

@EnableJpaRepositories(basePackages = "com.techprimers.db")
public class SpringBootMysApplication {


public static void main(String[] args) {
	SpringApplication.run(SpringBootMysApplication.class, args);
}
}