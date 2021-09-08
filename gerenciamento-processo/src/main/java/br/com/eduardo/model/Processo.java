package br.com.eduardo.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Processo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titulo;
	private String descricao;
	private Parecer parecer;
	private List<Usuario> usuariosFinalizadores;
	private Usuario usuarioCriacao;
	private StatusProcesso status = StatusProcesso.PENDENTE;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	
	public Processo(String titulo, String descricao, List<Usuario> usuariosFinalizadores, Usuario usuarioCriacao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.usuariosFinalizadores = usuariosFinalizadores;
		this.usuarioCriacao = usuarioCriacao;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Parecer getParecer() {
		return parecer;
	}
	public void setParecer(Parecer parecer) {
		this.parecer = parecer;
	}
	public List<Usuario> getUsuariosFinalizadores() {
		return usuariosFinalizadores;
	}
	public void setUsuariosFinalizadores(List<Usuario> usuariosFinalizadores) {
		this.usuariosFinalizadores = usuariosFinalizadores;
	}
	public Usuario getUsuarioCriacao() {
		return usuarioCriacao;
	}
	public void setUsuarioCriacao(Usuario usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}
	public StatusProcesso getStatus() {
		return status;
	}
	public void setStatus(StatusProcesso status) {
		this.status = status;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	@Override
	public String toString() {
		return "Processo [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", parecer=" + parecer
				+ ", usuariosFinalizadores=" + usuariosFinalizadores + ", usuarioCriacao=" + usuarioCriacao
				+ ", status=" + status + ", dataCriacao=" + dataCriacao + "]";
	}
	
	
	
}

