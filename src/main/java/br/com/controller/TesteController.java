package br.com.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.persistence.TesteDomain;
import br.com.persistence.TesteRepository;

@RestController
@RequestMapping( "/teste" )
public class TesteController{

	@Autowired
	private TesteRepository repository;

	@RequestMapping( value = "/ola", method = { RequestMethod.GET } )
	public String getPersonByTrainer() {
		TesteDomain domain = new TesteDomain();
		domain.setAleatorio( UUID.randomUUID().toString() );
		repository.save( domain );

		repository.findAll().forEach( d -> {
			System.out.println( d.getId() + " - " + d.getAleatorio() );
		} );
		System.out.println();
		return "ola";
	}

}