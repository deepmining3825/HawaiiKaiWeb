package com.dkadtech.hawaiikai.mapper;

import com.dkadtech.hawaiikai.domain.SettingInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SettingInfoMapper {

    List<SettingInfo> getSettingInfoList();
}
