
# ReportingTaskDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **String** | The group name of the bundle that provides the referenced type. |  [optional]
**artifact** | **String** | The artifact name of the bundle that provides the referenced type. |  [optional]
**version** | **String** | The version of the bundle that provides the referenced type. |  [optional]
**type** | **String** | The fully-qualified class type | 
**typeDescription** | **String** | The description of the type. |  [optional]
**buildInfo** | [**BuildInfo**](BuildInfo.md) | The build metadata for this component |  [optional]
**providedApiImplementations** | [**List&lt;DefinedType&gt;**](DefinedType.md) | If this type represents a provider for an interface, this lists the APIs it implements |  [optional]
**tags** | **List&lt;String&gt;** | The tags associated with this type |  [optional]
**deprecated** | **Boolean** | Whether or not the component has been deprecated |  [optional]
**deprecationReason** | **String** | If this component has been deprecated, this optional field can be used to provide an explanation |  [optional]
**restricted** | **Boolean** | Whether or not the component has a general restriction |  [optional]
**restrictedExplanation** | **String** | An optional description of the general restriction |  [optional]
**explicitRestrictions** | [**List&lt;Restriction&gt;**](Restriction.md) | Explicit restrictions that indicate a require permission to use the component |  [optional]
**stateful** | [**Stateful**](Stateful.md) |  |  [optional]
**propertyDescriptors** | [**Map&lt;String, PropertyDescriptor&gt;**](PropertyDescriptor.md) | Descriptions of configuration properties applicable to this component. |  [optional]
**supportsDynamicProperties** | **Boolean** | Whether or not this component makes use of dynamic (user-set) properties. |  [optional]
**supportedSchedulingStrategies** | **List&lt;String&gt;** | The supported scheduling strategies, such as TIME_DRIVER or CRON. |  [optional]
**defaultSchedulingStrategy** | **String** | The default scheduling strategy for the reporting task. |  [optional]
**defaultSchedulingPeriodBySchedulingStrategy** | **Map&lt;String, String&gt;** | The default scheduling period for each scheduling strategy. The scheduling period is expected to be a time period, such as \&quot;30 sec\&quot;. |  [optional]



