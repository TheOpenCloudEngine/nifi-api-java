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
import java.util.ArrayList;
import java.util.List;


/**
 * PropertyResourceDefinition
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class PropertyResourceDefinition   {
  /**
   * The cardinality of the resource definition (i.e. single or multiple)
   */
  public enum CardinalityEnum {
    @SerializedName("SINGLE")
    SINGLE("SINGLE"),
    
    @SerializedName("MULTIPLE")
    MULTIPLE("MULTIPLE");

    private String value;

    CardinalityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cardinality")
  private CardinalityEnum cardinality = null;

  /**
   * Gets or Sets resourceTypes
   */
  public enum ResourceTypesEnum {
    @SerializedName("FILE")
    FILE("FILE"),
    
    @SerializedName("DIRECTORY")
    DIRECTORY("DIRECTORY"),
    
    @SerializedName("TEXT")
    TEXT("TEXT"),
    
    @SerializedName("URL")
    URL("URL");

    private String value;

    ResourceTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("resourceTypes")
  private List<ResourceTypesEnum> resourceTypes = new ArrayList<ResourceTypesEnum>();

  public PropertyResourceDefinition cardinality(CardinalityEnum cardinality) {
    this.cardinality = cardinality;
    return this;
  }

   /**
   * The cardinality of the resource definition (i.e. single or multiple)
   * @return cardinality
  **/
  @ApiModelProperty(example = "null", value = "The cardinality of the resource definition (i.e. single or multiple)")
  public CardinalityEnum getCardinality() {
    return cardinality;
  }

  public void setCardinality(CardinalityEnum cardinality) {
    this.cardinality = cardinality;
  }

  public PropertyResourceDefinition resourceTypes(List<ResourceTypesEnum> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public PropertyResourceDefinition addResourceTypesItem(ResourceTypesEnum resourceTypesItem) {
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

   /**
   * The types of resources that can be referenced
   * @return resourceTypes
  **/
  @ApiModelProperty(example = "null", value = "The types of resources that can be referenced")
  public List<ResourceTypesEnum> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(List<ResourceTypesEnum> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyResourceDefinition propertyResourceDefinition = (PropertyResourceDefinition) o;
    return Objects.equals(this.cardinality, propertyResourceDefinition.cardinality) &&
        Objects.equals(this.resourceTypes, propertyResourceDefinition.resourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardinality, resourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyResourceDefinition {\n");
    
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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

