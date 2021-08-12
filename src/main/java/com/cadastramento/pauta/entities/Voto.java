package com.cadastramento.pauta.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
