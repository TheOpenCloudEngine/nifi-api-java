/**
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 * <p>
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * ControllerConfigurationEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ControllerConfigurationEntity {
    @SerializedName("revision")
    private RevisionDTO revision = null;

    @SerializedName("permissions")
    private PermissionsDTO permissions = null;

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    @SerializedName("component")
    private ControllerConfigurationDTO component = null;

    public ControllerConfigurationEntity revision(RevisionDTO revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
     * @return revision
     **/
    @ApiModelProperty(example = "null", value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
    public RevisionDTO getRevision() {
        return revision;
    }

    public void setRevision(RevisionDTO revision) {
        this.revision = revision;
    }

    public ControllerConfigurationEntity permissions(PermissionsDTO permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * The permissions for this component.
     * @return permissions
     **/
    @ApiModelProperty(example = "null", value = "The permissions for this component.")
    public PermissionsDTO getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsDTO permissions) {
        this.permissions = permissions;
    }

    public ControllerConfigurationEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
        return this;
    }

    /**
     * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
     * @return disconnectedNodeAcknowledged
     **/
    @ApiModelProperty(example = "null", value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
    public Boolean getDisconnectedNodeAcknowledged() {
        return disconnectedNodeAcknowledged;
    }

    public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    }

    public ControllerConfigurationEntity component(ControllerConfigurationDTO component) {
        this.component = component;
        return this;
    }

    /**
     * The controller configuration.
     * @return component
     **/
    @ApiModelProperty(example = "null", value = "The controller configuration.")
    public ControllerConfigurationDTO getComponent() {
        return component;
    }

    public void setComponent(ControllerConfigurationDTO component) {
        this.component = component;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ControllerConfigurationEntity controllerConfigurationEntity = (ControllerConfigurationEntity) o;
        return Objects.equals(this.revision, controllerConfigurationEntity.revision) &&
                Objects.equals(this.permissions, controllerConfigurationEntity.permissions) &&
                Objects.equals(this.disconnectedNodeAcknowledged, controllerConfigurationEntity.disconnectedNodeAcknowledged) &&
                Objects.equals(this.component, controllerConfigurationEntity.component);
    }

    @Override
    public int hashCode() {
        return Objects.hash(revision, permissions, disconnectedNodeAcknowledged, component);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ControllerConfigurationEntity {\n");

        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
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

