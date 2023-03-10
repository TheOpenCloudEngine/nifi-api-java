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
 * RunStatusDetailsRequestEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class RunStatusDetailsRequestEntity {
    @SerializedName("processorIds")
    private List<String> processorIds = new ArrayList<String>();

    public RunStatusDetailsRequestEntity processorIds(List<String> processorIds) {
        this.processorIds = processorIds;
        return this;
    }

    public RunStatusDetailsRequestEntity addProcessorIdsItem(String processorIdsItem) {
        this.processorIds.add(processorIdsItem);
        return this;
    }

    /**
     * The IDs of all processors whose run status details should be provided
     * @return processorIds
     **/
    @ApiModelProperty(example = "null", value = "The IDs of all processors whose run status details should be provided")
    public List<String> getProcessorIds() {
        return processorIds;
    }

    public void setProcessorIds(List<String> processorIds) {
        this.processorIds = processorIds;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStatusDetailsRequestEntity runStatusDetailsRequestEntity = (RunStatusDetailsRequestEntity) o;
        return Objects.equals(this.processorIds, runStatusDetailsRequestEntity.processorIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processorIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStatusDetailsRequestEntity {\n");

        sb.append("    processorIds: ").append(toIndentedString(processorIds)).append("\n");
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

