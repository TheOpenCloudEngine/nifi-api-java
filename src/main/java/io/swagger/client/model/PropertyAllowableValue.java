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
 * PropertyAllowableValue
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class PropertyAllowableValue {
    @SerializedName("value")
    private String value = null;

    @SerializedName("displayName")
    private String displayName = null;

    @SerializedName("description")
    private String description = null;

    public PropertyAllowableValue value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The internal value
     * @return value
     **/
    @ApiModelProperty(example = "null", required = true, value = "The internal value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PropertyAllowableValue displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The display name of the value, if different from the internal value
     * @return displayName
     **/
    @ApiModelProperty(example = "null", value = "The display name of the value, if different from the internal value")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PropertyAllowableValue description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the value, e.g., the behavior it produces.
     * @return description
     **/
    @ApiModelProperty(example = "null", value = "The description of the value, e.g., the behavior it produces.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyAllowableValue propertyAllowableValue = (PropertyAllowableValue) o;
        return Objects.equals(this.value, propertyAllowableValue.value) &&
                Objects.equals(this.displayName, propertyAllowableValue.displayName) &&
                Objects.equals(this.description, propertyAllowableValue.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, displayName, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyAllowableValue {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

