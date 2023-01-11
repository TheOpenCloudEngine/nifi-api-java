package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;

import java.util.Base64;

public class TestFixture {

    public static ApiClient apiClient() throws ApiException {
        ApiClient client = new ApiClient(true);
        client.setDebugging(true);
        client.setBasePath("https://localhost:8443/nifi-api");
        client.addDefaultHeader("Authorization", String.format("Bearer %s", accessToken()));
        return client;
    }

    public static String getBasicAuthenticationHeader(String username, String password) {
        String valueToEncode = username + ":" + password;
        return "Basic " + Base64.getEncoder().encodeToString(valueToEncode.getBytes());
    }

    public static String accessToken() throws ApiException {
        AccessApi accessApi = new AccessApi();
        ApiClient client = new ApiClient(true);
        client.setDebugging(true);
        client.addDefaultHeader("Authorization", getBasicAuthenticationHeader("admin", "adminadminadmin"));
        client.setBasePath("https://localhost:8443/nifi-api");

        accessApi.setApiClient(client);
        return accessApi.createAccessToken("admin", "adminadminadmin");
    }
}
