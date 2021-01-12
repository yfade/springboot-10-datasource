package com.mld.springboot10datasource.controller;

import com.mld.springboot10datasource.bean.User;
import com.mld.springboot10datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/testCount")
    public Long testCount(){
        Long count = jdbcTemplate.queryForObject("select count(1) from user", Long.class);
        return count;
    }

    @ResponseBody
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.selectUserById(id);
    }


    @ResponseBody
    @GetMapping("/selectUsers")
    public List<User> selectUsers(){

        return userService.selectUsers();
    }
}
