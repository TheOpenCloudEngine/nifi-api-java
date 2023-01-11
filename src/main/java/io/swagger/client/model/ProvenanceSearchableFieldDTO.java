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
 * ProvenanceSearchableFieldDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ProvenanceSearchableFieldDTO   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("field")
  private String field = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("type")
  private String type = null;

  public ProvenanceSearchableFieldDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the searchable field.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the searchable field.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProvenanceSearchableFieldDTO field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The searchable field.
   * @return field
  **/
  @ApiModelProperty(example = "null", value = "The searchable field.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ProvenanceSearchableFieldDTO label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label for the searchable field.
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "The label for the searchable field.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ProvenanceSearchableFieldDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the searchable field.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of the searchable field.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceSearchableFieldDTO provenanceSearchableFieldDTO = (ProvenanceSearchableFieldDTO) o;
    return Objects.equals(this.id, provenanceSearchableFieldDTO.id) &&
        Objects.equals(this.field, provenanceSearchableFieldDTO.field) &&
        Objects.equals(this.label, provenanceSearchableFieldDTO.label) &&
        Objects.equals(this.type, provenanceSearchableFieldDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, field, label, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceSearchableFieldDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

