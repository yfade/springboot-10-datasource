package com.mld.springboot10datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mld.springboot10datasource.mapper")
@SpringBootApplication
public class Springboot10DatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot10DatasourceApplication.class, args);
    }

}
