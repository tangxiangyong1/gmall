package com.grain.user.service.impl;


import com.grain.bean.UmsMember;
import com.grain.user.mapper.UserMapper;
import com.grain.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<UmsMember> getallUser() {

        return userMapper.getallUser();
}
}
