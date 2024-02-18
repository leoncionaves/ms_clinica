package br.com.gateway.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
public class APIGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("clinica-service", r -> r.path("/clinica-service/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://CLINICA-SERVICE"))
				.route("caixa-service", r -> r.path("/caixa-service/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://CAIXA-SERVICE"))
				.build();
	}


}
