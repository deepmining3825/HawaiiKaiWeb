package com.dkadtech.hawaiikai.mapper;

import com.dkadtech.hawaiikai.domain.ProcessInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProcessInfoMapper {

    List<ProcessInfo> getProcessInfoList();
}
