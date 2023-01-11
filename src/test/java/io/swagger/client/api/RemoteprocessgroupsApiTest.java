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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.RemoteProcessGroupEntity;
import io.swagger.client.model.ComponentStateEntity;
import io.swagger.client.model.RemoteProcessGroupPortEntity;
import io.swagger.client.model.RemotePortRunStatusEntity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RemoteprocessgroupsApi
 */
public class RemoteprocessgroupsApiTest {

    private final RemoteprocessgroupsApi api = new RemoteprocessgroupsApi();

    
    /**
     * Gets a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupTest() throws ApiException {
        String id = null;
        // RemoteProcessGroupEntity response = api.getRemoteProcessGroup(id);

        // TODO: test validations
    }
    
    /**
     * Gets the state for a RemoteProcessGroup
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStateTest() throws ApiException {
        String id = null;
        // ComponentStateEntity response = api.getState(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeRemoteProcessGroupTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        // RemoteProcessGroupEntity response = api.removeRemoteProcessGroup(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Updates a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupTest() throws ApiException {
        String id = null;
        RemoteProcessGroupEntity body = null;
        // RemoteProcessGroupEntity response = api.updateRemoteProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupInputPortTest() throws ApiException {
        String id = null;
        String portId = null;
        RemoteProcessGroupPortEntity body = null;
        // RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupInputPort(id, portId, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupInputPortRunStatusTest() throws ApiException {
        String id = null;
        String portId = null;
        RemotePortRunStatusEntity body = null;
        // RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupInputPortRunStatus(id, portId, body);

        // TODO: test validations
    }
    
    /**
     * Updates a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupOutputPortTest() throws ApiException {
        String id = null;
        String portId = null;
        RemoteProcessGroupPortEntity body = null;
        // RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupOutputPort(id, portId, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupOutputPortRunStatusTest() throws ApiException {
        String id = null;
        String portId = null;
        RemotePortRunStatusEntity body = null;
        // RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupOutputPortRunStatus(id, portId, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupRunStatusTest() throws ApiException {
        String id = null;
        RemotePortRunStatusEntity body = null;
        // RemoteProcessGroupEntity response = api.updateRemoteProcessGroupRunStatus(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of all remote process groups in a process group (recursively)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupRunStatusesTest() throws ApiException {
        String id = null;
        RemotePortRunStatusEntity body = null;
        // RemoteProcessGroupEntity response = api.updateRemoteProcessGroupRunStatuses(id, body);

        // TODO: test validations
    }
    
}