package com.hcl.test.hacker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hcl.test.hacker.api.model.Amenity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * AllAmenities
 */

public class AllAmenities  implements Serializable {
  @JsonProperty("Amenities")
  private List<Amenity> amenities = new ArrayList<Amenity>();

  public AllAmenities amenities(List<Amenity> amenities) {
    this.amenities = amenities;
    return this;
  }

  public AllAmenities addAmenitiesItem(Amenity amenitiesItem) {
    this.amenities.add(amenitiesItem);
    return this;
  }

   /**
   * Get amenities
   * @return amenities
  **/
  @ApiModelProperty(value = "")
  public List<Amenity> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<Amenity> amenities) {
    this.amenities = amenities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllAmenities allAmenities = (AllAmenities) o;
    return Objects.equals(this.amenities, allAmenities.amenities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amenities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllAmenities {\n");
    
    sb.append("    amenities: ").append(toIndentedString(amenities)).append("\n");
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

