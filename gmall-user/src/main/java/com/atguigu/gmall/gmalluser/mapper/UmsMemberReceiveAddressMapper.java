package com.atguigu.gmall.gmalluser.mapper;

import com.atguigu.gmall.gmalluser.bean.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberReceiveAddressMapper {

    List<UmsMemberReceiveAddress> getMemberId(@Param("memberId") String memberId);

    List<UmsMemberReceiveAddress> selectMember();

}
