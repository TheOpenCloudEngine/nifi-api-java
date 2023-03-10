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
 * AccessPolicySummaryDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class AccessPolicySummaryDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("versionedComponentId")
    private String versionedComponentId = null;

    @SerializedName("parentGroupId")
    private String parentGroupId = null;

    @SerializedName("position")
    private PositionDTO position = null;

    @SerializedName("resource")
    private String resource = null;
    @SerializedName("action")
    private ActionEnum action = null;
    @SerializedName("componentReference")
    private ComponentReferenceEntity componentReference = null;
    @SerializedName("configurable")
    private Boolean configurable = null;

    public AccessPolicySummaryDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the component.
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The id of the component.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccessPolicySummaryDTO versionedComponentId(String versionedComponentId) {
        this.versionedComponentId = versionedComponentId;
        return this;
    }

    /**
     * The ID of the corresponding component that is under version control
     * @return versionedComponentId
     **/
    @ApiModelProperty(example = "null", value = "The ID of the corresponding component that is under version control")
    public String getVersionedComponentId() {
        return versionedComponentId;
    }

    public void setVersionedComponentId(String versionedComponentId) {
        this.versionedComponentId = versionedComponentId;
    }

    public AccessPolicySummaryDTO parentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }

    /**
     * The id of parent process group of this component if applicable.
     * @return parentGroupId
     **/
    @ApiModelProperty(example = "null", value = "The id of parent process group of this component if applicable.")
    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public AccessPolicySummaryDTO position(PositionDTO position) {
        this.position = position;
        return this;
    }

    /**
     * The position of this component in the UI if applicable.
     * @return position
     **/
    @ApiModelProperty(example = "null", value = "The position of this component in the UI if applicable.")
    public PositionDTO getPosition() {
        return position;
    }

    public void setPosition(PositionDTO position) {
        this.position = position;
    }

    public AccessPolicySummaryDTO resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * The resource for this access policy.
     * @return resource
     **/
    @ApiModelProperty(example = "null", value = "The resource for this access policy.")
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public AccessPolicySummaryDTO action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * The action associated with this access policy.
     * @return action
     **/
    @ApiModelProperty(example = "null", value = "The action associated with this access policy.")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public AccessPolicySummaryDTO componentReference(ComponentReferenceEntity componentReference) {
        this.componentReference = componentReference;
        return this;
    }

    /**
     * Component this policy references if applicable.
     * @return componentReference
     **/
    @ApiModelProperty(example = "null", value = "Component this policy references if applicable.")
    public ComponentReferenceEntity getComponentReference() {
        return componentReference;
    }

    public void setComponentReference(ComponentReferenceEntity componentReference) {
        this.componentReference = componentReference;
    }

    public AccessPolicySummaryDTO configurable(Boolean configurable) {
        this.configurable = configurable;
        return this;
    }

    /**
     * Whether this policy is configurable.
     * @return configurable
     **/
    @ApiModelProperty(example = "null", value = "Whether this policy is configurable.")
    public Boolean getConfigurable() {
        return configurable;
    }

    public void setConfigurable(Boolean configurable) {
        this.configurable = configurable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessPolicySummaryDTO accessPolicySummaryDTO = (AccessPolicySummaryDTO) o;
        return Objects.equals(this.id, accessPolicySummaryDTO.id) &&
                Objects.equals(this.versionedComponentId, accessPolicySummaryDTO.versionedComponentId) &&
                Objects.equals(this.parentGroupId, accessPolicySummaryDTO.parentGroupId) &&
                Objects.equals(this.position, accessPolicySummaryDTO.position) &&
                Objects.equals(this.resource, accessPolicySummaryDTO.resource) &&
                Objects.equals(this.action, accessPolicySummaryDTO.action) &&
                Objects.equals(this.componentReference, accessPolicySummaryDTO.componentReference) &&
                Objects.equals(this.configurable, accessPolicySummaryDTO.configurable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, versionedComponentId, parentGroupId, position, resource, action, componentReference, configurable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicySummaryDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
        sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    componentReference: ").append(toIndentedString(componentReference)).append("\n");
        sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
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

    /**
     * The action associated with this access policy.
     */
    public enum ActionEnum {
        @SerializedName("read")
        READ("read"),

        @SerializedName("write")
        WRITE("write");

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

