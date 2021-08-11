package com.cadastramento.pauta.entities;

import java.util.Objects;

public class Voto {
	
	private Long id;
	private String codigoSessao;
	private String cpfAssociado;
	
	public Voto () {
		
	}

	public Voto(Long id, String codigoSessao, String cpfAssociado) {
		super();
		this.id = id;
		this.codigoSessao = codigoSessao;
		this.cpfAssociado = cpfAssociado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoSessao() {
		return codigoSessao;
	}

	public void setCodigoSessao(String codigoSessao) {
		this.codigoSessao = codigoSessao;
	}

	public String getCpfAssociado() {
		return cpfAssociado;
	}

	public void setCpfAssociado(String cpfAssociado) {
		this.cpfAssociado = cpfAssociado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfAssociado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		return Objects.equals(cpfAssociado, other.cpfAssociado);
	}

	@Override
	public String toString() {
		return "Voto [id=" + id + ", codigoSessao=" + codigoSessao + ", cpfAssociado=" + cpfAssociado + "]";
	}
	
	

}
