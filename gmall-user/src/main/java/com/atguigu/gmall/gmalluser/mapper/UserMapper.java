package com.atguigu.gmall.gmalluser.mapper;

import com.atguigu.gmall.gmalluser.bean.UmsMember;

import java.util.List;

public interface UserMapper {
    List<UmsMember> selectAllUser();

    void insertUserid(String id, String name, String phoneNumber);

    void deleteUserId(String id);

    void updateUserId(UmsMember userMappers);
}
