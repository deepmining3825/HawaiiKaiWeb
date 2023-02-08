package com.dkadtech.hawaiikai.service;

import com.dkadtech.hawaiikai.domain.KeywordInfo;
import com.dkadtech.hawaiikai.mapper.KeywordInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class KeywordInfoService {

    private final KeywordInfoMapper keywordInfoMapper;

    public List<KeywordInfo> getKeywordInfoList() {
        return keywordInfoMapper.getKeywordInfoList();
    }
}
