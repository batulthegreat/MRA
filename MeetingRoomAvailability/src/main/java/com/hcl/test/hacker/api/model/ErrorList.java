package com.hcl.test.hacker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hcl.test.hacker.api.model.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ErrorList
 */

public class ErrorList  implements Serializable {
  @JsonProperty("ErrorList")
  private List<Error> errorList = new ArrayList<Error>();

  public ErrorList errorList(List<Error> errorList) {
    this.errorList = errorList;
    return this;
  }

  public ErrorList addErrorListItem(Error errorListItem) {
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @ApiModelProperty(value = "")
  public List<Error> getErrorList() {
    return errorList;
  }

  public void setErrorList(List<Error> errorList) {
    this.errorList = errorList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorList errorList = (ErrorList) o;
    return Objects.equals(this.errorList, errorList.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorList {\n");
    
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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

