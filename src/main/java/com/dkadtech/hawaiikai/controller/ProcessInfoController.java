package com.dkadtech.hawaiikai.controller;

import com.dkadtech.hawaiikai.domain.ProcessInfo;
import com.dkadtech.hawaiikai.service.ProcessInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/process")
@RestController
public class ProcessInfoController {

    private final ProcessInfoService processInfoService;
    @GetMapping("/list")
    public List<ProcessInfo> getProcessInfoList() {
        return processInfoService.getProcessInfoList();
    }
}
