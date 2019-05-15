package com.hcl.test.hacker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hcl.test.hacker.api.model.MeetingRoom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Suggestions
 */

public class Suggestions  implements Serializable {
  @JsonProperty("Rooms")
  private List<MeetingRoom> rooms = new ArrayList<MeetingRoom>();

  public Suggestions rooms(List<MeetingRoom> rooms) {
    this.rooms = rooms;
    return this;
  }

  public Suggestions addRoomsItem(MeetingRoom roomsItem) {
    this.rooms.add(roomsItem);
    return this;
  }

   /**
   * Get rooms
   * @return rooms
  **/
  @ApiModelProperty(value = "")
  public List<MeetingRoom> getRooms() {
    return rooms;
  }

  public void setRooms(List<MeetingRoom> rooms) {
    this.rooms = rooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Suggestions suggestions = (Suggestions) o;
    return Objects.equals(this.rooms, suggestions.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rooms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suggestions {\n");
    
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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

