package com.hcl.test.hacker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Location
 */

public class Location  implements Serializable {
  @JsonProperty("LocationId")
  private String locationId = null;

  @JsonProperty("LocationName")
  private String locationName = null;

  @JsonProperty("Buildings")
  private List<String> buildings = new ArrayList<String>();

  @JsonProperty("Floors")
  private List<Integer> floors = new ArrayList<Integer>();

  public Location locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * System Id of the location
   * @return locationId
  **/
  @ApiModelProperty(value = "System Id of the location")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Location locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Name of location
   * @return locationName
  **/
  @ApiModelProperty(value = "Name of location")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public Location buildings(List<String> buildings) {
    this.buildings = buildings;
    return this;
  }

  public Location addBuildingsItem(String buildingsItem) {
    this.buildings.add(buildingsItem);
    return this;
  }

   /**
   * Get buildings
   * @return buildings
  **/
  @ApiModelProperty(value = "")
  public List<String> getBuildings() {
    return buildings;
  }

  public void setBuildings(List<String> buildings) {
    this.buildings = buildings;
  }

  public Location floors(List<Integer> floors) {
    this.floors = floors;
    return this;
  }

  public Location addFloorsItem(Integer floorsItem) {
    this.floors.add(floorsItem);
    return this;
  }

   /**
   * Get floors
   * @return floors
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getFloors() {
    return floors;
  }

  public void setFloors(List<Integer> floors) {
    this.floors = floors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.locationId, location.locationId) &&
        Objects.equals(this.locationName, location.locationName) &&
        Objects.equals(this.buildings, location.buildings) &&
        Objects.equals(this.floors, location.floors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, locationName, buildings, floors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    buildings: ").append(toIndentedString(buildings)).append("\n");
    sb.append("    floors: ").append(toIndentedString(floors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

