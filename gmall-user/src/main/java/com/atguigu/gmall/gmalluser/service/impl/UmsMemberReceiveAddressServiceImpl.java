package com.atguigu.gmall.gmalluser.service.impl;

import com.atguigu.gmall.gmalluser.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.gmalluser.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.gmalluser.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getIdUser(String memberId) {

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=umsMemberReceiveAddressMapper.getMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @Override
    public List<UmsMemberReceiveAddress> getMember() {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=umsMemberReceiveAddressMapper.selectMember();
        return umsMemberReceiveAddresses;
    }
}
