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
 * VersionedFlowCoordinates
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class VersionedFlowCoordinates   {
  @SerializedName("registryId")
  private String registryId = null;

  @SerializedName("storageLocation")
  private String storageLocation = null;

  @SerializedName("registryUrl")
  private String registryUrl = null;

  @SerializedName("bucketId")
  private String bucketId = null;

  @SerializedName("flowId")
  private String flowId = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("latest")
  private Boolean latest = null;

  public VersionedFlowCoordinates registryId(String registryId) {
    this.registryId = registryId;
    return this;
  }

   /**
   * The identifier of the Flow Registry that contains the flow
   * @return registryId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the Flow Registry that contains the flow")
  public String getRegistryId() {
    return registryId;
  }

  public void setRegistryId(String registryId) {
    this.registryId = registryId;
  }

  public VersionedFlowCoordinates storageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

   /**
   * The location of the Flow Registry that stores the flow
   * @return storageLocation
  **/
  @ApiModelProperty(example = "null", value = "The location of the Flow Registry that stores the flow")
  public String getStorageLocation() {
    return storageLocation;
  }

  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  public VersionedFlowCoordinates registryUrl(String registryUrl) {
    this.registryUrl = registryUrl;
    return this;
  }

   /**
   * The URL of the Flow Registry that contains the flow
   * @return registryUrl
  **/
  @ApiModelProperty(example = "null", value = "The URL of the Flow Registry that contains the flow")
  public String getRegistryUrl() {
    return registryUrl;
  }

  public void setRegistryUrl(String registryUrl) {
    this.registryUrl = registryUrl;
  }

  public VersionedFlowCoordinates bucketId(String bucketId) {
    this.bucketId = bucketId;
    return this;
  }

   /**
   * The UUID of the bucket that the flow resides in
   * @return bucketId
  **/
  @ApiModelProperty(example = "null", value = "The UUID of the bucket that the flow resides in")
  public String getBucketId() {
    return bucketId;
  }

  public void setBucketId(String bucketId) {
    this.bucketId = bucketId;
  }

  public VersionedFlowCoordinates flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }

   /**
   * The UUID of the flow
   * @return flowId
  **/
  @ApiModelProperty(example = "null", value = "The UUID of the flow")
  public String getFlowId() {
    return flowId;
  }

  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  public VersionedFlowCoordinates version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the flow
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "The version of the flow")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public VersionedFlowCoordinates latest(Boolean latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Whether or not these coordinates point to the latest version of the flow
   * @return latest
  **/
  @ApiModelProperty(example = "null", value = "Whether or not these coordinates point to the latest version of the flow")
  public Boolean getLatest() {
    return latest;
  }

  public void setLatest(Boolean latest) {
    this.latest = latest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowCoordinates versionedFlowCoordinates = (VersionedFlowCoordinates) o;
    return Objects.equals(this.registryId, versionedFlowCoordinates.registryId) &&
        Objects.equals(this.storageLocation, versionedFlowCoordinates.storageLocation) &&
        Objects.equals(this.registryUrl, versionedFlowCoordinates.registryUrl) &&
        Objects.equals(this.bucketId, versionedFlowCoordinates.bucketId) &&
        Objects.equals(this.flowId, versionedFlowCoordinates.flowId) &&
        Objects.equals(this.version, versionedFlowCoordinates.version) &&
        Objects.equals(this.latest, versionedFlowCoordinates.latest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryId, storageLocation, registryUrl, bucketId, flowId, version, latest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowCoordinates {\n");
    
    sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
    sb.append("    registryUrl: ").append(toIndentedString(registryUrl)).append("\n");
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
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

