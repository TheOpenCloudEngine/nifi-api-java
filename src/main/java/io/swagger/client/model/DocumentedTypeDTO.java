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
import io.swagger.client.model.BundleDTO;
import io.swagger.client.model.ControllerServiceApiDTO;
import io.swagger.client.model.ExplicitRestrictionDTO;
import java.util.ArrayList;
import java.util.List;


/**
 * DocumentedTypeDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class DocumentedTypeDTO   {
  @SerializedName("type")
  private String type = null;

  @SerializedName("bundle")
  private BundleDTO bundle = null;

  @SerializedName("controllerServiceApis")
  private List<ControllerServiceApiDTO> controllerServiceApis = new ArrayList<ControllerServiceApiDTO>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("restricted")
  private Boolean restricted = null;

  @SerializedName("usageRestriction")
  private String usageRestriction = null;

  @SerializedName("explicitRestrictions")
  private List<ExplicitRestrictionDTO> explicitRestrictions = new ArrayList<ExplicitRestrictionDTO>();

  @SerializedName("deprecationReason")
  private String deprecationReason = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  public DocumentedTypeDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The fully qualified name of the type.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The fully qualified name of the type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DocumentedTypeDTO bundle(BundleDTO bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * The details of the artifact that bundled this type.
   * @return bundle
  **/
  @ApiModelProperty(example = "null", value = "The details of the artifact that bundled this type.")
  public BundleDTO getBundle() {
    return bundle;
  }

  public void setBundle(BundleDTO bundle) {
    this.bundle = bundle;
  }

  public DocumentedTypeDTO controllerServiceApis(List<ControllerServiceApiDTO> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
    return this;
  }

  public DocumentedTypeDTO addControllerServiceApisItem(ControllerServiceApiDTO controllerServiceApisItem) {
    this.controllerServiceApis.add(controllerServiceApisItem);
    return this;
  }

   /**
   * If this type represents a ControllerService, this lists the APIs it implements.
   * @return controllerServiceApis
  **/
  @ApiModelProperty(example = "null", value = "If this type represents a ControllerService, this lists the APIs it implements.")
  public List<ControllerServiceApiDTO> getControllerServiceApis() {
    return controllerServiceApis;
  }

  public void setControllerServiceApis(List<ControllerServiceApiDTO> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
  }

  public DocumentedTypeDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the type.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the type.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DocumentedTypeDTO restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

   /**
   * Whether this type is restricted.
   * @return restricted
  **/
  @ApiModelProperty(example = "null", value = "Whether this type is restricted.")
  public Boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public DocumentedTypeDTO usageRestriction(String usageRestriction) {
    this.usageRestriction = usageRestriction;
    return this;
  }

   /**
   * The optional description of why the usage of this component is restricted.
   * @return usageRestriction
  **/
  @ApiModelProperty(example = "null", value = "The optional description of why the usage of this component is restricted.")
  public String getUsageRestriction() {
    return usageRestriction;
  }

  public void setUsageRestriction(String usageRestriction) {
    this.usageRestriction = usageRestriction;
  }

  public DocumentedTypeDTO explicitRestrictions(List<ExplicitRestrictionDTO> explicitRestrictions) {
    this.explicitRestrictions = explicitRestrictions;
    return this;
  }

  public DocumentedTypeDTO addExplicitRestrictionsItem(ExplicitRestrictionDTO explicitRestrictionsItem) {
    this.explicitRestrictions.add(explicitRestrictionsItem);
    return this;
  }

   /**
   * An optional collection of explicit restrictions. If specified, these explicit restrictions will be enfored.
   * @return explicitRestrictions
  **/
  @ApiModelProperty(example = "null", value = "An optional collection of explicit restrictions. If specified, these explicit restrictions will be enfored.")
  public List<ExplicitRestrictionDTO> getExplicitRestrictions() {
    return explicitRestrictions;
  }

  public void setExplicitRestrictions(List<ExplicitRestrictionDTO> explicitRestrictions) {
    this.explicitRestrictions = explicitRestrictions;
  }

  public DocumentedTypeDTO deprecationReason(String deprecationReason) {
    this.deprecationReason = deprecationReason;
    return this;
  }

   /**
   * The description of why the usage of this component is restricted.
   * @return deprecationReason
  **/
  @ApiModelProperty(example = "null", value = "The description of why the usage of this component is restricted.")
  public String getDeprecationReason() {
    return deprecationReason;
  }

  public void setDeprecationReason(String deprecationReason) {
    this.deprecationReason = deprecationReason;
  }

  public DocumentedTypeDTO tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DocumentedTypeDTO addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags associated with this type.
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "The tags associated with this type.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentedTypeDTO documentedTypeDTO = (DocumentedTypeDTO) o;
    return Objects.equals(this.type, documentedTypeDTO.type) &&
        Objects.equals(this.bundle, documentedTypeDTO.bundle) &&
        Objects.equals(this.controllerServiceApis, documentedTypeDTO.controllerServiceApis) &&
        Objects.equals(this.description, documentedTypeDTO.description) &&
        Objects.equals(this.restricted, documentedTypeDTO.restricted) &&
        Objects.equals(this.usageRestriction, documentedTypeDTO.usageRestriction) &&
        Objects.equals(this.explicitRestrictions, documentedTypeDTO.explicitRestrictions) &&
        Objects.equals(this.deprecationReason, documentedTypeDTO.deprecationReason) &&
        Objects.equals(this.tags, documentedTypeDTO.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, bundle, controllerServiceApis, description, restricted, usageRestriction, explicitRestrictions, deprecationReason, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentedTypeDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    controllerServiceApis: ").append(toIndentedString(controllerServiceApis)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    usageRestriction: ").append(toIndentedString(usageRestriction)).append("\n");
    sb.append("    explicitRestrictions: ").append(toIndentedString(explicitRestrictions)).append("\n");
    sb.append("    deprecationReason: ").append(toIndentedString(deprecationReason)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

