package com.myorganization.identitymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsIdentityManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsIdentityManagmentApplication.class, args);
	}

}
