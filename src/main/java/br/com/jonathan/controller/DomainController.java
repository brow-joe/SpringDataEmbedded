package br.com.jonathan.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.persistence.Domain;
import br.com.jonathan.persistence.DomainRepository;

@RestController
@RequestMapping("/domain")
public class DomainController {

	@Autowired
	private DomainRepository repository;

	@RequestMapping(value = "/generate", method = { RequestMethod.GET })
	public String getPersonByTrainer() {
		Domain domain = new Domain();
		domain.setDescricao(UUID.randomUUID().toString());
		repository.save(domain);

		repository.findAll().forEach(d -> {
			System.out.println(d.getId() + " - " + d.getDescricao());
		});
		System.out.println();
		return UUID.randomUUID().toString();
	}

}