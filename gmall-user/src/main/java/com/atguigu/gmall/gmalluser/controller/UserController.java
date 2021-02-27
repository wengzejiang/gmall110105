package com.atguigu.gmall.gmalluser.controller;

import com.atguigu.gmall.gmalluser.bean.UmsMember;
import com.atguigu.gmall.gmalluser.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.gmalluser.service.UmsMemberReceiveAddressService;
import com.atguigu.gmall.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @ResponseBody
    @RequestMapping("index")
    public String index() {
        return "hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public List<UmsMember> updateUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("insertUser")
    @ResponseBody
    public void insertUser(String id,String name,String phoneNumber) {
        userService.insertUser(id,name,phoneNumber);
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressServiceIdUser = umsMemberReceiveAddressService.getIdUser(memberId);
        return umsMemberReceiveAddressServiceIdUser;
    }

    @RequestMapping("getReceiveAddressByMember")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMember() {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressServiceIdUser = umsMemberReceiveAddressService.getMember();
        return umsMemberReceiveAddressServiceIdUser;
    }
}
