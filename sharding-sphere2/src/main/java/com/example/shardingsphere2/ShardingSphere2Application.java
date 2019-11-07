package com.example.shardingsphere2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.shardingsphere2.mapper")
@SpringBootApplication
public class ShardingSphere2Application {

	public static void main(String[] args) {
		SpringApplication.run(ShardingSphere2Application.class, args);
	}

}
