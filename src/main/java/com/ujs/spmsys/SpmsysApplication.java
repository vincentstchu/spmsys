package com.ujs.spmsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ujs.spmsys.dao")
public class SpmsysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmsysApplication.class, args);
	}
}
