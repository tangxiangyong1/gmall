package com.atguigu.grain.user.service.impl;

import com.atguigu.grain.user.bean.UserBean;
import com.atguigu.grain.user.mapper.UserMapper;
import com.atguigu.grain.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<UserBean> getallUser() {

        return userMapper.getallUser();
}
}
