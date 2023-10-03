package com.bagal.exceptions;

public class InvalidPathForJsonFileException extends RuntimeException{
    public InvalidPathForJsonFileException(String message){
        super(message);
    }
    public InvalidPathForJsonFileException(String message, Throwable throwable) {
        super(message,throwable);
    }
}
