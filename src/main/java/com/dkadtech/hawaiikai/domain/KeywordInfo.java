package com.dkadtech.hawaiikai.domain;

import lombok.Data;

@Data
public class KeywordInfo {

    private Integer keywordInfoId;

    private String keyword;

    private String placeAddress;

    private String placeName;

    private Integer processInfoId;
}
