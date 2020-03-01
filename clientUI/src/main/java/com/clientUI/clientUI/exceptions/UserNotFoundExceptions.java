package com.clientUI.clientUI.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExceptions extends RuntimeException {
    public UserNotFoundExceptions(String message) {
        super(message);
    }
}
