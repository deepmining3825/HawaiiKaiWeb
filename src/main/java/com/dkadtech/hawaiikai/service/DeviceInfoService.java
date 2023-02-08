package com.dkadtech.hawaiikai.service;

import com.dkadtech.hawaiikai.domain.DeviceInfo;
import com.dkadtech.hawaiikai.mapper.DeviceInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeviceInfoService {

    private final DeviceInfoMapper deviceInfoMapper;

    public List<DeviceInfo> getDeviceInfoList() {
        return deviceInfoMapper.getDeviceInfoList();
    }
}
