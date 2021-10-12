package com.ultradev.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ultradev.feign.invoker.ApiClient;

@Component
public class APIFeignClient {

	@Value("${app.server.url}")
	String serverBaseUrl;

	public ApiClient getApiClient() {
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(serverBaseUrl);
		return apiClient;
	}
}
