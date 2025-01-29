package com;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Global {
@ExceptionHandler(Exception.class)
public ResponseEntity<String>
handleException(Exception ex){
	return new ResponseEntity<>("Error:"+ex.getMessage(),HttpStatus.BAD_REQUEST);
}
}
