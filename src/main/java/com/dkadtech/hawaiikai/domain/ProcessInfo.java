package com.dkadtech.hawaiikai.domain;

import lombok.Data;

@Data
public class ProcessInfo {

    private Integer processInfoId;

    private Integer processNum;

    private String processStatus;

    private Integer deviceInfoId;
}
