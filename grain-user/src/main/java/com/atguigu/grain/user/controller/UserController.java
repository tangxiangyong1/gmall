package com.atguigu.grain.user.controller;

import com.atguigu.grain.user.bean.UserBean;
import com.atguigu.grain.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("getallUser")
    public List<UserBean> getallUser(){
        List<UserBean> userBeans = userService.getallUser();
return  userBeans;
    }
}
