package br.com.jonathan;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("br.com.jonathan")
@EnableFeignClients
@EnableCircuitBreaker
public class Starter {
	protected static final Logger LOGGER = LogManager.getLogger(Starter.class);

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
		LOGGER.info("... server starter ...");
	}
}