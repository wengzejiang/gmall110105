package com.atguigu.gmall.gmalluser.service;


import com.atguigu.gmall.gmalluser.bean.UmsMember;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    void insertUser(String id, String name, String phoneNumber);

    void deleteUser(String id);

    void updateUser(UmsMember userMappers);
}
