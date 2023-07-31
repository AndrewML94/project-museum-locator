package com.betrybe.museumfinder.exception;

/**
* Class responsible for unchecked custom exception.
*/
public class InvalidCoordinateException extends RuntimeException {

  public InvalidCoordinateException(String message) {
    super(message);
  }
}
