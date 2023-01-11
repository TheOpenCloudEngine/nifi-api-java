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
import io.swagger.client.model.PermissionsDTO;
import io.swagger.client.model.RequiredPermissionDTO;


/**
 * ComponentRestrictionPermissionDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ComponentRestrictionPermissionDTO   {
  @SerializedName("requiredPermission")
  private RequiredPermissionDTO requiredPermission = null;

  @SerializedName("permissions")
  private PermissionsDTO permissions = null;

  public ComponentRestrictionPermissionDTO requiredPermission(RequiredPermissionDTO requiredPermission) {
    this.requiredPermission = requiredPermission;
    return this;
  }

   /**
   * The required permission necessary for this restriction.
   * @return requiredPermission
  **/
  @ApiModelProperty(example = "null", value = "The required permission necessary for this restriction.")
  public RequiredPermissionDTO getRequiredPermission() {
    return requiredPermission;
  }

  public void setRequiredPermission(RequiredPermissionDTO requiredPermission) {
    this.requiredPermission = requiredPermission;
  }

  public ComponentRestrictionPermissionDTO permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The permissions for this component restriction. Note: the read permission are not used and will always be false.
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "The permissions for this component restriction. Note: the read permission are not used and will always be false.")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentRestrictionPermissionDTO componentRestrictionPermissionDTO = (ComponentRestrictionPermissionDTO) o;
    return Objects.equals(this.requiredPermission, componentRestrictionPermissionDTO.requiredPermission) &&
        Objects.equals(this.permissions, componentRestrictionPermissionDTO.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredPermission, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentRestrictionPermissionDTO {\n");
    
    sb.append("    requiredPermission: ").append(toIndentedString(requiredPermission)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

