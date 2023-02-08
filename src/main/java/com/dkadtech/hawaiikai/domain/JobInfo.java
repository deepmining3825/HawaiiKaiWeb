package com.dkadtech.hawaiikai.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class JobInfo {

    private Integer jobInfoId;

    private String keyword;

    private String placeName;

    private Timestamp registerDate;

    private Integer processInfoId;
}
