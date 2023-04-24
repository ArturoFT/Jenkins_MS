package com.cjava.practica01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CjavaPractica01ServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjavaPractica01ServicioApplication.class, args);
	}

}
