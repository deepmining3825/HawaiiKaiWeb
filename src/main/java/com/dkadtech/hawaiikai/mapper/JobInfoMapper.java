package com.dkadtech.hawaiikai.mapper;

import com.dkadtech.hawaiikai.domain.JobInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobInfoMapper {

    List<JobInfo> getJobInfoList();
}
