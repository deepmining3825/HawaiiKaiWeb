package com.dkadtech.hawaiikai.controller;

import com.dkadtech.hawaiikai.domain.JobInfo;
import com.dkadtech.hawaiikai.service.JobInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/job")
@RestController
public class JobInfoController {

    private final JobInfoService jobInfoService;
    @GetMapping("/list")
    public List<JobInfo> getJobInfoList() {
        return jobInfoService.getJobInfoList();
    }
}
