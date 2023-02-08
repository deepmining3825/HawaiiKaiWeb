package com.dkadtech.hawaiikai.controller;

import com.dkadtech.hawaiikai.domain.UserInfo;
import com.dkadtech.hawaiikai.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
@RestController
public class UserInfoController {

    private final UserInfoService userInfoService;

    @GetMapping("/list")
    public List<UserInfo> getUserInfoList() {
        return userInfoService.getUserInfoList();
    }
}
