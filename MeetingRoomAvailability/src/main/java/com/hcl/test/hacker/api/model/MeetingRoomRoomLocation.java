package com.hcl.test.hacker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * MeetingRoomRoomLocation
 */

public class MeetingRoomRoomLocation  implements Serializable {
  @JsonProperty("LocationId")
  private String locationId = null;

  @JsonProperty("Building")
  private String building = null;

  @JsonProperty("Floor")
  private Integer floor = null;

  public MeetingRoomRoomLocation locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public MeetingRoomRoomLocation building(String building) {
    this.building = building;
    return this;
  }

   /**
   * Get building
   * @return building
  **/
  @ApiModelProperty(value = "")
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public MeetingRoomRoomLocation floor(Integer floor) {
    this.floor = floor;
    return this;
  }

   /**
   * Get floor
   * @return floor
  **/
  @ApiModelProperty(value = "")
  public Integer getFloor() {
    return floor;
  }

  public void setFloor(Integer floor) {
    this.floor = floor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingRoomRoomLocation meetingRoomRoomLocation = (MeetingRoomRoomLocation) o;
    return Objects.equals(this.locationId, meetingRoomRoomLocation.locationId) &&
        Objects.equals(this.building, meetingRoomRoomLocation.building) &&
        Objects.equals(this.floor, meetingRoomRoomLocation.floor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, building, floor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingRoomRoomLocation {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
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

