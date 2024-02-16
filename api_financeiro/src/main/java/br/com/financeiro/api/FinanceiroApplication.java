package br.com.financeiro.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FinanceiroApplication {

    public static void main(String[] args)
    {       SpringApplication.run(FinanceiroApplication.class, args);    }

}

