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
import io.swagger.client.model.FlowBreadcrumbDTO;
import io.swagger.client.model.FlowBreadcrumbEntity;
import io.swagger.client.model.PermissionsDTO;


/**
 * FlowBreadcrumbEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class FlowBreadcrumbEntity   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("permissions")
  private PermissionsDTO permissions = null;

  /**
   * The current state of the Process Group, as it relates to the Versioned Flow
   */
  public enum VersionedFlowStateEnum {
    @SerializedName("LOCALLY_MODIFIED")
    LOCALLY_MODIFIED("LOCALLY_MODIFIED"),
    
    @SerializedName("STALE")
    STALE("STALE"),
    
    @SerializedName("LOCALLY_MODIFIED_AND_STALE")
    LOCALLY_MODIFIED_AND_STALE("LOCALLY_MODIFIED_AND_STALE"),
    
    @SerializedName("UP_TO_DATE")
    UP_TO_DATE("UP_TO_DATE"),
    
    @SerializedName("SYNC_FAILURE")
    SYNC_FAILURE("SYNC_FAILURE");

    private String value;

    VersionedFlowStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("versionedFlowState")
  private VersionedFlowStateEnum versionedFlowState = null;

  @SerializedName("breadcrumb")
  private FlowBreadcrumbDTO breadcrumb = null;

  @SerializedName("parentBreadcrumb")
  private FlowBreadcrumbEntity parentBreadcrumb = null;

  public FlowBreadcrumbEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this ancestor ProcessGroup.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of this ancestor ProcessGroup.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FlowBreadcrumbEntity permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The permissions for this ancestor ProcessGroup.
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "The permissions for this ancestor ProcessGroup.")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }

  public FlowBreadcrumbEntity versionedFlowState(VersionedFlowStateEnum versionedFlowState) {
    this.versionedFlowState = versionedFlowState;
    return this;
  }

   /**
   * The current state of the Process Group, as it relates to the Versioned Flow
   * @return versionedFlowState
  **/
  @ApiModelProperty(example = "null", value = "The current state of the Process Group, as it relates to the Versioned Flow")
  public VersionedFlowStateEnum getVersionedFlowState() {
    return versionedFlowState;
  }

  public void setVersionedFlowState(VersionedFlowStateEnum versionedFlowState) {
    this.versionedFlowState = versionedFlowState;
  }

  public FlowBreadcrumbEntity breadcrumb(FlowBreadcrumbDTO breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }

   /**
   * This breadcrumb.
   * @return breadcrumb
  **/
  @ApiModelProperty(example = "null", value = "This breadcrumb.")
  public FlowBreadcrumbDTO getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(FlowBreadcrumbDTO breadcrumb) {
    this.breadcrumb = breadcrumb;
  }

  public FlowBreadcrumbEntity parentBreadcrumb(FlowBreadcrumbEntity parentBreadcrumb) {
    this.parentBreadcrumb = parentBreadcrumb;
    return this;
  }

   /**
   * The parent breadcrumb for this breadcrumb.
   * @return parentBreadcrumb
  **/
  @ApiModelProperty(example = "null", value = "The parent breadcrumb for this breadcrumb.")
  public FlowBreadcrumbEntity getParentBreadcrumb() {
    return parentBreadcrumb;
  }

  public void setParentBreadcrumb(FlowBreadcrumbEntity parentBreadcrumb) {
    this.parentBreadcrumb = parentBreadcrumb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowBreadcrumbEntity flowBreadcrumbEntity = (FlowBreadcrumbEntity) o;
    return Objects.equals(this.id, flowBreadcrumbEntity.id) &&
        Objects.equals(this.permissions, flowBreadcrumbEntity.permissions) &&
        Objects.equals(this.versionedFlowState, flowBreadcrumbEntity.versionedFlowState) &&
        Objects.equals(this.breadcrumb, flowBreadcrumbEntity.breadcrumb) &&
        Objects.equals(this.parentBreadcrumb, flowBreadcrumbEntity.parentBreadcrumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions, versionedFlowState, breadcrumb, parentBreadcrumb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowBreadcrumbEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    versionedFlowState: ").append(toIndentedString(versionedFlowState)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    parentBreadcrumb: ").append(toIndentedString(parentBreadcrumb)).append("\n");
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
