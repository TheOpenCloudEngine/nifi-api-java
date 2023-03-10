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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * UpdateControllerServiceReferenceRequestEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class UpdateControllerServiceReferenceRequestEntity {
    @SerializedName("id")
    private String id = null;
    @SerializedName("state")
    private StateEnum state = null;
    @SerializedName("referencingComponentRevisions")
    private Map<String, RevisionDTO> referencingComponentRevisions = new HashMap<String, RevisionDTO>();
    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;
    @SerializedName("uiOnly")
    private Boolean uiOnly = null;

    public UpdateControllerServiceReferenceRequestEntity id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The identifier of the Controller Service.
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The identifier of the Controller Service.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateControllerServiceReferenceRequestEntity state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The new state of the references for the controller service.
     * @return state
     **/
    @ApiModelProperty(example = "null", value = "The new state of the references for the controller service.")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public UpdateControllerServiceReferenceRequestEntity referencingComponentRevisions(Map<String, RevisionDTO> referencingComponentRevisions) {
        this.referencingComponentRevisions = referencingComponentRevisions;
        return this;
    }

    public UpdateControllerServiceReferenceRequestEntity putReferencingComponentRevisionsItem(String key, RevisionDTO referencingComponentRevisionsItem) {
        this.referencingComponentRevisions.put(key, referencingComponentRevisionsItem);
        return this;
    }

    /**
     * The revisions for all referencing components.
     * @return referencingComponentRevisions
     **/
    @ApiModelProperty(example = "null", value = "The revisions for all referencing components.")
    public Map<String, RevisionDTO> getReferencingComponentRevisions() {
        return referencingComponentRevisions;
    }

    public void setReferencingComponentRevisions(Map<String, RevisionDTO> referencingComponentRevisions) {
        this.referencingComponentRevisions = referencingComponentRevisions;
    }

    public UpdateControllerServiceReferenceRequestEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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

    public UpdateControllerServiceReferenceRequestEntity uiOnly(Boolean uiOnly) {
        this.uiOnly = uiOnly;
        return this;
    }

    /**
     * Indicates whether or not the response should only include fields necessary for rendering the NiFi User Interface. As such, when this value is set to true, some fields may be returned as null values, and the selected fields may change at any time without notice. As a result, this value should not be set to true by any client other than the UI.
     * @return uiOnly
     **/
    @ApiModelProperty(example = "null", value = "Indicates whether or not the response should only include fields necessary for rendering the NiFi User Interface. As such, when this value is set to true, some fields may be returned as null values, and the selected fields may change at any time without notice. As a result, this value should not be set to true by any client other than the UI.")
    public Boolean getUiOnly() {
        return uiOnly;
    }

    public void setUiOnly(Boolean uiOnly) {
        this.uiOnly = uiOnly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateControllerServiceReferenceRequestEntity updateControllerServiceReferenceRequestEntity = (UpdateControllerServiceReferenceRequestEntity) o;
        return Objects.equals(this.id, updateControllerServiceReferenceRequestEntity.id) &&
                Objects.equals(this.state, updateControllerServiceReferenceRequestEntity.state) &&
                Objects.equals(this.referencingComponentRevisions, updateControllerServiceReferenceRequestEntity.referencingComponentRevisions) &&
                Objects.equals(this.disconnectedNodeAcknowledged, updateControllerServiceReferenceRequestEntity.disconnectedNodeAcknowledged) &&
                Objects.equals(this.uiOnly, updateControllerServiceReferenceRequestEntity.uiOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, referencingComponentRevisions, disconnectedNodeAcknowledged, uiOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateControllerServiceReferenceRequestEntity {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    referencingComponentRevisions: ").append(toIndentedString(referencingComponentRevisions)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
        sb.append("    uiOnly: ").append(toIndentedString(uiOnly)).append("\n");
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
     * The new state of the references for the controller service.
     */
    public enum StateEnum {
        @SerializedName("ENABLED")
        ENABLED("ENABLED"),

        @SerializedName("DISABLED")
        DISABLED("DISABLED"),

        @SerializedName("RUNNING")
        RUNNING("RUNNING"),

        @SerializedName("STOPPED")
        STOPPED("STOPPED");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

