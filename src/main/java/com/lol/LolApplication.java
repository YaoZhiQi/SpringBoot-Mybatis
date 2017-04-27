package com.lol;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapper 接口类扫描包配置
@MapperScan("com.lol.dao")
public class LolApplication {
	public static void main(String[] args) {
		SpringApplication.run(LolApplication.class, args);
	}
}
