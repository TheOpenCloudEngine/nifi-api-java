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
 * PropertyDescriptor
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class PropertyDescriptor {
    @SerializedName("name")
    private String name = null;

    @SerializedName("displayName")
    private String displayName = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("allowableValues")
    private List<PropertyAllowableValue> allowableValues = new ArrayList<PropertyAllowableValue>();

    @SerializedName("defaultValue")
    private String defaultValue = null;

    @SerializedName("required")
    private Boolean required = null;

    @SerializedName("sensitive")
    private Boolean sensitive = null;
    @SerializedName("expressionLanguageScope")
    private ExpressionLanguageScopeEnum expressionLanguageScope = null;
    @SerializedName("expressionLanguageScopeDescription")
    private String expressionLanguageScopeDescription = null;
    @SerializedName("typeProvidedByValue")
    private DefinedType typeProvidedByValue = null;
    @SerializedName("validRegex")
    private String validRegex = null;
    @SerializedName("validator")
    private String validator = null;
    @SerializedName("dynamic")
    private Boolean dynamic = null;
    @SerializedName("resourceDefinition")
    private PropertyResourceDefinition resourceDefinition = null;
    @SerializedName("dependencies")
    private List<PropertyDependency> dependencies = new ArrayList<PropertyDependency>();

    public PropertyDescriptor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the property key
     * @return name
     **/
    @ApiModelProperty(example = "null", required = true, value = "The name of the property key")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PropertyDescriptor displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The display name of the property key, if different from the name
     * @return displayName
     **/
    @ApiModelProperty(example = "null", value = "The display name of the property key, if different from the name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PropertyDescriptor description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of what the property does
     * @return description
     **/
    @ApiModelProperty(example = "null", value = "The description of what the property does")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PropertyDescriptor allowableValues(List<PropertyAllowableValue> allowableValues) {
        this.allowableValues = allowableValues;
        return this;
    }

    public PropertyDescriptor addAllowableValuesItem(PropertyAllowableValue allowableValuesItem) {
        this.allowableValues.add(allowableValuesItem);
        return this;
    }

    /**
     * A list of the allowable values for the property
     * @return allowableValues
     **/
    @ApiModelProperty(example = "null", value = "A list of the allowable values for the property")
    public List<PropertyAllowableValue> getAllowableValues() {
        return allowableValues;
    }

    public void setAllowableValues(List<PropertyAllowableValue> allowableValues) {
        this.allowableValues = allowableValues;
    }

    public PropertyDescriptor defaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * The default value if a user-set value is not specified
     * @return defaultValue
     **/
    @ApiModelProperty(example = "null", value = "The default value if a user-set value is not specified")
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public PropertyDescriptor required(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Whether or not  the property is required for the component
     * @return required
     **/
    @ApiModelProperty(example = "null", value = "Whether or not  the property is required for the component")
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public PropertyDescriptor sensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * Whether or not  the value of the property is considered sensitive (e.g., passwords and keys)
     * @return sensitive
     **/
    @ApiModelProperty(example = "null", value = "Whether or not  the value of the property is considered sensitive (e.g., passwords and keys)")
    public Boolean getSensitive() {
        return sensitive;
    }

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    public PropertyDescriptor expressionLanguageScope(ExpressionLanguageScopeEnum expressionLanguageScope) {
        this.expressionLanguageScope = expressionLanguageScope;
        return this;
    }

    /**
     * The scope of expression language supported by this property
     * @return expressionLanguageScope
     **/
    @ApiModelProperty(example = "null", value = "The scope of expression language supported by this property")
    public ExpressionLanguageScopeEnum getExpressionLanguageScope() {
        return expressionLanguageScope;
    }

    public void setExpressionLanguageScope(ExpressionLanguageScopeEnum expressionLanguageScope) {
        this.expressionLanguageScope = expressionLanguageScope;
    }

    /**
     * The description of the expression language scope supported by this property
     * @return expressionLanguageScopeDescription
     **/
    @ApiModelProperty(example = "null", value = "The description of the expression language scope supported by this property")
    public String getExpressionLanguageScopeDescription() {
        return expressionLanguageScopeDescription;
    }

    public PropertyDescriptor typeProvidedByValue(DefinedType typeProvidedByValue) {
        this.typeProvidedByValue = typeProvidedByValue;
        return this;
    }

    /**
     * Indicates that this property is for selecting a controller service of the specified type
     * @return typeProvidedByValue
     **/
    @ApiModelProperty(example = "null", value = "Indicates that this property is for selecting a controller service of the specified type")
    public DefinedType getTypeProvidedByValue() {
        return typeProvidedByValue;
    }

    public void setTypeProvidedByValue(DefinedType typeProvidedByValue) {
        this.typeProvidedByValue = typeProvidedByValue;
    }

    public PropertyDescriptor validRegex(String validRegex) {
        this.validRegex = validRegex;
        return this;
    }

    /**
     * A regular expression that can be used to validate the value of this property
     * @return validRegex
     **/
    @ApiModelProperty(example = "null", value = "A regular expression that can be used to validate the value of this property")
    public String getValidRegex() {
        return validRegex;
    }

    public void setValidRegex(String validRegex) {
        this.validRegex = validRegex;
    }

    public PropertyDescriptor validator(String validator) {
        this.validator = validator;
        return this;
    }

    /**
     * Name of the validator used for this property descriptor
     * @return validator
     **/
    @ApiModelProperty(example = "null", value = "Name of the validator used for this property descriptor")
    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    public PropertyDescriptor dynamic(Boolean dynamic) {
        this.dynamic = dynamic;
        return this;
    }

    /**
     * Whether or not the descriptor is for a dynamically added property
     * @return dynamic
     **/
    @ApiModelProperty(example = "null", value = "Whether or not the descriptor is for a dynamically added property")
    public Boolean getDynamic() {
        return dynamic;
    }

    public void setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
    }

    public PropertyDescriptor resourceDefinition(PropertyResourceDefinition resourceDefinition) {
        this.resourceDefinition = resourceDefinition;
        return this;
    }

    /**
     * Indicates that this property references external resources
     * @return resourceDefinition
     **/
    @ApiModelProperty(example = "null", value = "Indicates that this property references external resources")
    public PropertyResourceDefinition getResourceDefinition() {
        return resourceDefinition;
    }

    public void setResourceDefinition(PropertyResourceDefinition resourceDefinition) {
        this.resourceDefinition = resourceDefinition;
    }

    public PropertyDescriptor dependencies(List<PropertyDependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public PropertyDescriptor addDependenciesItem(PropertyDependency dependenciesItem) {
        this.dependencies.add(dependenciesItem);
        return this;
    }

    /**
     * The dependencies that this property has on other properties
     * @return dependencies
     **/
    @ApiModelProperty(example = "null", value = "The dependencies that this property has on other properties")
    public List<PropertyDependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<PropertyDependency> dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) o;
        return Objects.equals(this.name, propertyDescriptor.name) &&
                Objects.equals(this.displayName, propertyDescriptor.displayName) &&
                Objects.equals(this.description, propertyDescriptor.description) &&
                Objects.equals(this.allowableValues, propertyDescriptor.allowableValues) &&
                Objects.equals(this.defaultValue, propertyDescriptor.defaultValue) &&
                Objects.equals(this.required, propertyDescriptor.required) &&
                Objects.equals(this.sensitive, propertyDescriptor.sensitive) &&
                Objects.equals(this.expressionLanguageScope, propertyDescriptor.expressionLanguageScope) &&
                Objects.equals(this.expressionLanguageScopeDescription, propertyDescriptor.expressionLanguageScopeDescription) &&
                Objects.equals(this.typeProvidedByValue, propertyDescriptor.typeProvidedByValue) &&
                Objects.equals(this.validRegex, propertyDescriptor.validRegex) &&
                Objects.equals(this.validator, propertyDescriptor.validator) &&
                Objects.equals(this.dynamic, propertyDescriptor.dynamic) &&
                Objects.equals(this.resourceDefinition, propertyDescriptor.resourceDefinition) &&
                Objects.equals(this.dependencies, propertyDescriptor.dependencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, description, allowableValues, defaultValue, required, sensitive, expressionLanguageScope, expressionLanguageScopeDescription, typeProvidedByValue, validRegex, validator, dynamic, resourceDefinition, dependencies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyDescriptor {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    allowableValues: ").append(toIndentedString(allowableValues)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
        sb.append("    expressionLanguageScope: ").append(toIndentedString(expressionLanguageScope)).append("\n");
        sb.append("    expressionLanguageScopeDescription: ").append(toIndentedString(expressionLanguageScopeDescription)).append("\n");
        sb.append("    typeProvidedByValue: ").append(toIndentedString(typeProvidedByValue)).append("\n");
        sb.append("    validRegex: ").append(toIndentedString(validRegex)).append("\n");
        sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
        sb.append("    dynamic: ").append(toIndentedString(dynamic)).append("\n");
        sb.append("    resourceDefinition: ").append(toIndentedString(resourceDefinition)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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
     * The scope of expression language supported by this property
     */
    public enum ExpressionLanguageScopeEnum {
        @SerializedName("NONE")
        NONE("NONE"),

        @SerializedName("VARIABLE_REGISTRY")
        VARIABLE_REGISTRY("VARIABLE_REGISTRY"),

        @SerializedName("FLOWFILE_ATTRIBUTES")
        FLOWFILE_ATTRIBUTES("FLOWFILE_ATTRIBUTES");

        private String value;

        ExpressionLanguageScopeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

