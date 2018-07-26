package com.xuexiang.xupdateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.xuexiang.xupdateservice.mapper")
public class XUpdateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XUpdateServiceApplication.class, args);
	}
}
