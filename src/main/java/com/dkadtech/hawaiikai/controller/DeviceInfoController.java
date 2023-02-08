package com.dkadtech.hawaiikai.controller;

import com.dkadtech.hawaiikai.domain.DeviceInfo;
import com.dkadtech.hawaiikai.service.DeviceInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/device")
@RestController
public class DeviceInfoController {

    private final DeviceInfoService deviceInfoService;
    @GetMapping("/list")
    public List<DeviceInfo> getDeviceInfoList() {
        return deviceInfoService.getDeviceInfoList();
    }
}
