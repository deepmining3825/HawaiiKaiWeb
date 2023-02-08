package com.dkadtech.hawaiikai.service;

import com.dkadtech.hawaiikai.domain.SettingInfo;
import com.dkadtech.hawaiikai.mapper.SettingInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SettingInfoService {

    private final SettingInfoMapper settingInfoMapper;

    public List<SettingInfo> getSettingInfoList() {
        return settingInfoMapper.getSettingInfoList();
    }
}
