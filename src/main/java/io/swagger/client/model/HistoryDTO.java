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
 * HistoryDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class HistoryDTO {
    @SerializedName("total")
    private Integer total = null;

    @SerializedName("lastRefreshed")
    private String lastRefreshed = null;

    @SerializedName("actions")
    private List<ActionEntity> actions = new ArrayList<ActionEntity>();

    public HistoryDTO total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * The number of number of actions that matched the search criteria..
     * @return total
     **/
    @ApiModelProperty(example = "null", value = "The number of number of actions that matched the search criteria..")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public HistoryDTO lastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
        return this;
    }

    /**
     * The timestamp when the report was generated.
     * @return lastRefreshed
     **/
    @ApiModelProperty(example = "null", value = "The timestamp when the report was generated.")
    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public HistoryDTO actions(List<ActionEntity> actions) {
        this.actions = actions;
        return this;
    }

    public HistoryDTO addActionsItem(ActionEntity actionsItem) {
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * The actions.
     * @return actions
     **/
    @ApiModelProperty(example = "null", value = "The actions.")
    public List<ActionEntity> getActions() {
        return actions;
    }

    public void setActions(List<ActionEntity> actions) {
        this.actions = actions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryDTO historyDTO = (HistoryDTO) o;
        return Objects.equals(this.total, historyDTO.total) &&
                Objects.equals(this.lastRefreshed, historyDTO.lastRefreshed) &&
                Objects.equals(this.actions, historyDTO.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, lastRefreshed, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryDTO {\n");

        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

