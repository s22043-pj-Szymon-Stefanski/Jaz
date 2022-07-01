package com.example.waluty.controlleradvice;

import org.hibernate.annotations.NotFound;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WalutyControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    ResponseEntity<String> HandlerRuntimeExecption(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Exception throw: 404" );
    }

    @ExceptionHandler(InternalError.class)
    ResponseEntity<String> HandlerInternalError(InternalError ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception throw: 404" );
    }


}
