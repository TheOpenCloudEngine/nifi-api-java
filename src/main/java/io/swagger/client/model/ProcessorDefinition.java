/**
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BuildInfo;
import io.swagger.client.model.DefinedType;
import io.swagger.client.model.PropertyDescriptor;
import io.swagger.client.model.Relationship;
import io.swagger.client.model.Restriction;
import io.swagger.client.model.Stateful;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ProcessorDefinition
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ProcessorDefinition   {
  @SerializedName("group")
  private String group = null;

  @SerializedName("artifact")
  private String artifact = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("typeDescription")
  private String typeDescription = null;

  @SerializedName("buildInfo")
  private BuildInfo buildInfo = null;

  @SerializedName("providedApiImplementations")
  private List<DefinedType> providedApiImplementations = new ArrayList<DefinedType>();

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("deprecated")
  private Boolean deprecated = null;

  @SerializedName("deprecationReason")
  private String deprecationReason = null;

  @SerializedName("restricted")
  private Boolean restricted = null;

  @SerializedName("restrictedExplanation")
  private String restrictedExplanation = null;

  @SerializedName("explicitRestrictions")
  private List<Restriction> explicitRestrictions = new ArrayList<Restriction>();

  @SerializedName("stateful")
  private Stateful stateful = null;

  @SerializedName("propertyDescriptors")
  private Map<String, PropertyDescriptor> propertyDescriptors = new HashMap<String, PropertyDescriptor>();

  @SerializedName("supportsDynamicProperties")
  private Boolean supportsDynamicProperties = null;

  /**
   * Any input requirements this processor has.
   */
  public enum InputRequirementEnum {
    @SerializedName("INPUT_REQUIRED")
    REQUIRED("INPUT_REQUIRED"),
    
    @SerializedName("INPUT_ALLOWED")
    ALLOWED("INPUT_ALLOWED"),
    
    @SerializedName("INPUT_FORBIDDEN")
    FORBIDDEN("INPUT_FORBIDDEN");

    private String value;

    InputRequirementEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("inputRequirement")
  private InputRequirementEnum inputRequirement = null;

  @SerializedName("supportedRelationships")
  private List<Relationship> supportedRelationships = new ArrayList<Relationship>();

  @SerializedName("supportsDynamicRelationships")
  private Boolean supportsDynamicRelationships = null;

  @SerializedName("triggerSerially")
  private Boolean triggerSerially = null;

  @SerializedName("triggerWhenEmpty")
  private Boolean triggerWhenEmpty = null;

  @SerializedName("triggerWhenAnyDestinationAvailable")
  private Boolean triggerWhenAnyDestinationAvailable = null;

  @SerializedName("supportsBatching")
  private Boolean supportsBatching = null;

  @SerializedName("supportsEventDriven")
  private Boolean supportsEventDriven = null;

  @SerializedName("primaryNodeOnly")
  private Boolean primaryNodeOnly = null;

  @SerializedName("sideEffectFree")
  private Boolean sideEffectFree = null;

  @SerializedName("supportedSchedulingStrategies")
  private List<String> supportedSchedulingStrategies = new ArrayList<String>();

  @SerializedName("defaultSchedulingStrategy")
  private String defaultSchedulingStrategy = null;

  @SerializedName("defaultConcurrentTasksBySchedulingStrategy")
  private Map<String, Integer> defaultConcurrentTasksBySchedulingStrategy = new HashMap<String, Integer>();

  @SerializedName("defaultSchedulingPeriodBySchedulingStrategy")
  private Map<String, String> defaultSchedulingPeriodBySchedulingStrategy = new HashMap<String, String>();

  @SerializedName("defaultPenaltyDuration")
  private String defaultPenaltyDuration = null;

  @SerializedName("defaultYieldDuration")
  private String defaultYieldDuration = null;

  @SerializedName("defaultBulletinLevel")
  private String defaultBulletinLevel = null;

  public ProcessorDefinition group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The group name of the bundle that provides the referenced type.
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "The group name of the bundle that provides the referenced type.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public ProcessorDefinition artifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

   /**
   * The artifact name of the bundle that provides the referenced type.
   * @return artifact
  **/
  @ApiModelProperty(example = "null", value = "The artifact name of the bundle that provides the referenced type.")
  public String getArtifact() {
    return artifact;
  }

  public void setArtifact(String artifact) {
    this.artifact = artifact;
  }

  public ProcessorDefinition version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the bundle that provides the referenced type.
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "The version of the bundle that provides the referenced type.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProcessorDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The fully-qualified class type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The fully-qualified class type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProcessorDefinition typeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    return this;
  }

   /**
   * The description of the type.
   * @return typeDescription
  **/
  @ApiModelProperty(example = "null", value = "The description of the type.")
  public String getTypeDescription() {
    return typeDescription;
  }

  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }

  public ProcessorDefinition buildInfo(BuildInfo buildInfo) {
    this.buildInfo = buildInfo;
    return this;
  }

   /**
   * The build metadata for this component
   * @return buildInfo
  **/
  @ApiModelProperty(example = "null", value = "The build metadata for this component")
  public BuildInfo getBuildInfo() {
    return buildInfo;
  }

  public void setBuildInfo(BuildInfo buildInfo) {
    this.buildInfo = buildInfo;
  }

  public ProcessorDefinition providedApiImplementations(List<DefinedType> providedApiImplementations) {
    this.providedApiImplementations = providedApiImplementations;
    return this;
  }

  public ProcessorDefinition addProvidedApiImplementationsItem(DefinedType providedApiImplementationsItem) {
    this.providedApiImplementations.add(providedApiImplementationsItem);
    return this;
  }

   /**
   * If this type represents a provider for an interface, this lists the APIs it implements
   * @return providedApiImplementations
  **/
  @ApiModelProperty(example = "null", value = "If this type represents a provider for an interface, this lists the APIs it implements")
  public List<DefinedType> getProvidedApiImplementations() {
    return providedApiImplementations;
  }

  public void setProvidedApiImplementations(List<DefinedType> providedApiImplementations) {
    this.providedApiImplementations = providedApiImplementations;
  }

  public ProcessorDefinition tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ProcessorDefinition addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags associated with this type
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "The tags associated with this type")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ProcessorDefinition deprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Whether or not the component has been deprecated
   * @return deprecated
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the component has been deprecated")
  public Boolean getDeprecated() {
    return deprecated;
  }

  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }

  public ProcessorDefinition deprecationReason(String deprecationReason) {
    this.deprecationReason = deprecationReason;
    return this;
  }

   /**
   * If this component has been deprecated, this optional field can be used to provide an explanation
   * @return deprecationReason
  **/
  @ApiModelProperty(example = "null", value = "If this component has been deprecated, this optional field can be used to provide an explanation")
  public String getDeprecationReason() {
    return deprecationReason;
  }

  public void setDeprecationReason(String deprecationReason) {
    this.deprecationReason = deprecationReason;
  }

  public ProcessorDefinition restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

   /**
   * Whether or not the component has a general restriction
   * @return restricted
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the component has a general restriction")
  public Boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public ProcessorDefinition restrictedExplanation(String restrictedExplanation) {
    this.restrictedExplanation = restrictedExplanation;
    return this;
  }

   /**
   * An optional description of the general restriction
   * @return restrictedExplanation
  **/
  @ApiModelProperty(example = "null", value = "An optional description of the general restriction")
  public String getRestrictedExplanation() {
    return restrictedExplanation;
  }

  public void setRestrictedExplanation(String restrictedExplanation) {
    this.restrictedExplanation = restrictedExplanation;
  }

  public ProcessorDefinition explicitRestrictions(List<Restriction> explicitRestrictions) {
    this.explicitRestrictions = explicitRestrictions;
    return this;
  }

  public ProcessorDefinition addExplicitRestrictionsItem(Restriction explicitRestrictionsItem) {
    this.explicitRestrictions.add(explicitRestrictionsItem);
    return this;
  }

   /**
   * Explicit restrictions that indicate a require permission to use the component
   * @return explicitRestrictions
  **/
  @ApiModelProperty(example = "null", value = "Explicit restrictions that indicate a require permission to use the component")
  public List<Restriction> getExplicitRestrictions() {
    return explicitRestrictions;
  }

  public void setExplicitRestrictions(List<Restriction> explicitRestrictions) {
    this.explicitRestrictions = explicitRestrictions;
  }

  public ProcessorDefinition stateful(Stateful stateful) {
    this.stateful = stateful;
    return this;
  }

   /**
   * Get stateful
   * @return stateful
  **/
  @ApiModelProperty(example = "null", value = "")
  public Stateful getStateful() {
    return stateful;
  }

  public void setStateful(Stateful stateful) {
    this.stateful = stateful;
  }

  public ProcessorDefinition propertyDescriptors(Map<String, PropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
    return this;
  }

  public ProcessorDefinition putPropertyDescriptorsItem(String key, PropertyDescriptor propertyDescriptorsItem) {
    this.propertyDescriptors.put(key, propertyDescriptorsItem);
    return this;
  }

   /**
   * Descriptions of configuration properties applicable to this component.
   * @return propertyDescriptors
  **/
  @ApiModelProperty(example = "null", value = "Descriptions of configuration properties applicable to this component.")
  public Map<String, PropertyDescriptor> getPropertyDescriptors() {
    return propertyDescriptors;
  }

  public void setPropertyDescriptors(Map<String, PropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
  }

  public ProcessorDefinition supportsDynamicProperties(Boolean supportsDynamicProperties) {
    this.supportsDynamicProperties = supportsDynamicProperties;
    return this;
  }

   /**
   * Whether or not this component makes use of dynamic (user-set) properties.
   * @return supportsDynamicProperties
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this component makes use of dynamic (user-set) properties.")
  public Boolean getSupportsDynamicProperties() {
    return supportsDynamicProperties;
  }

  public void setSupportsDynamicProperties(Boolean supportsDynamicProperties) {
    this.supportsDynamicProperties = supportsDynamicProperties;
  }

  public ProcessorDefinition inputRequirement(InputRequirementEnum inputRequirement) {
    this.inputRequirement = inputRequirement;
    return this;
  }

   /**
   * Any input requirements this processor has.
   * @return inputRequirement
  **/
  @ApiModelProperty(example = "null", value = "Any input requirements this processor has.")
  public InputRequirementEnum getInputRequirement() {
    return inputRequirement;
  }

  public void setInputRequirement(InputRequirementEnum inputRequirement) {
    this.inputRequirement = inputRequirement;
  }

  public ProcessorDefinition supportedRelationships(List<Relationship> supportedRelationships) {
    this.supportedRelationships = supportedRelationships;
    return this;
  }

  public ProcessorDefinition addSupportedRelationshipsItem(Relationship supportedRelationshipsItem) {
    this.supportedRelationships.add(supportedRelationshipsItem);
    return this;
  }

   /**
   * The supported relationships for this processor.
   * @return supportedRelationships
  **/
  @ApiModelProperty(example = "null", value = "The supported relationships for this processor.")
  public List<Relationship> getSupportedRelationships() {
    return supportedRelationships;
  }

  public void setSupportedRelationships(List<Relationship> supportedRelationships) {
    this.supportedRelationships = supportedRelationships;
  }

  public ProcessorDefinition supportsDynamicRelationships(Boolean supportsDynamicRelationships) {
    this.supportsDynamicRelationships = supportsDynamicRelationships;
    return this;
  }

   /**
   * Whether or not this processor supports dynamic relationships.
   * @return supportsDynamicRelationships
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this processor supports dynamic relationships.")
  public Boolean getSupportsDynamicRelationships() {
    return supportsDynamicRelationships;
  }

  public void setSupportsDynamicRelationships(Boolean supportsDynamicRelationships) {
    this.supportsDynamicRelationships = supportsDynamicRelationships;
  }

  public ProcessorDefinition triggerSerially(Boolean triggerSerially) {
    this.triggerSerially = triggerSerially;
    return this;
  }

   /**
   * Whether or not this processor should be triggered serially (i.e. no concurrent execution).
   * @return triggerSerially
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this processor should be triggered serially (i.e. no concurrent execution).")
  public Boolean getTriggerSerially() {
    return triggerSerially;
  }

  public void setTriggerSerially(Boolean triggerSerially) {
    this.triggerSerially = triggerSerially;
  }

  public ProcessorDefinition triggerWhenEmpty(Boolean triggerWhenEmpty) {
    this.triggerWhenEmpty = triggerWhenEmpty;
    return this;
  }

   /**
   * Whether or not this processor should be triggered when incoming queues are empty.
   * @return triggerWhenEmpty
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this processor should be triggered when incoming queues are empty.")
  public Boolean getTriggerWhenEmpty() {
    return triggerWhenEmpty;
  }

  public void setTriggerWhenEmpty(Boolean triggerWhenEmpty) {
    this.triggerWhenEmpty = triggerWhenEmpty;
  }

  public ProcessorDefinition triggerWhenAnyDestinationAvailable(Boolean triggerWhenAnyDestinationAvailable) {
    this.triggerWhenAnyDestinationAvailable = triggerWhenAnyDestinationAvailable;
    return this;
  }

   /**
   * Whether or not this processor should be triggered when any destination queue has room.
   * @return triggerWhenAnyDestinationAvailable
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this processor should be triggered when any destination queue has room.")
  public Boolean getTriggerWhenAnyDestinationAvailable() {
    return triggerWhenAnyDestinationAvailable;
  }

  public void setTriggerWhenAnyDestinationAvailable(Boolean triggerWhenAnyDestinationAvailable) {
    this.triggerWhenAnyDestinationAvailable = triggerWhenAnyDestinationAvailable;
  }

  public ProcessorDefinition supportsBatching(Boolean supportsBatching) {
    this.supportsBatching = supportsBatching;
    return this;
  }

   /**
   * Whether or not this processor supports batching. If a Processor uses this annotation, it allows the Framework to batch calls to session commits, as well as allowing the Framework to return the same session multiple times.
   * @return supportsBatching
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this processor supports batching. If a Processor uses this annotation, it allows the Framework to batch calls to session commits, as well as allowing the Framework to return the same session multiple times.")
  public Boolean getSupportsBatching() {
    return supportsBatching;
  }

  public void setSupportsBatching(Boolean supportsBatching) {
    this.supportsBatching = supportsBatching;
  }

  public ProcessorDefinition supportsEventDriven(Boolean supportsEventDriven) {
    this.supportsEventDriven = supportsEventDriven;
    return this;
  }

   /**
   * Whether or not this processor supports event driven scheduling. Indicates to the framework that the Processor is eligible to be scheduled to run based on the occurrence of an \"Event\" (e.g., when a FlowFile is enqueued in an incoming Connection), rather than being triggered periodically.
   * @return supportsEventDriven
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this processor supports event driven scheduling. Indicates to the framework that the Processor is eligible to be scheduled to run based on the occurrence of an \"Event\" (e.g., when a FlowFile is enqueued in an incoming Connection), rather than being triggered periodically.")
  public Boolean getSupportsEventDriven() {
    return supportsEventDriven;
  }

  public void setSupportsEventDriven(Boolean supportsEventDriven) {
    this.supportsEventDriven = supportsEventDriven;
  }

  public ProcessorDefinition primaryNodeOnly(Boolean primaryNodeOnly) {
    this.primaryNodeOnly = primaryNodeOnly;
    return this;
  }

   /**
   * Whether or not this processor should be scheduled only on the primary node in a cluster.
   * @return primaryNodeOnly
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this processor should be scheduled only on the primary node in a cluster.")
  public Boolean getPrimaryNodeOnly() {
    return primaryNodeOnly;
  }

  public void setPrimaryNodeOnly(Boolean primaryNodeOnly) {
    this.primaryNodeOnly = primaryNodeOnly;
  }

  public ProcessorDefinition sideEffectFree(Boolean sideEffectFree) {
    this.sideEffectFree = sideEffectFree;
    return this;
  }

   /**
   * Whether or not this processor is considered side-effect free. Side-effect free indicate that the processor's operations on FlowFiles can be safely repeated across process sessions.
   * @return sideEffectFree
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this processor is considered side-effect free. Side-effect free indicate that the processor's operations on FlowFiles can be safely repeated across process sessions.")
  public Boolean getSideEffectFree() {
    return sideEffectFree;
  }

  public void setSideEffectFree(Boolean sideEffectFree) {
    this.sideEffectFree = sideEffectFree;
  }

  public ProcessorDefinition supportedSchedulingStrategies(List<String> supportedSchedulingStrategies) {
    this.supportedSchedulingStrategies = supportedSchedulingStrategies;
    return this;
  }

  public ProcessorDefinition addSupportedSchedulingStrategiesItem(String supportedSchedulingStrategiesItem) {
    this.supportedSchedulingStrategies.add(supportedSchedulingStrategiesItem);
    return this;
  }

   /**
   * The supported scheduling strategies, such as TIME_DRIVER, CRON, or EVENT_DRIVEN.
   * @return supportedSchedulingStrategies
  **/
  @ApiModelProperty(example = "null", value = "The supported scheduling strategies, such as TIME_DRIVER, CRON, or EVENT_DRIVEN.")
  public List<String> getSupportedSchedulingStrategies() {
    return supportedSchedulingStrategies;
  }

  public void setSupportedSchedulingStrategies(List<String> supportedSchedulingStrategies) {
    this.supportedSchedulingStrategies = supportedSchedulingStrategies;
  }

  public ProcessorDefinition defaultSchedulingStrategy(String defaultSchedulingStrategy) {
    this.defaultSchedulingStrategy = defaultSchedulingStrategy;
    return this;
  }

   /**
   * The default scheduling strategy for the processor.
   * @return defaultSchedulingStrategy
  **/
  @ApiModelProperty(example = "null", value = "The default scheduling strategy for the processor.")
  public String getDefaultSchedulingStrategy() {
    return defaultSchedulingStrategy;
  }

  public void setDefaultSchedulingStrategy(String defaultSchedulingStrategy) {
    this.defaultSchedulingStrategy = defaultSchedulingStrategy;
  }

  public ProcessorDefinition defaultConcurrentTasksBySchedulingStrategy(Map<String, Integer> defaultConcurrentTasksBySchedulingStrategy) {
    this.defaultConcurrentTasksBySchedulingStrategy = defaultConcurrentTasksBySchedulingStrategy;
    return this;
  }

  public ProcessorDefinition putDefaultConcurrentTasksBySchedulingStrategyItem(String key, Integer defaultConcurrentTasksBySchedulingStrategyItem) {
    this.defaultConcurrentTasksBySchedulingStrategy.put(key, defaultConcurrentTasksBySchedulingStrategyItem);
    return this;
  }

   /**
   * The default concurrent tasks for each scheduling strategy.
   * @return defaultConcurrentTasksBySchedulingStrategy
  **/
  @ApiModelProperty(example = "null", value = "The default concurrent tasks for each scheduling strategy.")
  public Map<String, Integer> getDefaultConcurrentTasksBySchedulingStrategy() {
    return defaultConcurrentTasksBySchedulingStrategy;
  }

  public void setDefaultConcurrentTasksBySchedulingStrategy(Map<String, Integer> defaultConcurrentTasksBySchedulingStrategy) {
    this.defaultConcurrentTasksBySchedulingStrategy = defaultConcurrentTasksBySchedulingStrategy;
  }

  public ProcessorDefinition defaultSchedulingPeriodBySchedulingStrategy(Map<String, String> defaultSchedulingPeriodBySchedulingStrategy) {
    this.defaultSchedulingPeriodBySchedulingStrategy = defaultSchedulingPeriodBySchedulingStrategy;
    return this;
  }

  public ProcessorDefinition putDefaultSchedulingPeriodBySchedulingStrategyItem(String key, String defaultSchedulingPeriodBySchedulingStrategyItem) {
    this.defaultSchedulingPeriodBySchedulingStrategy.put(key, defaultSchedulingPeriodBySchedulingStrategyItem);
    return this;
  }

   /**
   * The default scheduling period for each scheduling strategy. The scheduling period is expected to be a time period, such as \"30 sec\".
   * @return defaultSchedulingPeriodBySchedulingStrategy
  **/
  @ApiModelProperty(example = "null", value = "The default scheduling period for each scheduling strategy. The scheduling period is expected to be a time period, such as \"30 sec\".")
  public Map<String, String> getDefaultSchedulingPeriodBySchedulingStrategy() {
    return defaultSchedulingPeriodBySchedulingStrategy;
  }

  public void setDefaultSchedulingPeriodBySchedulingStrategy(Map<String, String> defaultSchedulingPeriodBySchedulingStrategy) {
    this.defaultSchedulingPeriodBySchedulingStrategy = defaultSchedulingPeriodBySchedulingStrategy;
  }

  public ProcessorDefinition defaultPenaltyDuration(String defaultPenaltyDuration) {
    this.defaultPenaltyDuration = defaultPenaltyDuration;
    return this;
  }

   /**
   * The default penalty duration as a time period, such as \"30 sec\".
   * @return defaultPenaltyDuration
  **/
  @ApiModelProperty(example = "null", value = "The default penalty duration as a time period, such as \"30 sec\".")
  public String getDefaultPenaltyDuration() {
    return defaultPenaltyDuration;
  }

  public void setDefaultPenaltyDuration(String defaultPenaltyDuration) {
    this.defaultPenaltyDuration = defaultPenaltyDuration;
  }

  public ProcessorDefinition defaultYieldDuration(String defaultYieldDuration) {
    this.defaultYieldDuration = defaultYieldDuration;
    return this;
  }

   /**
   * The default yield duration as a time period, such as \"1 sec\".
   * @return defaultYieldDuration
  **/
  @ApiModelProperty(example = "null", value = "The default yield duration as a time period, such as \"1 sec\".")
  public String getDefaultYieldDuration() {
    return defaultYieldDuration;
  }

  public void setDefaultYieldDuration(String defaultYieldDuration) {
    this.defaultYieldDuration = defaultYieldDuration;
  }

  public ProcessorDefinition defaultBulletinLevel(String defaultBulletinLevel) {
    this.defaultBulletinLevel = defaultBulletinLevel;
    return this;
  }

   /**
   * The default bulletin level, such as WARN, INFO, DEBUG, etc.
   * @return defaultBulletinLevel
  **/
  @ApiModelProperty(example = "null", value = "The default bulletin level, such as WARN, INFO, DEBUG, etc.")
  public String getDefaultBulletinLevel() {
    return defaultBulletinLevel;
  }

  public void setDefaultBulletinLevel(String defaultBulletinLevel) {
    this.defaultBulletinLevel = defaultBulletinLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorDefinition processorDefinition = (ProcessorDefinition) o;
    return Objects.equals(this.group, processorDefinition.group) &&
        Objects.equals(this.artifact, processorDefinition.artifact) &&
        Objects.equals(this.version, processorDefinition.version) &&
        Objects.equals(this.type, processorDefinition.type) &&
        Objects.equals(this.typeDescription, processorDefinition.typeDescription) &&
        Objects.equals(this.buildInfo, processorDefinition.buildInfo) &&
        Objects.equals(this.providedApiImplementations, processorDefinition.providedApiImplementations) &&
        Objects.equals(this.tags, processorDefinition.tags) &&
        Objects.equals(this.deprecated, processorDefinition.deprecated) &&
        Objects.equals(this.deprecationReason, processorDefinition.deprecationReason) &&
        Objects.equals(this.restricted, processorDefinition.restricted) &&
        Objects.equals(this.restrictedExplanation, processorDefinition.restrictedExplanation) &&
        Objects.equals(this.explicitRestrictions, processorDefinition.explicitRestrictions) &&
        Objects.equals(this.stateful, processorDefinition.stateful) &&
        Objects.equals(this.propertyDescriptors, processorDefinition.propertyDescriptors) &&
        Objects.equals(this.supportsDynamicProperties, processorDefinition.supportsDynamicProperties) &&
        Objects.equals(this.inputRequirement, processorDefinition.inputRequirement) &&
        Objects.equals(this.supportedRelationships, processorDefinition.supportedRelationships) &&
        Objects.equals(this.supportsDynamicRelationships, processorDefinition.supportsDynamicRelationships) &&
        Objects.equals(this.triggerSerially, processorDefinition.triggerSerially) &&
        Objects.equals(this.triggerWhenEmpty, processorDefinition.triggerWhenEmpty) &&
        Objects.equals(this.triggerWhenAnyDestinationAvailable, processorDefinition.triggerWhenAnyDestinationAvailable) &&
        Objects.equals(this.supportsBatching, processorDefinition.supportsBatching) &&
        Objects.equals(this.supportsEventDriven, processorDefinition.supportsEventDriven) &&
        Objects.equals(this.primaryNodeOnly, processorDefinition.primaryNodeOnly) &&
        Objects.equals(this.sideEffectFree, processorDefinition.sideEffectFree) &&
        Objects.equals(this.supportedSchedulingStrategies, processorDefinition.supportedSchedulingStrategies) &&
        Objects.equals(this.defaultSchedulingStrategy, processorDefinition.defaultSchedulingStrategy) &&
        Objects.equals(this.defaultConcurrentTasksBySchedulingStrategy, processorDefinition.defaultConcurrentTasksBySchedulingStrategy) &&
        Objects.equals(this.defaultSchedulingPeriodBySchedulingStrategy, processorDefinition.defaultSchedulingPeriodBySchedulingStrategy) &&
        Objects.equals(this.defaultPenaltyDuration, processorDefinition.defaultPenaltyDuration) &&
        Objects.equals(this.defaultYieldDuration, processorDefinition.defaultYieldDuration) &&
        Objects.equals(this.defaultBulletinLevel, processorDefinition.defaultBulletinLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, artifact, version, type, typeDescription, buildInfo, providedApiImplementations, tags, deprecated, deprecationReason, restricted, restrictedExplanation, explicitRestrictions, stateful, propertyDescriptors, supportsDynamicProperties, inputRequirement, supportedRelationships, supportsDynamicRelationships, triggerSerially, triggerWhenEmpty, triggerWhenAnyDestinationAvailable, supportsBatching, supportsEventDriven, primaryNodeOnly, sideEffectFree, supportedSchedulingStrategies, defaultSchedulingStrategy, defaultConcurrentTasksBySchedulingStrategy, defaultSchedulingPeriodBySchedulingStrategy, defaultPenaltyDuration, defaultYieldDuration, defaultBulletinLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorDefinition {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
    sb.append("    buildInfo: ").append(toIndentedString(buildInfo)).append("\n");
    sb.append("    providedApiImplementations: ").append(toIndentedString(providedApiImplementations)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    deprecationReason: ").append(toIndentedString(deprecationReason)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    restrictedExplanation: ").append(toIndentedString(restrictedExplanation)).append("\n");
    sb.append("    explicitRestrictions: ").append(toIndentedString(explicitRestrictions)).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
    sb.append("    propertyDescriptors: ").append(toIndentedString(propertyDescriptors)).append("\n");
    sb.append("    supportsDynamicProperties: ").append(toIndentedString(supportsDynamicProperties)).append("\n");
    sb.append("    inputRequirement: ").append(toIndentedString(inputRequirement)).append("\n");
    sb.append("    supportedRelationships: ").append(toIndentedString(supportedRelationships)).append("\n");
    sb.append("    supportsDynamicRelationships: ").append(toIndentedString(supportsDynamicRelationships)).append("\n");
    sb.append("    triggerSerially: ").append(toIndentedString(triggerSerially)).append("\n");
    sb.append("    triggerWhenEmpty: ").append(toIndentedString(triggerWhenEmpty)).append("\n");
    sb.append("    triggerWhenAnyDestinationAvailable: ").append(toIndentedString(triggerWhenAnyDestinationAvailable)).append("\n");
    sb.append("    supportsBatching: ").append(toIndentedString(supportsBatching)).append("\n");
    sb.append("    supportsEventDriven: ").append(toIndentedString(supportsEventDriven)).append("\n");
    sb.append("    primaryNodeOnly: ").append(toIndentedString(primaryNodeOnly)).append("\n");
    sb.append("    sideEffectFree: ").append(toIndentedString(sideEffectFree)).append("\n");
    sb.append("    supportedSchedulingStrategies: ").append(toIndentedString(supportedSchedulingStrategies)).append("\n");
    sb.append("    defaultSchedulingStrategy: ").append(toIndentedString(defaultSchedulingStrategy)).append("\n");
    sb.append("    defaultConcurrentTasksBySchedulingStrategy: ").append(toIndentedString(defaultConcurrentTasksBySchedulingStrategy)).append("\n");
    sb.append("    defaultSchedulingPeriodBySchedulingStrategy: ").append(toIndentedString(defaultSchedulingPeriodBySchedulingStrategy)).append("\n");
    sb.append("    defaultPenaltyDuration: ").append(toIndentedString(defaultPenaltyDuration)).append("\n");
    sb.append("    defaultYieldDuration: ").append(toIndentedString(defaultYieldDuration)).append("\n");
    sb.append("    defaultBulletinLevel: ").append(toIndentedString(defaultBulletinLevel)).append("\n");
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
