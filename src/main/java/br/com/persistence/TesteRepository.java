package br.com.persistence;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TesteRepository extends JpaRepository< TesteDomain, Serializable >{

}