package com.game_coin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*Esta clase fue creada cuando no se puede encontrar un recurso*/
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptionRequest extends RuntimeException {
    public ResourceNotFoundExceptionRequest(String message) {
        super(message);
    }
}
