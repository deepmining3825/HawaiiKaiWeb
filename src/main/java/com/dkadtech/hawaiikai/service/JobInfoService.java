package com.dkadtech.hawaiikai.service;

import com.dkadtech.hawaiikai.domain.JobInfo;
import com.dkadtech.hawaiikai.mapper.JobInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobInfoService {

    private final JobInfoMapper jobInfoMapper;

    public List<JobInfo> getJobInfoList() {
        return jobInfoMapper.getJobInfoList();
    }
}
