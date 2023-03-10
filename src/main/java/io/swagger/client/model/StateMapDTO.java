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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * StateMapDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class StateMapDTO {
    @SerializedName("scope")
    private String scope = null;

    @SerializedName("totalEntryCount")
    private Integer totalEntryCount = null;

    @SerializedName("state")
    private List<StateEntryDTO> state = new ArrayList<StateEntryDTO>();

    public StateMapDTO scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * The scope of this StateMap.
     * @return scope
     **/
    @ApiModelProperty(example = "null", value = "The scope of this StateMap.")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public StateMapDTO totalEntryCount(Integer totalEntryCount) {
        this.totalEntryCount = totalEntryCount;
        return this;
    }

    /**
     * The total number of state entries. When the state map is lengthy, only of portion of the entries are returned.
     * @return totalEntryCount
     **/
    @ApiModelProperty(example = "null", value = "The total number of state entries. When the state map is lengthy, only of portion of the entries are returned.")
    public Integer getTotalEntryCount() {
        return totalEntryCount;
    }

    public void setTotalEntryCount(Integer totalEntryCount) {
        this.totalEntryCount = totalEntryCount;
    }

    public StateMapDTO state(List<StateEntryDTO> state) {
        this.state = state;
        return this;
    }

    public StateMapDTO addStateItem(StateEntryDTO stateItem) {
        this.state.add(stateItem);
        return this;
    }

    /**
     * The state.
     * @return state
     **/
    @ApiModelProperty(example = "null", value = "The state.")
    public List<StateEntryDTO> getState() {
        return state;
    }

    public void setState(List<StateEntryDTO> state) {
        this.state = state;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StateMapDTO stateMapDTO = (StateMapDTO) o;
        return Objects.equals(this.scope, stateMapDTO.scope) &&
                Objects.equals(this.totalEntryCount, stateMapDTO.totalEntryCount) &&
                Objects.equals(this.state, stateMapDTO.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, totalEntryCount, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StateMapDTO {\n");

        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

