package com.dkadtech.hawaiikai.mapper;

import com.dkadtech.hawaiikai.domain.DeviceInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceInfoMapper {

    List<DeviceInfo> getDeviceInfoList();
}
