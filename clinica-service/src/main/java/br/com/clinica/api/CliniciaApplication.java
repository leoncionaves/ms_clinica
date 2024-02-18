package br.com.clinica.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CliniciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliniciaApplication.class, args);
	}

}
