package com.dkadtech.hawaiikai.domain;

import lombok.Data;

@Data
public class UserInfo {

    private Integer userInfoId;

    private String userId;

    private String userPw;

    private String pushAlarmAddress;
}
