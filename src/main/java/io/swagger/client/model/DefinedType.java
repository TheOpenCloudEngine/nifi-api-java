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
 * DefinedType
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class DefinedType   {
  @SerializedName("group")
  private String group = null;

  @SerializedName("artifact")
  private String artifact = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("typeDescription")
  private String typeDescription = null;

  public DefinedType group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The group name of the bundle that provides the referenced type.
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "The group name of the bundle that provides the referenced type.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public DefinedType artifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

   /**
   * The artifact name of the bundle that provides the referenced type.
   * @return artifact
  **/
  @ApiModelProperty(example = "null", value = "The artifact name of the bundle that provides the referenced type.")
  public String getArtifact() {
    return artifact;
  }

  public void setArtifact(String artifact) {
    this.artifact = artifact;
  }

  public DefinedType version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the bundle that provides the referenced type.
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "The version of the bundle that provides the referenced type.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DefinedType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The fully-qualified class type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The fully-qualified class type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DefinedType typeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    return this;
  }

   /**
   * The description of the type.
   * @return typeDescription
  **/
  @ApiModelProperty(example = "null", value = "The description of the type.")
  public String getTypeDescription() {
    return typeDescription;
  }

  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefinedType definedType = (DefinedType) o;
    return Objects.equals(this.group, definedType.group) &&
        Objects.equals(this.artifact, definedType.artifact) &&
        Objects.equals(this.version, definedType.version) &&
        Objects.equals(this.type, definedType.type) &&
        Objects.equals(this.typeDescription, definedType.typeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, artifact, version, type, typeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefinedType {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
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

