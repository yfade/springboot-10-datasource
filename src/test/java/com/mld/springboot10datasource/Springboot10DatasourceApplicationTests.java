package com.mld.springboot10datasource;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;


@Slf4j
@SpringBootTest
class Springboot10DatasourceApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Test
    void contextLoads() {
        Long count = jdbcTemplate.queryForObject("select count(1) from user", Long.class);
        System.out.println("count=" + count);
        System.out.println(jdbcTemplate.getDataSource().getClass());
    }

    @Test
    void testRedis() {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("username", "admin");
        String username = valueOperations.get("username");
        System.out.println(username);
        System.out.println(redisConnectionFactory.getClass());
    }

}
