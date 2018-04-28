package com.zc.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SpringbootStaticSourcesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStaticSourcesApplication.class, args);
	}
}
