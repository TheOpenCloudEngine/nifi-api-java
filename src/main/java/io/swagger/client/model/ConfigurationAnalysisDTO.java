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
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ConfigurationAnalysisDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ConfigurationAnalysisDTO   {
  @SerializedName("componentId")
  private String componentId = null;

  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();

  @SerializedName("referencedAttributes")
  private Map<String, String> referencedAttributes = new HashMap<String, String>();

  @SerializedName("supportsVerification")
  private Boolean supportsVerification = null;

  public ConfigurationAnalysisDTO componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

   /**
   * The ID of the component
   * @return componentId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the component")
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public ConfigurationAnalysisDTO properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ConfigurationAnalysisDTO putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The configured properties for the component
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "The configured properties for the component")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public ConfigurationAnalysisDTO referencedAttributes(Map<String, String> referencedAttributes) {
    this.referencedAttributes = referencedAttributes;
    return this;
  }

  public ConfigurationAnalysisDTO putReferencedAttributesItem(String key, String referencedAttributesItem) {
    this.referencedAttributes.put(key, referencedAttributesItem);
    return this;
  }

   /**
   * The attributes that are referenced by the properties, mapped to recently used values
   * @return referencedAttributes
  **/
  @ApiModelProperty(example = "null", value = "The attributes that are referenced by the properties, mapped to recently used values")
  public Map<String, String> getReferencedAttributes() {
    return referencedAttributes;
  }

  public void setReferencedAttributes(Map<String, String> referencedAttributes) {
    this.referencedAttributes = referencedAttributes;
  }

  public ConfigurationAnalysisDTO supportsVerification(Boolean supportsVerification) {
    this.supportsVerification = supportsVerification;
    return this;
  }

   /**
   * Whether or not the component supports verification
   * @return supportsVerification
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the component supports verification")
  public Boolean getSupportsVerification() {
    return supportsVerification;
  }

  public void setSupportsVerification(Boolean supportsVerification) {
    this.supportsVerification = supportsVerification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationAnalysisDTO configurationAnalysisDTO = (ConfigurationAnalysisDTO) o;
    return Objects.equals(this.componentId, configurationAnalysisDTO.componentId) &&
        Objects.equals(this.properties, configurationAnalysisDTO.properties) &&
        Objects.equals(this.referencedAttributes, configurationAnalysisDTO.referencedAttributes) &&
        Objects.equals(this.supportsVerification, configurationAnalysisDTO.supportsVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, properties, referencedAttributes, supportsVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationAnalysisDTO {\n");
    
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    referencedAttributes: ").append(toIndentedString(referencedAttributes)).append("\n");
    sb.append("    supportsVerification: ").append(toIndentedString(supportsVerification)).append("\n");
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

