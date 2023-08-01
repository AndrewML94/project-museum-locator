package com.betrybe.museumfinder.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
* Class responsible for handling exceptions.
*/
@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler
  public ResponseEntity<String> handleGlobalException(Exception ex) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
      .body("Erro interno!");
  }


  @ExceptionHandler(InvalidCoordinateException.class)
  public ResponseEntity<String> handleInvalidCoordinate(RuntimeException exception) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
      .body("Coordenada inválida!");
  }

  @ExceptionHandler(MuseumNotFoundException.class)
  public ResponseEntity<String> handleMuseumNotFound(RuntimeException exception) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
      .body("Museu não encontrado!");
  }
}
