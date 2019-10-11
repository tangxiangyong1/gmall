package com.grain.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.bean.UmsMember;
import com.grain.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
    UserService userService;

    @RequestMapping("getallUser")
    @ResponseBody
    public List<UmsMember> getallUser(){
        List<UmsMember> userBeans = userService.getallUser();
return  userBeans;
    }
}
