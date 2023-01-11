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

import io.swagger.client.ApiException;
import io.swagger.client.model.SnippetEntity;
import org.junit.Test;

/**
 * API tests for SnippetsApi
 */
public class SnippetsApiTest {

    private final SnippetsApi api = new SnippetsApi();


    /**
     * Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSnippetTest() throws ApiException {
        SnippetEntity body = null;
        // SnippetEntity response = api.createSnippet(body);

        // TODO: test validations
    }

    /**
     * Deletes the components in a snippet and discards the snippet
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSnippetTest() throws ApiException {
        String id = null;
        Boolean disconnectedNodeAcknowledged = null;
        // SnippetEntity response = api.deleteSnippet(id, disconnectedNodeAcknowledged);

        // TODO: test validations
    }

    /**
     * Move&#39;s the components in this Snippet into a new Process Group and discards the snippet
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSnippetTest() throws ApiException {
        String id = null;
        SnippetEntity body = null;
        // SnippetEntity response = api.updateSnippet(id, body);

        // TODO: test validations
    }

}
