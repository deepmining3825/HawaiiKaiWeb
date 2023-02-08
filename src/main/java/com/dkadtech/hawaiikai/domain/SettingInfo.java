package com.dkadtech.hawaiikai.domain;

import lombok.Data;

@Data
public class SettingInfo {

    private Integer settingInfoId;

    private char timeWeightModeYn;

    private char nonLoginModeYn;

    private int randomWaitStartTime;

    private int randomWaitEndTime;

    private int placeScrollCount;

    private Integer processInfoId;
}
