package com.grain.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Reference
    UserService userService;

 /*   @RequestMapping("getallUser")
    @ResponseBody
    public List<UmsMember> getallUser(){
        List<UmsMember> userBeans = userService.getallUser();
return  userBeans;
    }*/
}
