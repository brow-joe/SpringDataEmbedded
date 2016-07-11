package br.com.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity( name = "teste" )
public class TesteDomain{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;

	@Column( name = "primeira" )
	private String aleatorio;

	public long getId() {
		return id;
	}

	public void setId( long id ) {
		this.id = id;
	}

	public String getAleatorio() {
		return aleatorio;
	}

	public void setAleatorio( String aleatorio ) {
		this.aleatorio = aleatorio;
	}

}