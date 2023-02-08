package com.dkadtech.hawaiikai.controller;

import com.dkadtech.hawaiikai.domain.SettingInfo;
import com.dkadtech.hawaiikai.service.SettingInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/setting")
@RestController
public class SettingInfoController {

    private final SettingInfoService settingInfoService;
    @GetMapping("/list")
    public List<SettingInfo> getSettingInfoList() {
        return settingInfoService.getSettingInfoList();
    }
}
