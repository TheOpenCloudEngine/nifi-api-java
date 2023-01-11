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

import java.util.*;


/**
 * VersionedControllerService
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class VersionedControllerService {
    @SerializedName("identifier")
    private String identifier = null;

    @SerializedName("instanceIdentifier")
    private String instanceIdentifier = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("comments")
    private String comments = null;

    @SerializedName("position")
    private Position position = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("bundle")
    private Bundle bundle = null;

    @SerializedName("properties")
    private Map<String, String> properties = new HashMap<String, String>();

    @SerializedName("propertyDescriptors")
    private Map<String, VersionedPropertyDescriptor> propertyDescriptors = new HashMap<String, VersionedPropertyDescriptor>();

    @SerializedName("controllerServiceApis")
    private List<ControllerServiceAPI> controllerServiceApis = new ArrayList<ControllerServiceAPI>();

    @SerializedName("annotationData")
    private String annotationData = null;
    @SerializedName("scheduledState")
    private ScheduledStateEnum scheduledState = null;
    @SerializedName("bulletinLevel")
    private String bulletinLevel = null;
    @SerializedName("componentType")
    private ComponentTypeEnum componentType = null;
    @SerializedName("groupIdentifier")
    private String groupIdentifier = null;

    public VersionedControllerService identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * The component's unique identifier
     * @return identifier
     **/
    @ApiModelProperty(example = "null", value = "The component's unique identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public VersionedControllerService instanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
        return this;
    }

    /**
     * The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component
     * @return instanceIdentifier
     **/
    @ApiModelProperty(example = "null", value = "The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component")
    public String getInstanceIdentifier() {
        return instanceIdentifier;
    }

    public void setInstanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
    }

    public VersionedControllerService name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The component's name
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "The component's name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VersionedControllerService comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * The user-supplied comments for the component
     * @return comments
     **/
    @ApiModelProperty(example = "null", value = "The user-supplied comments for the component")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public VersionedControllerService position(Position position) {
        this.position = position;
        return this;
    }

    /**
     * The component's position on the graph
     * @return position
     **/
    @ApiModelProperty(example = "null", value = "The component's position on the graph")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public VersionedControllerService type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the extension component
     * @return type
     **/
    @ApiModelProperty(example = "null", value = "The type of the extension component")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VersionedControllerService bundle(Bundle bundle) {
        this.bundle = bundle;
        return this;
    }

    /**
     * Information about the bundle from which the component came
     * @return bundle
     **/
    @ApiModelProperty(example = "null", value = "Information about the bundle from which the component came")
    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public VersionedControllerService properties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public VersionedControllerService putPropertiesItem(String key, String propertiesItem) {
        this.properties.put(key, propertiesItem);
        return this;
    }

    /**
     * The properties for the component. Properties whose value is not set will only contain the property name.
     * @return properties
     **/
    @ApiModelProperty(example = "null", value = "The properties for the component. Properties whose value is not set will only contain the property name.")
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public VersionedControllerService propertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
        this.propertyDescriptors = propertyDescriptors;
        return this;
    }

    public VersionedControllerService putPropertyDescriptorsItem(String key, VersionedPropertyDescriptor propertyDescriptorsItem) {
        this.propertyDescriptors.put(key, propertyDescriptorsItem);
        return this;
    }

    /**
     * The property descriptors for the component.
     * @return propertyDescriptors
     **/
    @ApiModelProperty(example = "null", value = "The property descriptors for the component.")
    public Map<String, VersionedPropertyDescriptor> getPropertyDescriptors() {
        return propertyDescriptors;
    }

    public void setPropertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
        this.propertyDescriptors = propertyDescriptors;
    }

    public VersionedControllerService controllerServiceApis(List<ControllerServiceAPI> controllerServiceApis) {
        this.controllerServiceApis = controllerServiceApis;
        return this;
    }

    public VersionedControllerService addControllerServiceApisItem(ControllerServiceAPI controllerServiceApisItem) {
        this.controllerServiceApis.add(controllerServiceApisItem);
        return this;
    }

    /**
     * Lists the APIs this Controller Service implements.
     * @return controllerServiceApis
     **/
    @ApiModelProperty(example = "null", value = "Lists the APIs this Controller Service implements.")
    public List<ControllerServiceAPI> getControllerServiceApis() {
        return controllerServiceApis;
    }

    public void setControllerServiceApis(List<ControllerServiceAPI> controllerServiceApis) {
        this.controllerServiceApis = controllerServiceApis;
    }

    public VersionedControllerService annotationData(String annotationData) {
        this.annotationData = annotationData;
        return this;
    }

    /**
     * The annotation for the controller service. This is how the custom UI relays configuration to the controller service.
     * @return annotationData
     **/
    @ApiModelProperty(example = "null", value = "The annotation for the controller service. This is how the custom UI relays configuration to the controller service.")
    public String getAnnotationData() {
        return annotationData;
    }

    public void setAnnotationData(String annotationData) {
        this.annotationData = annotationData;
    }

    public VersionedControllerService scheduledState(ScheduledStateEnum scheduledState) {
        this.scheduledState = scheduledState;
        return this;
    }

    /**
     * The ScheduledState denoting whether the Controller Service is ENABLED or DISABLED
     * @return scheduledState
     **/
    @ApiModelProperty(example = "null", value = "The ScheduledState denoting whether the Controller Service is ENABLED or DISABLED")
    public ScheduledStateEnum getScheduledState() {
        return scheduledState;
    }

    public void setScheduledState(ScheduledStateEnum scheduledState) {
        this.scheduledState = scheduledState;
    }

    public VersionedControllerService bulletinLevel(String bulletinLevel) {
        this.bulletinLevel = bulletinLevel;
        return this;
    }

    /**
     * The level at which the controller service will report bulletins.
     * @return bulletinLevel
     **/
    @ApiModelProperty(example = "null", value = "The level at which the controller service will report bulletins.")
    public String getBulletinLevel() {
        return bulletinLevel;
    }

    public void setBulletinLevel(String bulletinLevel) {
        this.bulletinLevel = bulletinLevel;
    }

    public VersionedControllerService componentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * Get componentType
     * @return componentType
     **/
    @ApiModelProperty(example = "null", value = "")
    public ComponentTypeEnum getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
    }

    public VersionedControllerService groupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
        return this;
    }

    /**
     * The ID of the Process Group that this component belongs to
     * @return groupIdentifier
     **/
    @ApiModelProperty(example = "null", value = "The ID of the Process Group that this component belongs to")
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionedControllerService versionedControllerService = (VersionedControllerService) o;
        return Objects.equals(this.identifier, versionedControllerService.identifier) &&
                Objects.equals(this.instanceIdentifier, versionedControllerService.instanceIdentifier) &&
                Objects.equals(this.name, versionedControllerService.name) &&
                Objects.equals(this.comments, versionedControllerService.comments) &&
                Objects.equals(this.position, versionedControllerService.position) &&
                Objects.equals(this.type, versionedControllerService.type) &&
                Objects.equals(this.bundle, versionedControllerService.bundle) &&
                Objects.equals(this.properties, versionedControllerService.properties) &&
                Objects.equals(this.propertyDescriptors, versionedControllerService.propertyDescriptors) &&
                Objects.equals(this.controllerServiceApis, versionedControllerService.controllerServiceApis) &&
                Objects.equals(this.annotationData, versionedControllerService.annotationData) &&
                Objects.equals(this.scheduledState, versionedControllerService.scheduledState) &&
                Objects.equals(this.bulletinLevel, versionedControllerService.bulletinLevel) &&
                Objects.equals(this.componentType, versionedControllerService.componentType) &&
                Objects.equals(this.groupIdentifier, versionedControllerService.groupIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, instanceIdentifier, name, comments, position, type, bundle, properties, propertyDescriptors, controllerServiceApis, annotationData, scheduledState, bulletinLevel, componentType, groupIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionedControllerService {\n");

        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    propertyDescriptors: ").append(toIndentedString(propertyDescriptors)).append("\n");
        sb.append("    controllerServiceApis: ").append(toIndentedString(controllerServiceApis)).append("\n");
        sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
        sb.append("    scheduledState: ").append(toIndentedString(scheduledState)).append("\n");
        sb.append("    bulletinLevel: ").append(toIndentedString(bulletinLevel)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
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
     * The ScheduledState denoting whether the Controller Service is ENABLED or DISABLED
     */
    public enum ScheduledStateEnum {
        @SerializedName("ENABLED")
        ENABLED("ENABLED"),

        @SerializedName("DISABLED")
        DISABLED("DISABLED"),

        @SerializedName("RUNNING")
        RUNNING("RUNNING");

        private String value;

        ScheduledStateEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Gets or Sets componentType
     */
    public enum ComponentTypeEnum {
        @SerializedName("CONNECTION")
        CONNECTION("CONNECTION"),

        @SerializedName("PROCESSOR")
        PROCESSOR("PROCESSOR"),

        @SerializedName("PROCESS_GROUP")
        PROCESS_GROUP("PROCESS_GROUP"),

        @SerializedName("REMOTE_PROCESS_GROUP")
        REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),

        @SerializedName("INPUT_PORT")
        INPUT_PORT("INPUT_PORT"),

        @SerializedName("OUTPUT_PORT")
        OUTPUT_PORT("OUTPUT_PORT"),

        @SerializedName("REMOTE_INPUT_PORT")
        REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),

        @SerializedName("REMOTE_OUTPUT_PORT")
        REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),

        @SerializedName("FUNNEL")
        FUNNEL("FUNNEL"),

        @SerializedName("LABEL")
        LABEL("LABEL"),

        @SerializedName("CONTROLLER_SERVICE")
        CONTROLLER_SERVICE("CONTROLLER_SERVICE"),

        @SerializedName("REPORTING_TASK")
        REPORTING_TASK("REPORTING_TASK"),

        @SerializedName("PARAMETER_CONTEXT")
        PARAMETER_CONTEXT("PARAMETER_CONTEXT"),

        @SerializedName("PARAMETER_PROVIDER")
        PARAMETER_PROVIDER("PARAMETER_PROVIDER"),

        @SerializedName("TEMPLATE")
        TEMPLATE("TEMPLATE"),

        @SerializedName("FLOW_REGISTRY_CLIENT")
        FLOW_REGISTRY_CLIENT("FLOW_REGISTRY_CLIENT");

        private String value;

        ComponentTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

