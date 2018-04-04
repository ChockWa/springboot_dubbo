package com.beauty.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.beauty.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    public String get() {
        return "UserService";
    }
}
