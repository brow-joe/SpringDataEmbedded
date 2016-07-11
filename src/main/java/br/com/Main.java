package br.com;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan( "br.com" )
@EnableFeignClients
@EnableCircuitBreaker
public class Main{
	protected static final Logger LOGGER = LogManager.getLogger( Main.class );

	public static void main( String[ ] args ) {
		SpringApplication.run( Main.class, args );
		LOGGER.info( "... server starter ..." );
	}
}