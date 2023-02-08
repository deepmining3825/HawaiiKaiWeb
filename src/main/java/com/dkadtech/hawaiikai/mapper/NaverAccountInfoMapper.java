package com.dkadtech.hawaiikai.mapper;

import com.dkadtech.hawaiikai.domain.NaverAccountInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NaverAccountInfoMapper {

    List<NaverAccountInfo> getNaverAccountInfoList();
}
