package com.onuraktas.usermanager.exception;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.InternalServerErrorException;
import jakarta.ws.rs.NotFoundException;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<CustomRestError> badRequestException(final Exception exception, final HttpRequest request){
        var customRestError = CustomRestError.builder()
                .message(exception.getCause().getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .build();
        return responseEntity(customRestError);
    }


    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<CustomRestError> notFoundException(final Exception exception, final HttpRequest request){
        var customResError = CustomRestError.builder()
                .message(exception.getCause().getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .build();
        return responseEntity(customResError);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<CustomRestError> ınternalServerError(final Exception exception, final HttpRequest request){
        var customRestError = CustomRestError.builder()
                .message(exception.getCause().getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();
        return responseEntity(customRestError);
    }


    private static ResponseEntity<CustomRestError> responseEntity (CustomRestError customRestError){
        return ResponseEntity.status(HttpStatus.valueOf(customRestError.getStatus()))
                .body(customRestError);

    }
}
