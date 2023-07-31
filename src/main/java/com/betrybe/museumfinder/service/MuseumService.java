package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.util.CoordinateUtil;
import org.springframework.stereotype.Service;

/**
* Class responsible for the application's service layer.
*/
@Service
public class MuseumService implements MuseumServiceInterface {
  
  private final MuseumFakeDatabase museumFakeDatabase;
  
  public MuseumService(MuseumFakeDatabase museumFakeDatabase) {
    this.museumFakeDatabase = museumFakeDatabase;
  }

  @Override
  public Museum getClosestMuseum(Coordinate coordinate, Double maxDistance) {
    throw new UnsupportedOperationException("Unimplemented method 'getClosestMuseum'");
  }

  @Override
  public Museum createMuseum(Museum museum) {
    if (!CoordinateUtil.isCoordinateValid(museum.getCoordinate())) {
      throw new InvalidCoordinateException("Invalid coordinates");
    }

    return museumFakeDatabase.saveMuseum(museum);
  }

  @Override
  public Museum getMuseum(Long id) {
    throw new UnsupportedOperationException("Unimplemented method 'getMuseum'");
  }
  
}
