package com.mld.springboot10datasource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mld.springboot10datasource.bean.User;

import java.util.List;

//@Mapper
public interface UserMapper extends BaseMapper<User> {

    User selectUserById(Integer id);

    List<User> selectUsers();
}
