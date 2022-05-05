package com.example.demo.exception;
import org.springframework.http.HttpStatus;



import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ExceptionController {

  @ExceptionHandler(value = ShipNotFoundException.class)

  public ResponseEntity<Object> exception(ShipNotFoundException exception) {

   return new ResponseEntity<>("Ship not found", HttpStatus.NOT_FOUND);

  }
  @ExceptionHandler(value = RouteNotFoundException.class)

  public ResponseEntity<Object> exception(RouteNotFoundException exception) {

   return new ResponseEntity<>("Route not found", HttpStatus.NOT_FOUND);

  }

  @ExceptionHandler(value = ScheduleNotFoundException.class)

  public ResponseEntity<Object> exception(ScheduleNotFoundException exception) {

   return new ResponseEntity<>("Schedule not found", HttpStatus.NOT_FOUND);

}
  @ExceptionHandler(value = PassengerNotFoundException.class)

  public ResponseEntity<Object> exception(PassengerNotFoundException exception) {

   return new ResponseEntity<>("Passenger not found", HttpStatus.NOT_FOUND);

  }
}