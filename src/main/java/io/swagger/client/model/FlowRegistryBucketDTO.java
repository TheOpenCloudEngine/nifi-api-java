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
 * FlowRegistryBucketDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class FlowRegistryBucketDTO   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("created")
  private Long created = null;

  public FlowRegistryBucketDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The bucket identifier
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The bucket identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FlowRegistryBucketDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The bucket name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The bucket name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlowRegistryBucketDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The bucket description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The bucket description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FlowRegistryBucketDTO created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * The created timestamp of this bucket
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "The created timestamp of this bucket")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowRegistryBucketDTO flowRegistryBucketDTO = (FlowRegistryBucketDTO) o;
    return Objects.equals(this.id, flowRegistryBucketDTO.id) &&
        Objects.equals(this.name, flowRegistryBucketDTO.name) &&
        Objects.equals(this.description, flowRegistryBucketDTO.description) &&
        Objects.equals(this.created, flowRegistryBucketDTO.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowRegistryBucketDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

