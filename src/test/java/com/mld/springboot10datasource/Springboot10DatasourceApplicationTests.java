package com.mld.springboot10datasource;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;


@Slf4j
@SpringBootTest
class Springboot10DatasourceApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        Long count = jdbcTemplate.queryForObject("select count(1) from user", Long.class);
        System.out.println("count=" + count);
        System.out.println(jdbcTemplate.getDataSource().getClass());
    }

}
