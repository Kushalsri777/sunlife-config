package com.example.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.user.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {    //to handle exceptions globally, eg handle resnot found exception

    @ExceptionHandler(ResourceNotFoundException.class)  //if anywhere in the project Resnotfound exception comes, this method will be called automatically
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException exception)
    {
        String message = exception.getMessage();
        ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
    }
}
