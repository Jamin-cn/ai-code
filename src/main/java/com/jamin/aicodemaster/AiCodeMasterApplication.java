package com.jamin.aicodemaster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jamin.aicodemaster.mapper")
public class AiCodeMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCodeMasterApplication.class, args);
    }

}
