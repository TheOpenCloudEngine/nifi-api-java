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
 * ScheduleComponentsEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ScheduleComponentsEntity {
    @SerializedName("id")
    private String id = null;
    @SerializedName("state")
    private StateEnum state = null;
    @SerializedName("components")
    private Map<String, RevisionDTO> components = new HashMap<String, RevisionDTO>();
    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    public ScheduleComponentsEntity id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the ProcessGroup
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The id of the ProcessGroup")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScheduleComponentsEntity state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The desired state of the descendant components
     * @return state
     **/
    @ApiModelProperty(example = "null", value = "The desired state of the descendant components")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ScheduleComponentsEntity components(Map<String, RevisionDTO> components) {
        this.components = components;
        return this;
    }

    public ScheduleComponentsEntity putComponentsItem(String key, RevisionDTO componentsItem) {
        this.components.put(key, componentsItem);
        return this;
    }

    /**
     * Optional components to schedule. If not specified, all authorized descendant components will be used.
     * @return components
     **/
    @ApiModelProperty(example = "null", value = "Optional components to schedule. If not specified, all authorized descendant components will be used.")
    public Map<String, RevisionDTO> getComponents() {
        return components;
    }

    public void setComponents(Map<String, RevisionDTO> components) {
        this.components = components;
    }

    public ScheduleComponentsEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScheduleComponentsEntity scheduleComponentsEntity = (ScheduleComponentsEntity) o;
        return Objects.equals(this.id, scheduleComponentsEntity.id) &&
                Objects.equals(this.state, scheduleComponentsEntity.state) &&
                Objects.equals(this.components, scheduleComponentsEntity.components) &&
                Objects.equals(this.disconnectedNodeAcknowledged, scheduleComponentsEntity.disconnectedNodeAcknowledged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, components, disconnectedNodeAcknowledged);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleComponentsEntity {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
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
     * The desired state of the descendant components
     */
    public enum StateEnum {
        @SerializedName("RUNNING")
        RUNNING("RUNNING"),

        @SerializedName("STOPPED")
        STOPPED("STOPPED"),

        @SerializedName("ENABLED")
        ENABLED("ENABLED"),

        @SerializedName("DISABLED")
        DISABLED("DISABLED");

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

