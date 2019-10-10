package com.grain.user.controller;

import com.grain.bean.UmsMember;
import com.grain.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("getallUser")
    public List<UmsMember> getallUser(){
        List<UmsMember> userBeans = userService.getallUser();
return  userBeans;
    }
}
