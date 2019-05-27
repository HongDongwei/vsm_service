package com.vsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.vsm.dao")
@EnableTransactionManagement
public class VsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(VsmApplication.class, args);
	}

}
