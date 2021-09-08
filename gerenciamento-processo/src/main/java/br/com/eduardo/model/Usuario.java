package br.com.eduardo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private NivelUsuario nivel;
	@Enumerated(EnumType.STRING)
	private StatusUsuario status = StatusUsuario.ATIVO;
	private LocalDateTime dataCriacao = LocalDateTime.now();

	public Usuario(String nome, NivelUsuario nivel) {
		this.nome = nome;
		this.nivel = nivel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelUsuario getNivel() {
		return nivel;
	}

	public void setNivel(NivelUsuario nivel) {
		this.nivel = nivel;
	}

	public StatusUsuario getStatus() {
		return status;
	}

	public void setStatus(StatusUsuario status) {
		this.status = status;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", nivel=" + nivel + ", status=" + status + ", dataCriacao="
				+ dataCriacao + "]";
	}

}
