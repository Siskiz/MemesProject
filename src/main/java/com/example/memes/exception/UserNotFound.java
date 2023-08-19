package com.example.memes.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserNotFound extends RuntimeException {

    public UserNotFound(String message) {
        super(message);
    }
}
