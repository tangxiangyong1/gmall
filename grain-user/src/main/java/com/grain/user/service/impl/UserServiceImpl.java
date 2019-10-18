package com.grain.user.service.impl;


import com.grain.bean.UmsMember;
import com.grain.bean.UmsMemberReceiveAddress;
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
    public List<UmsMember> getAllUser() {
        return null;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return null;
    }
}
