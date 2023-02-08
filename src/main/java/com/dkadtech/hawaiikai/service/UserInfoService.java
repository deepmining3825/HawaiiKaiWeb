package com.dkadtech.hawaiikai.service;

import com.dkadtech.hawaiikai.domain.UserInfo;
import com.dkadtech.hawaiikai.mapper.UserInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserInfoService {

    private final UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfoList() {
        return userInfoMapper.getUserInfoList();
    }
}
