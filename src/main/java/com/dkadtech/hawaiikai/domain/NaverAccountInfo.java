package com.dkadtech.hawaiikai.domain;

import lombok.Data;

@Data
public class NaverAccountInfo {

    private Integer naverAccountInfoId;

    private String naverId;

    private String naverPw;

    private char realNameAccountYn;

    private Integer processInfoId;
}
