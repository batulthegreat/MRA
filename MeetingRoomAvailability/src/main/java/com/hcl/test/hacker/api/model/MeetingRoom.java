package com.hcl.test.hacker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hcl.test.hacker.api.model.MeetingRoomRoomLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * MeetingRoom
 */

public class MeetingRoom  implements Serializable {
  @JsonProperty("RoomId")
  private String roomId = null;

  @JsonProperty("RoomCapacity")
  private Integer roomCapacity = null;

  @JsonProperty("RoomName")
  private String roomName = null;

  @JsonProperty("RoomDescription")
  private String roomDescription = null;

  @JsonProperty("RoomAmenities")
  private List<String> roomAmenities = new ArrayList<String>();

  @JsonProperty("RoomLocation")
  private MeetingRoomRoomLocation roomLocation = null;

  public MeetingRoom roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * unique id of the meeting room
   * @return roomId
  **/
  @ApiModelProperty(value = "unique id of the meeting room")
  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public MeetingRoom roomCapacity(Integer roomCapacity) {
    this.roomCapacity = roomCapacity;
    return this;
  }

   /**
   * Number of participants that can be accommodated in the room
   * @return roomCapacity
  **/
  @ApiModelProperty(value = "Number of participants that can be accommodated in the room")
  public Integer getRoomCapacity() {
    return roomCapacity;
  }

  public void setRoomCapacity(Integer roomCapacity) {
    this.roomCapacity = roomCapacity;
  }

  public MeetingRoom roomName(String roomName) {
    this.roomName = roomName;
    return this;
  }

   /**
   * Name of the room
   * @return roomName
  **/
  @ApiModelProperty(value = "Name of the room")
  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public MeetingRoom roomDescription(String roomDescription) {
    this.roomDescription = roomDescription;
    return this;
  }

   /**
   * Description of the room
   * @return roomDescription
  **/
  @ApiModelProperty(value = "Description of the room")
  public String getRoomDescription() {
    return roomDescription;
  }

  public void setRoomDescription(String roomDescription) {
    this.roomDescription = roomDescription;
  }

  public MeetingRoom roomAmenities(List<String> roomAmenities) {
    this.roomAmenities = roomAmenities;
    return this;
  }

  public MeetingRoom addRoomAmenitiesItem(String roomAmenitiesItem) {
    this.roomAmenities.add(roomAmenitiesItem);
    return this;
  }

   /**
   * Get roomAmenities
   * @return roomAmenities
  **/
  @ApiModelProperty(value = "")
  public List<String> getRoomAmenities() {
    return roomAmenities;
  }

  public void setRoomAmenities(List<String> roomAmenities) {
    this.roomAmenities = roomAmenities;
  }

  public MeetingRoom roomLocation(MeetingRoomRoomLocation roomLocation) {
    this.roomLocation = roomLocation;
    return this;
  }

   /**
   * Get roomLocation
   * @return roomLocation
  **/
  @ApiModelProperty(value = "")
  public MeetingRoomRoomLocation getRoomLocation() {
    return roomLocation;
  }

  public void setRoomLocation(MeetingRoomRoomLocation roomLocation) {
    this.roomLocation = roomLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingRoom meetingRoom = (MeetingRoom) o;
    return Objects.equals(this.roomId, meetingRoom.roomId) &&
        Objects.equals(this.roomCapacity, meetingRoom.roomCapacity) &&
        Objects.equals(this.roomName, meetingRoom.roomName) &&
        Objects.equals(this.roomDescription, meetingRoom.roomDescription) &&
        Objects.equals(this.roomAmenities, meetingRoom.roomAmenities) &&
        Objects.equals(this.roomLocation, meetingRoom.roomLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, roomCapacity, roomName, roomDescription, roomAmenities, roomLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingRoom {\n");
    
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomCapacity: ").append(toIndentedString(roomCapacity)).append("\n");
    sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
    sb.append("    roomDescription: ").append(toIndentedString(roomDescription)).append("\n");
    sb.append("    roomAmenities: ").append(toIndentedString(roomAmenities)).append("\n");
    sb.append("    roomLocation: ").append(toIndentedString(roomLocation)).append("\n");
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

