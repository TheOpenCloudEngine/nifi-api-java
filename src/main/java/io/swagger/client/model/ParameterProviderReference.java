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
 * ParameterProviderReference
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ParameterProviderReference {
    @SerializedName("identifier")
    private String identifier = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("bundle")
    private Bundle bundle = null;

    public ParameterProviderReference identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * The identifier of the parameter provider
     * @return identifier
     **/
    @ApiModelProperty(example = "null", value = "The identifier of the parameter provider")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ParameterProviderReference name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the parameter provider
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "The name of the parameter provider")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParameterProviderReference type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The fully qualified name of the parameter provider class.
     * @return type
     **/
    @ApiModelProperty(example = "null", value = "The fully qualified name of the parameter provider class.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ParameterProviderReference bundle(Bundle bundle) {
        this.bundle = bundle;
        return this;
    }

    /**
     * The details of the artifact that bundled this parameter provider.
     * @return bundle
     **/
    @ApiModelProperty(example = "null", value = "The details of the artifact that bundled this parameter provider.")
    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParameterProviderReference parameterProviderReference = (ParameterProviderReference) o;
        return Objects.equals(this.identifier, parameterProviderReference.identifier) &&
                Objects.equals(this.name, parameterProviderReference.name) &&
                Objects.equals(this.type, parameterProviderReference.type) &&
                Objects.equals(this.bundle, parameterProviderReference.bundle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, name, type, bundle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterProviderReference {\n");

        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
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

