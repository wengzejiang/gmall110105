package com.atguigu.gmall.gmalluser.service;

import com.atguigu.gmall.gmalluser.bean.UmsMember;
import com.atguigu.gmall.gmalluser.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    void insertUser(String id, String name, String phoneNumber);
}
