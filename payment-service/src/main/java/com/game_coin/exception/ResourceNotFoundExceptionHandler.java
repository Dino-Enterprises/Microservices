package com.game_coin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*Esta clase fue creada cuando no se puede encontrar un recurso*/
@ControllerAdvice
public class ResourceNotFoundExceptionHandler {
    @ExceptionHandler(value = { ResourceNotFoundExceptionRequest.class })
    public ResponseEntity<Object> handlerRequestException(ResourceNotFoundExceptionRequest e) {
        ResourceNotFoundException exception = new ResourceNotFoundException(e.getMessage(), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }
}
