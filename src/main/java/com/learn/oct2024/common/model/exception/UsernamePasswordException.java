package com.learn.oct2024.common.model.exception;

import java.util.Arrays;

public class UsernamePasswordException extends RuntimeException {
    private final String[] args;

    public UsernamePasswordException(String... args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "UsernamePasswordException: " + Arrays.toString(args);
    }

}
