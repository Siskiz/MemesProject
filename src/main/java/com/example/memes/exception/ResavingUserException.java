package com.example.memes.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResavingUserException extends RuntimeException {

    public ResavingUserException(String message) {
        super(message);
    }

}