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
 * CounterDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class CounterDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("context")
    private String context = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("valueCount")
    private Long valueCount = null;

    @SerializedName("value")
    private String value = null;

    public CounterDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the counter.
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The id of the counter.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CounterDTO context(String context) {
        this.context = context;
        return this;
    }

    /**
     * The context of the counter.
     * @return context
     **/
    @ApiModelProperty(example = "null", value = "The context of the counter.")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public CounterDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the counter.
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "The name of the counter.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CounterDTO valueCount(Long valueCount) {
        this.valueCount = valueCount;
        return this;
    }

    /**
     * The value count.
     * @return valueCount
     **/
    @ApiModelProperty(example = "null", value = "The value count.")
    public Long getValueCount() {
        return valueCount;
    }

    public void setValueCount(Long valueCount) {
        this.valueCount = valueCount;
    }

    public CounterDTO value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the counter.
     * @return value
     **/
    @ApiModelProperty(example = "null", value = "The value of the counter.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CounterDTO counterDTO = (CounterDTO) o;
        return Objects.equals(this.id, counterDTO.id) &&
                Objects.equals(this.context, counterDTO.context) &&
                Objects.equals(this.name, counterDTO.name) &&
                Objects.equals(this.valueCount, counterDTO.valueCount) &&
                Objects.equals(this.value, counterDTO.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, context, name, valueCount, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CounterDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    valueCount: ").append(toIndentedString(valueCount)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

