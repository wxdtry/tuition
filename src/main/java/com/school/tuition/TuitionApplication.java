package com.school.tuition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.school.tuition.dao")
@SpringBootApplication
public class TuitionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuitionApplication.class, args);
    }

}
