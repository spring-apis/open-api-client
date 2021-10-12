package com.ultradev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ultradev.client.service.ServiceInvoker;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class OpenApiFeignClientApplication implements CommandLineRunner{

	@Autowired
	ServiceInvoker serviceInvoker;
	
	public static void main(String[] args) {
		SpringApplication.run(OpenApiFeignClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("Invoking Account service ");
		
		log.info("accountservice Response :{}",serviceInvoker.invokeService().toString());
		
	}

}
