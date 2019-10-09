package com.atguigu.grain.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.grain.user.mapper")
public class GrainUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainUserApplication.class, args);
    }

}
