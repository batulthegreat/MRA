package com.hcl.test.hacker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Amenity
 */

public class Amenity  implements Serializable {
  @JsonProperty("AmenityId")
  private String amenityId = null;

  @JsonProperty("AmenityName")
  private String amenityName = null;

  public Amenity amenityId(String amenityId) {
    this.amenityId = amenityId;
    return this;
  }

   /**
   * System Id of the amenity
   * @return amenityId
  **/
  @ApiModelProperty(value = "System Id of the amenity")
  public String getAmenityId() {
    return amenityId;
  }

  public void setAmenityId(String amenityId) {
    this.amenityId = amenityId;
  }

  public Amenity amenityName(String amenityName) {
    this.amenityName = amenityName;
    return this;
  }

   /**
   * Short Description/name of the amenity
   * @return amenityName
  **/
  @ApiModelProperty(value = "Short Description/name of the amenity")
  public String getAmenityName() {
    return amenityName;
  }

  public void setAmenityName(String amenityName) {
    this.amenityName = amenityName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amenity amenity = (Amenity) o;
    return Objects.equals(this.amenityId, amenity.amenityId) &&
        Objects.equals(this.amenityName, amenity.amenityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amenityId, amenityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amenity {\n");
    
    sb.append("    amenityId: ").append(toIndentedString(amenityId)).append("\n");
    sb.append("    amenityName: ").append(toIndentedString(amenityName)).append("\n");
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

