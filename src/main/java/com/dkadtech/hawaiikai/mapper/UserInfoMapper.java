package com.dkadtech.hawaiikai.mapper;

import com.dkadtech.hawaiikai.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserInfoMapper {
    List<UserInfo> getUserInfoList();
}
