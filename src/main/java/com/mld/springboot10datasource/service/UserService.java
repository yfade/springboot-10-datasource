package com.mld.springboot10datasource.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mld.springboot10datasource.bean.User;

import java.util.List;

public interface UserService extends IService<User> {
    User selectUserById(Integer id);

    List<User> selectUsers();
}
