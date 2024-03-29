package br.com.caixa.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CaixaApplication {

    public static void main(String[] args)
    {       SpringApplication.run(CaixaApplication.class, args);    }

}

