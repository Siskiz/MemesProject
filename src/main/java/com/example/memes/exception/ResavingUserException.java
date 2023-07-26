package com.example.memes.exception;

import com.example.memes.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResavingUserException extends RuntimeException {

    private final User user;

    public ResavingUserException(User user) {
        this.user = user;
    }

}