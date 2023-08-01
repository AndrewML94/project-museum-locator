package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* Class responsible for the application's controller layer.
*/
@RestController
public class MuseumController {
  private final MuseumServiceInterface museumServiceInterface;

  public MuseumController(MuseumServiceInterface museumServiceInterface) {
    this.museumServiceInterface = museumServiceInterface;
  }

  /**
  * method responsible for the /museums route of type post.
  */
  @PostMapping(value = "/museums")
  public ResponseEntity<Museum> createMuseum(@RequestBody MuseumCreationDto museumCreationDto) {
    Museum newMuseum = museumServiceInterface.createMuseum(
        ModelDtoConverter.dtoToModel(museumCreationDto)
    );

    return ResponseEntity.status(HttpStatus.CREATED).body(newMuseum);
  }

  /**
  * method responsible for the /museums/closest route of type get.
  */
  @GetMapping(value = "/museums/closest")
  public ResponseEntity<MuseumDto> getMuseum(
      @RequestParam("lat") Double lat,
      @RequestParam("lng") Double lng,
      @RequestParam("max_dist_km") Double maxDist
  ) {
    Museum museum = museumServiceInterface.getClosestMuseum(new Coordinate(lat, lng), maxDist);

    return ResponseEntity.status(HttpStatus.OK).body(ModelDtoConverter.modelToDto(museum));
  }
}
