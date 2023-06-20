package com.guide.guides.dto;

import lombok.Data;

import javax.persistence.Lob;

@Data
public class DetailGuideRequest {
    private String name;

    @Lob
    private String videoUrl;

    private Long position;

    private Long guideId;
}
