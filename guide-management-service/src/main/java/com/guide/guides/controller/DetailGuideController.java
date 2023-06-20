package com.guide.guides.controller;

import com.guide.guides.dto.DetailGuideRequest;
import com.guide.guides.dto.DetailGuideResponse;
import com.guide.guides.service.DetailGuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detail-guides")
public class DetailGuideController {

    @Autowired
    private DetailGuideService detailGuideService;

    @GetMapping
    private ResponseEntity<List<DetailGuideResponse>> getAll() {
        var response = detailGuideService.getAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/guide/{id}")
    private ResponseEntity<List<DetailGuideResponse>> getAllByGuideId(@PathVariable("id") Long id) {
        var response = detailGuideService.getAllByGuideId(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<DetailGuideResponse> getById(@PathVariable("id") Long id) {
        var response = detailGuideService.getById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<DetailGuideResponse> create(@RequestBody DetailGuideRequest request) {
        var response = detailGuideService.create(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping
    private ResponseEntity<DetailGuideResponse> update(@RequestBody DetailGuideRequest request, Long id) {
        var response = detailGuideService.update(request, id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping
    private ResponseEntity<?> delete(Long id) {
        detailGuideService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
