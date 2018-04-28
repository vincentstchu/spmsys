package com.ujs.spmsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan("com.ujs.spmsys.dao")
public class SpmsysApplication extends SpringBootServletInitializer {
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(SpmsysApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpmsysApplication.class, args);
	}
}
