package com.dkadtech.hawaiikai.service;

import com.dkadtech.hawaiikai.domain.ProcessInfo;
import com.dkadtech.hawaiikai.mapper.ProcessInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProcessInfoService {

    private final ProcessInfoMapper processInfoMapper;

    public List<ProcessInfo> getProcessInfoList() {
        return processInfoMapper.getProcessInfoList();
    }
}
