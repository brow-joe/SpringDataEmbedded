package br.com.jonathan.persistence;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<Domain, Serializable> {

}