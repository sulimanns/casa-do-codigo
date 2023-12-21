package com.casadocodigo.casadocodigo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableDiscoveryClient
@Log4j2
public class CasaDoCodigoApplication implements CommandLineRunner{

	@Value("${sulimann.message}")
	private String msg;

	@Value("${sulimann.message2}")
	private String msg2;

	public static void main(String[] args) {
		SpringApplication.run(CasaDoCodigoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(msg);
		log.info(msg2);
	}

}
