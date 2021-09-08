package br.com.eduardo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parecer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Processo processoVinculado;
	private Usuario usuarioFinalizador;
	private String parecer;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	
}
