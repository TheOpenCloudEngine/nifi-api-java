package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ActivateControllerServicesEntity;
import io.swagger.client.model.ScheduleComponentsEntity;
import org.junit.Test;

import java.util.List;

/**
 * API tests for FlowApi
 */
public class FlowApiTest extends TestFixture {

    private final FlowApi api = new FlowApi();


    /**
     * Enable or disable Controller Services in the specified Process Group.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateControllerServicesTest() throws ApiException {
        String id = null;
        ActivateControllerServicesEntity body = null;
        // ActivateControllerServicesEntity response = api.activateControllerServices(id, body);

        // TODO: test validations
    }

    /**
     * Generates a client id.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateClientIdTest() throws ApiException {
        // String response = api.generateClientId();

        // TODO: test validations
    }

    /**
     * Retrieves details about this NiFi to put in the About dialog
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAboutInfoTest() throws ApiException {
        // AboutEntity response = api.getAboutInfo();

        // TODO: test validations
    }

    /**
     * Gets an action
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionTest() throws ApiException {
        String id = null;
        // ActionEntity response = api.getAction(id);

        // TODO: test validations
    }

    /**
     * Retrieves the banners for this NiFi
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBannersTest() throws ApiException {
        // BannerEntity response = api.getBanners();

        // TODO: test validations
    }

    /**
     * Gets the buckets from the specified registry for the current user
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBucketsTest() throws ApiException {
        String id = null;
        // FlowRegistryBucketsEntity response = api.getBuckets(id);

        // TODO: test validations
    }

    /**
     * Gets current bulletins
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBulletinBoardTest() throws ApiException {
        String after = null;
        String sourceName = null;
        String message = null;
        String sourceId = null;
        String groupId = null;
        String limit = null;
        // BulletinBoardEntity response = api.getBulletinBoard(after, sourceName, message, sourceId, groupId, limit);

        // TODO: test validations
    }

    /**
     * Retrieves Controller level bulletins
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBulletinsTest() throws ApiException {
        // ControllerBulletinsEntity response = api.getBulletins();

        // TODO: test validations
    }

    /**
     * The cluster summary for this NiFi
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterSummaryTest() throws ApiException {
        // ClusteSummaryEntity response = api.getClusterSummary();

        // TODO: test validations
    }

    /**
     * Gets configuration history for a component
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getComponentHistoryTest() throws ApiException {
        String componentId = null;
        // ComponentHistoryEntity response = api.getComponentHistory(componentId);

        // TODO: test validations
    }

    /**
     * Gets statistics for a connection
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionStatisticsTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        // ConnectionStatisticsEntity response = api.getConnectionStatistics(id, nodewise, clusterNodeId);

        // TODO: test validations
    }

    /**
     * Gets status for a connection
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        // ConnectionStatusEntity response = api.getConnectionStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }

    /**
     * Gets the status history for a connection
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionStatusHistoryTest() throws ApiException {
        String id = null;
        // StatusHistoryEntity response = api.getConnectionStatusHistory(id);

        // TODO: test validations
    }

    /**
     * Retrieves the types of controller services that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServiceTypesTest() throws ApiException {
        String serviceType = null;
        String serviceBundleGroup = null;
        String serviceBundleArtifact = null;
        String serviceBundleVersion = null;
        String bundleGroupFilter = null;
        String bundleArtifactFilter = null;
        String typeFilter = null;
        // ControllerServiceTypesEntity response = api.getControllerServiceTypes(serviceType, serviceBundleGroup, serviceBundleArtifact, serviceBundleVersion, bundleGroupFilter, bundleArtifactFilter, typeFilter);

        // TODO: test validations
    }

    /**
     * Gets controller services for reporting tasks
     *
     * If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServicesFromControllerTest() throws ApiException {
        Boolean uiOnly = null;
        // ControllerServicesEntity response = api.getControllerServicesFromController(uiOnly);

        // TODO: test validations
    }

    /**
     * Gets all controller services
     *
     * If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServicesFromGroupTest() throws ApiException {
        String id = null;
        Boolean includeAncestorGroups = null;
        Boolean includeDescendantGroups = null;
        Boolean uiOnly = null;
        // ControllerServicesEntity response = api.getControllerServicesFromGroup(id, includeAncestorGroups, includeDescendantGroups, uiOnly);

        // TODO: test validations
    }

    /**
     * Gets the current status of this NiFi
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerStatusTest() throws ApiException {
        // ControllerStatusEntity response = api.getControllerStatus();

        // TODO: test validations
    }

    /**
     * Retrieves the user identity of the user making the request
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentUserTest() throws ApiException {
        // CurrentUserEntity response = api.getCurrentUser();

        // TODO: test validations
    }

    /**
     * Gets the details of a flow from the specified registry and bucket for the specified flow for the current user
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String registryId = null;
        String bucketId = null;
        String flowId = null;
        // VersionedFlowEntity response = api.getDetails(registryId, bucketId, flowId);

        // TODO: test validations
    }

    /**
     * Gets a process group
     *
     * If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowTest() throws ApiException {
        String id = null;
        Boolean uiOnly = null;
        // ProcessGroupFlowEntity response = api.getFlow(id, uiOnly);

        // TODO: test validations
    }

    /**
     * Retrieves the configuration for this NiFi flow
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowConfigTest() throws ApiException {
        // FlowConfigurationEntity response = api.getFlowConfig();

        // TODO: test validations
    }

    /**
     * Gets all metrics for the flow from a particular node
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowMetricsTest() throws ApiException {
        String producer = null;
        List<String> includedRegistries = null;
        String sampleName = null;
        String sampleLabelValue = null;
        String rootFieldName = null;
        // StreamingOutput response = api.getFlowMetrics(producer, includedRegistries, sampleName, sampleLabelValue, rootFieldName);

        // TODO: test validations
    }

    /**
     * Gets the flows from the specified registry and bucket for the current user
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowsTest() throws ApiException {
        String registryId = null;
        String bucketId = null;
        // VersionedFlowsEntity response = api.getFlows(registryId, bucketId);

        // TODO: test validations
    }

    /**
     * Gets status for an input port
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInputPortStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        // PortStatusEntity response = api.getInputPortStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }

    /**
     * Gets status for an output port
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOutputPortStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        // PortStatusEntity response = api.getOutputPortStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }

    /**
     * Gets all Parameter Contexts
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParameterContextsTest() throws ApiException {
        // ParameterContextsEntity response = api.getParameterContexts();

        // TODO: test validations
    }

    /**
     * Retrieves the types of parameter providers that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParameterProviderTypesTest() throws ApiException {
        String bundleGroupFilter = null;
        String bundleArtifactFilter = null;
        String type = null;
        // ParameterProviderTypesEntity response = api.getParameterProviderTypes(bundleGroupFilter, bundleArtifactFilter, type);

        // TODO: test validations
    }

    /**
     * Gets all parameter providers
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParameterProvidersTest() throws ApiException {
        // ParameterProvidersEntity response = api.getParameterProviders();

        // TODO: test validations
    }

    /**
     * Retrieves the types of prioritizers that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrioritizersTest() throws ApiException {
        // PrioritizerTypesEntity response = api.getPrioritizers();

        // TODO: test validations
    }

    /**
     * Gets the status for a process group
     *
     * The status for a process group includes status for all descendent components. When invoked on the root group with recursive set to true, it will return the current status of every component in the flow.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessGroupStatusTest() throws ApiException {
        String id = null;
        Boolean recursive = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        // ProcessGroupStatusEntity response = api.getProcessGroupStatus(id, recursive, nodewise, clusterNodeId);

        // TODO: test validations
    }

    /**
     * Gets status history for a remote process group
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessGroupStatusHistoryTest() throws ApiException {
        String id = null;
        // StatusHistoryEntity response = api.getProcessGroupStatusHistory(id);

        // TODO: test validations
    }

    /**
     * Gets status for a processor
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        // ProcessorStatusEntity response = api.getProcessorStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }

    /**
     * Gets status history for a processor
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorStatusHistoryTest() throws ApiException {
        String id = null;
        // StatusHistoryEntity response = api.getProcessorStatusHistory(id);

        // TODO: test validations
    }

    /**
     * Retrieves the types of processors that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorTypesTest() throws ApiException {
        String bundleGroupFilter = null;
        String bundleArtifactFilter = null;
        String type = null;
        // ProcessorTypesEntity response = api.getProcessorTypes(bundleGroupFilter, bundleArtifactFilter, type);

        // TODO: test validations
    }

    /**
     * Gets the listing of available flow registry clients
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRegistryClientsTest() throws ApiException {
        // FlowRegistryClientsEntity response = api.getRegistryClients();

        // TODO: test validations
    }

    /**
     * Gets status for a remote process group
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        // RemoteProcessGroupStatusEntity response = api.getRemoteProcessGroupStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }

    /**
     * Gets the status history
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupStatusHistoryTest() throws ApiException {
        String id = null;
        // StatusHistoryEntity response = api.getRemoteProcessGroupStatusHistory(id);

        // TODO: test validations
    }

    /**
     * Retrieves the types of reporting tasks that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportingTaskTypesTest() throws ApiException {
        String bundleGroupFilter = null;
        String bundleArtifactFilter = null;
        String type = null;
        // ReportingTaskTypesEntity response = api.getReportingTaskTypes(bundleGroupFilter, bundleArtifactFilter, type);

        // TODO: test validations
    }

    /**
     * Gets all reporting tasks
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportingTasksTest() throws ApiException {
        // ReportingTasksEntity response = api.getReportingTasks();

        // TODO: test validations
    }

    /**
     * Retrieves the runtime manifest for this NiFi instance.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRuntimeManifestTest() throws ApiException {
        // RuntimeManifestEntity response = api.getRuntimeManifest();

        // TODO: test validations
    }

    /**
     * Gets all templates
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatesTest() throws ApiException {
        // TemplatesEntity response = api.getTemplates();

        // TODO: test validations
    }

    /**
     * Gets the flow versions from the specified registry and bucket for the specified flow for the current user
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionsTest() throws ApiException {
        String registryId = null;
        String bucketId = null;
        String flowId = null;
        // VersionedFlowSnapshotMetadataSetEntity response = api.getVersions(registryId, bucketId, flowId);

        // TODO: test validations
    }

    /**
     * Gets configuration history
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryHistoryTest() throws ApiException {
        String offset = null;
        String count = null;
        String sortColumn = null;
        String sortOrder = null;
        String startDate = null;
        String endDate = null;
        String userIdentity = null;
        String sourceId = null;
        // HistoryEntity response = api.queryHistory(offset, count, sortColumn, sortOrder, startDate, endDate, userIdentity, sourceId);

        // TODO: test validations
    }

    /**
     * Schedule or unschedule components in the specified Process Group.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scheduleComponentsTest() throws ApiException {
        String id = null;
        ScheduleComponentsEntity body = null;
        // ScheduleComponentsEntity response = api.scheduleComponents(id, body);

        // TODO: test validations
    }

    /**
     * Searches the cluster for a node with the specified address
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchClusterTest() throws ApiException {
        String q = null;
        // ClusterSearchResultsEntity response = api.searchCluster(q);

        // TODO: test validations
    }

    /**
     * Performs a search against this NiFi using the specified search term
     *
     * Only search results from authorized components will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchFlowTest() throws ApiException {
        String q = null;
        String a = null;
        // SearchResultsEntity response = api.searchFlow(q, a);

        // TODO: test validations
    }

}
