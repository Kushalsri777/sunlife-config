package com.example.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{     //custom exception extends runtimeException to use its properties


    //extra properties that we want to manage
    public ResourceNotFoundException(){
        super("Resource not found on server");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
