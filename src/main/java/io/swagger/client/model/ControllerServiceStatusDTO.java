/**
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ControllerServiceStatusDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ControllerServiceStatusDTO   {
  /**
   * The run status of this ControllerService
   */
  public enum RunStatusEnum {
    @SerializedName("ENABLED")
    ENABLED("ENABLED"),
    
    @SerializedName("ENABLING")
    ENABLING("ENABLING"),
    
    @SerializedName("DISABLED")
    DISABLED("DISABLED"),
    
    @SerializedName("DISABLING")
    DISABLING("DISABLING");

    private String value;

    RunStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("runStatus")
  private RunStatusEnum runStatus = null;

  /**
   * Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)
   */
  public enum ValidationStatusEnum {
    @SerializedName("VALID")
    VALID("VALID"),
    
    @SerializedName("INVALID")
    INVALID("INVALID"),
    
    @SerializedName("VALIDATING")
    VALIDATING("VALIDATING");

    private String value;

    ValidationStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("validationStatus")
  private ValidationStatusEnum validationStatus = null;

  @SerializedName("activeThreadCount")
  private Integer activeThreadCount = null;

  public ControllerServiceStatusDTO runStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
    return this;
  }

   /**
   * The run status of this ControllerService
   * @return runStatus
  **/
  @ApiModelProperty(example = "null", value = "The run status of this ControllerService")
  public RunStatusEnum getRunStatus() {
    return runStatus;
  }

  public void setRunStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
  }

  public ControllerServiceStatusDTO validationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)
   * @return validationStatus
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)")
  public ValidationStatusEnum getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
  }

  public ControllerServiceStatusDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of active threads for the component.
   * @return activeThreadCount
  **/
  @ApiModelProperty(example = "null", value = "The number of active threads for the component.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceStatusDTO controllerServiceStatusDTO = (ControllerServiceStatusDTO) o;
    return Objects.equals(this.runStatus, controllerServiceStatusDTO.runStatus) &&
        Objects.equals(this.validationStatus, controllerServiceStatusDTO.validationStatus) &&
        Objects.equals(this.activeThreadCount, controllerServiceStatusDTO.activeThreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runStatus, validationStatus, activeThreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceStatusDTO {\n");
    
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
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

