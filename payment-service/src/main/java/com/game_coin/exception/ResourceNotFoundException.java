package com.game_coin.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

/*Esta clase sirve para cuando no se pudo encontrar un recurso*/
@Data
@AllArgsConstructor
public class ResourceNotFoundException {
    private final String message;
    private final HttpStatus status;
}
