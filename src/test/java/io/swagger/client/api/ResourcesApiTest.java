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


package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.*;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

/**
 * API tests for ResourcesApi
 */
public class ResourcesApiTest extends TestFixture {

    private final ResourcesApi api = new ResourcesApi();


    /**
     * Gets the available resources that support access/authorization policies
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourcesTest() throws ApiException {
        ApiClient client = apiClient();
        api.setApiClient(client);

        /////////////////////

        ResourcesEntity response = api.getResources();
        List<ResourceDTO> resources = response.getResources();
        resources.forEach(resource -> {
            if (resource.getIdentifier().startsWith("/process-groups/")) {
                String processGroupId = resource.getIdentifier().replaceAll("/process-groups/", "");
                System.out.println(processGroupId);
            }
        });

        /////////////////////

        ProcessgroupsApi pgApi = new ProcessgroupsApi();
        pgApi.setApiClient(client);

        String id = UUID.randomUUID().toString();

        ProcessGroupDTO component = new ProcessGroupDTO();
        component.setName("????????? ??????");

        PositionDTO position = new PositionDTO();
        position.setX(300d);
        position.setY(-300d);
        component.setPosition(position);

        RevisionDTO revision = new RevisionDTO();
        revision.setVersion(0L);
        revision.setClientId(id);

        ProcessGroupEntity pgEntity = new ProcessGroupEntity();
        pgEntity.revision(revision);
        pgEntity.component(component);
        pgEntity.disconnectedNodeAcknowledged(false);

        pgApi.createProcessGroup(id, pgEntity);
    }
}
