package com.dkadtech.hawaiikai.controller;

import com.dkadtech.hawaiikai.domain.NaverAccountInfo;
import com.dkadtech.hawaiikai.service.NaverAccountInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/naver-account")
@RestController
public class NaverAccountInfoController {

    private final NaverAccountInfoService naverAccountInfoService;
    @GetMapping("/list")
    public List<NaverAccountInfo> getNaverAccountInfoList() {
        return naverAccountInfoService.getNaverAccountInfoList();
    }
}
