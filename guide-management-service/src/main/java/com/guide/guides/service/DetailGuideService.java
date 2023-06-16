package com.guide.guides.service;

import com.guide.guides.dto.DetailGuideRequest;
import com.guide.guides.dto.DetailGuideResponse;

import java.util.List;

public interface DetailGuideService {

    List<DetailGuideResponse> getAll();

    List<DetailGuideResponse> getAllByGuideId(Long id);

    DetailGuideResponse getById(Long id);

    DetailGuideResponse create(DetailGuideRequest request);

    DetailGuideResponse update(DetailGuideRequest request, Long id);

    void delete(Long id);
}
