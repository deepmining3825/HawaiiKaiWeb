package com.dkadtech.hawaiikai.service;

import com.dkadtech.hawaiikai.domain.NaverAccountInfo;
import com.dkadtech.hawaiikai.mapper.NaverAccountInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NaverAccountInfoService {

    private final NaverAccountInfoMapper naverAccountInfoMapper;

    public List<NaverAccountInfo> getNaverAccountInfoList() {
        return naverAccountInfoMapper.getNaverAccountInfoList();
    }
}
