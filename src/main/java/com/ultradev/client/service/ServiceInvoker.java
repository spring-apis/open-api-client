package com.ultradev.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ultradev.client.APIFeignClient;
import com.ultradev.feign.client.DefaultApi;
import com.ultradev.feign.model.GetAccountsResponse;

import io.swagger.annotations.Authorization;

@Component
public class ServiceInvoker {
	
	
	@Autowired
	APIFeignClient apiFeignClient;
	
	
	public GetAccountsResponse invokeService()
	{
		return apiFeignClient.getApiClient().buildClient(DefaultApi.class).getAccounts();
		
	}

}
