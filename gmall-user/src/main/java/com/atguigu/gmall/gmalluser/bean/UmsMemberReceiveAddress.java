package com.atguigu.gmall.gmalluser.bean;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UmsMemberReceiveAddress {

    private String id;
    private String memberId;
    private String name;
    private String phoneNumber;
    private int defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;
}
