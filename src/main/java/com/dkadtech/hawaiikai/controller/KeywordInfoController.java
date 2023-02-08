package com.dkadtech.hawaiikai.controller;

import com.dkadtech.hawaiikai.domain.KeywordInfo;
import com.dkadtech.hawaiikai.service.KeywordInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/keyword")
@RestController
public class KeywordInfoController {

    private final KeywordInfoService keywordInfoService;
    @GetMapping("/list")
    public List<KeywordInfo> getKeywordInfoList() {
        return keywordInfoService.getKeywordInfoList();
    }
}
