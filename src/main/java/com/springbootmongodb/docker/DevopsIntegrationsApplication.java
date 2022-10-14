package com.springbootmongodb.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DevopsIntegrationsApplication {

	@GetMapping("/test")
	public String getMessage() {
		return "Welcome Naresh.....";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationsApplication.class, args);
	}

}
