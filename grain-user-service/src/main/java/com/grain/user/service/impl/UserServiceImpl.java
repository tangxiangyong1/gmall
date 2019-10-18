package com.grain.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.grain.bean.UmsMember;
import com.grain.bean.UmsMemberReceiveAddress;
import com.grain.service.UserService;
import com.grain.user.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;


    public List<UmsMember> getallUser() {

        return userMapper.getallUser();


}

    @Override
    public List<UmsMember> getAllUser() {
        return null;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return null;
    }
}
