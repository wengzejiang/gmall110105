package com.atguigu.gmall.gmalluser.service.impl;



import com.atguigu.gmall.gmalluser.bean.UmsMember;
import com.atguigu.gmall.gmalluser.mapper.UserMapper;
import com.atguigu.gmall.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;



    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList =userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public void insertUser(String id, String name, String phoneNumber) {
        userMapper.insertUserid(id,name,phoneNumber);
    }

    @Override
    public void updateUser(UmsMember userMappers) {
        userMapper.updateUserId(userMappers);
    }

    @Override
    public void deleteUser(String id) {
        userMapper.deleteUserId(id);
    }



}
