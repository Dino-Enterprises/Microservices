package com.coachingsession.coaching_session.service.impl;

import com.coachingsession.coaching_session.dto.PlatformRequest;
import com.coachingsession.coaching_session.dto.PlatformResponse;
import com.coachingsession.coaching_session.dto.SessionResponse;
import com.coachingsession.coaching_session.entity.Platform;
import com.coachingsession.coaching_session.entity.Session;
import com.coachingsession.coaching_session.repository.PlatformRepository;
import com.coachingsession.coaching_session.repository.SessionRepository;
import com.coachingsession.coaching_session.service.PlatformService;
import com.coachingsession.exception.ResourceNotFoundExceptionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlatformServiceImpl implements PlatformService {

    @Autowired
    private PlatformRepository platformRepository;

    @Autowired
    private SessionRepository sessionRepository;

    private SessionResponse convertSessionToResponse(Session entity) {
        SessionResponse response = new SessionResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setEndDate(entity.getEndDate());
        response.setStartDate(entity.getStartDate());
        response.setAvailable(entity.getAvailable());
        return response;
    }

    private PlatformResponse convertToResponse(Platform entity) {
        PlatformResponse response = new PlatformResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setUrl(entity.getUrl());
        response.setSession_id(entity.getSession().getId());
        response.setSession(convertSessionToResponse(entity.getSession()));
        return response;
    }

    private Platform convertToEntity(PlatformRequest request) {
        Platform platform = new Platform();
        platform.setUrl(request.getUrl());
        platform.setName(request.getName());
        return platform;
    }

    @Override
    public List<PlatformResponse> getAll() {
        var entities = platformRepository.findAll();
        return entities.stream().map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    /*@Override
    public List<PlatformResponse> getAllBySessionId(Long id) {
        var entities = platformRepository.findAllBySessionId(id);
        return entities.stream().map(this::convertToResponse)
                .collect(Collectors.toList());
    }*/

    @Override
    public PlatformResponse getById(Long id) {
        var entity = platformRepository.getPlatformById(id)
                .orElseThrow(() -> new ResourceNotFoundExceptionRequest("Platform not found"));
        return convertToResponse(entity);
    }

    @Override
    public PlatformResponse create(PlatformRequest platformRequest) {
        var entity = new Platform();
        var session = sessionRepository.getSessionById(platformRequest.getSession_id())
                .orElseThrow(() -> new ResourceNotFoundExceptionRequest("Session not found"));

        entity = convertToEntity(platformRequest);
        entity.setSession(session);

        try {
            platformRepository.save(entity);
            return convertToResponse(entity);
        } catch (Exception e) {
            throw new ResourceNotFoundExceptionRequest("Error occurred while creating platform");
        }
    }

    @Override
    public PlatformResponse update(PlatformRequest platformRequest, Long id) {
        var entity = platformRepository.getPlatformById(id)
                .orElseThrow(() -> new ResourceNotFoundExceptionRequest("Platform not found"));
        var session = sessionRepository.getSessionById(platformRequest.getSession_id())
                .orElseThrow(() -> new ResourceNotFoundExceptionRequest("Session not found"));

        entity = convertToEntity(platformRequest);
        entity.setSession(session);

        try {
            platformRepository.save(entity);
            return convertToResponse(entity);
        } catch (Exception e) {
            throw new ResourceNotFoundExceptionRequest("Error occurred while creating platform");
        }
    }

    @Override
    public void delete(Long id) {
        try {
            platformRepository.deleteById(id);
        } catch (Exception e) {
            throw new ResourceNotFoundExceptionRequest("Error occurred while deleting platform");
        }
    }
}
