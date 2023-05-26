package com.coach.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

// Exception
@Data
@AllArgsConstructor
public class ResourceNotFoundException {
    private final String message;
    private final HttpStatus status;
}
