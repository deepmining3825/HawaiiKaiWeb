package com.dkadtech.hawaiikai.domain;

import lombok.Data;

@Data
public class DeviceInfo {

    private Integer deviceInfoId;

    private String deviceName;

    private String deviceAuthKey;

    private String deviceAddress;

    private Integer userInfoId;
}
