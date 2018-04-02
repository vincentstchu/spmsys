package com.ujs.spmsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@MapperScan("com.ujs.spmsys.dao")
public class SpmsysApplication extends SpringBootServletInitializer {
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(SpmsysApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpmsysApplication.class, args);
	}

	//尝试解决拦获取axios请求失败的问题
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

    public CorsFilter corsFilter() {
        logger.info("==========设置跨域过滤器=========");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",buildConfig());
        return new CorsFilter(source);
    }
}
