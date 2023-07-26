package com.betrybe.museumfinder.model;

/**
* Class responsible for the abstraction of the model layer.
*/
public class Museum {
  private Long id;
  private String name;
  private String description;
  private String address;
  private String collectionType;
  private String subject;
  private String url;
  private Coordinate coordinate;
  private Long legacyId;

  /**
  * Method to get the id.
  */
  public Long getId() {
    return id;
  }

  /**
  * Method for setting the id.
  */
  public void setId(Long id) {
    this.id = id;
  }

  /**
  * Method to get the name.
  */
  public String getName() {
    return name;
  }

  /**
  * Method for setting the name.
  */
  public void setName(String name) {
    this.name = name;
  }

  /**
  * Method to get the description.
  */
  public String getDescription() {
    return description;
  }

  /**
  * Method for setting the description.
  */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
  * Method to get the address.
  */
  public String getAddress() {
    return address;
  }

  /**
  * Method for setting the address.
  */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
  * Method to get the collectionType.
  */
  public String getCollectionType() {
    return collectionType;
  }

  /**
  * Method for setting the collection type.
  */
  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  /**
  * Method to get the subject.
  */
  public String getSubject() {
    return subject;
  }

  /**
  * Method for setting the subject.
  */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
  * Method to get the url.
  */
  public String getUrl() {
    return url;
  }

  /**
  * Method for setting the url.
  */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
  * Method to get the coordinate.
  */
  public Coordinate getCoordinate() {
    return coordinate;
  }

  /**
  * Method for setting the coordinate.
  */
  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  /**
  * Method to get the legacyId.
  */
  public Long getLegacyId() {
    return legacyId;
  }

  /**
  * Method for setting the legacyId.
  */
  public void setLegacyId(Long legacyId) {
    this.legacyId = legacyId;
  }

}
