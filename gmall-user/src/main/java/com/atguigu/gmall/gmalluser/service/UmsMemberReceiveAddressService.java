package com.atguigu.gmall.gmalluser.service;

import com.atguigu.gmall.gmalluser.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getIdUser(String memberId);

    List<UmsMemberReceiveAddress> getMember();
}
