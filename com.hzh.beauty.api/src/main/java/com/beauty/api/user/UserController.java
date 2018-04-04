package com.beauty.api.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.beauty.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public String getUser(){
        return userService.get();
    }
}
