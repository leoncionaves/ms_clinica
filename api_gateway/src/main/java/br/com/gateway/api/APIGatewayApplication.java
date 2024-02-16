package br.com.gateway.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
				.route("api-clinica", r -> r.path("/api-clinica/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://API-CLINICA"))
				.route("api-financeiro", r -> r.path("/api-financeiro/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://API-FINANCEIRO"))
				.build();
	}


}
