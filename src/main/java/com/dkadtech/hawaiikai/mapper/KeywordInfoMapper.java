package com.dkadtech.hawaiikai.mapper;

import com.dkadtech.hawaiikai.domain.KeywordInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeywordInfoMapper {

    List<KeywordInfo> getKeywordInfoList();
}
