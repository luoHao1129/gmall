package com.zg.gmall.user.service.impl;

import com.zg.gmall.user.bean.UmsMember;
import com.zg.gmall.user.mapper.UserMapper;
import com.zg.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> UmsMemberList = userMapper.selectAllUser();
        return UmsMemberList;
    }
}
