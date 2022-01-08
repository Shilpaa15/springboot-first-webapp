package com.mtree.springboot.springbootfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mtree.springboot.springbootfirstwebapp")
public class SpringbootFirstWebappApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstWebappApplication.class, args);
	}
}
