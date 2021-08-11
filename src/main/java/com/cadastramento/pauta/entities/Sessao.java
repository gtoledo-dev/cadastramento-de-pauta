package com.cadastramento.pauta.entities;

import java.util.Objects;

public class Sessao {
	
	private Long id;
	private String codigoPauta;
	private String dataInicio;
	private String tempoSessao;
	
	public Sessao () {
		
	}
	
	public Sessao(Long id, String codigoPauta, String dataInicio, String tempoSessao) {
		super();
		this.id = id;
		this.codigoPauta = codigoPauta;
		this.dataInicio = dataInicio;
		this.tempoSessao = tempoSessao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoPauta() {
		return codigoPauta;
	}

	public void setCodigoPauta(String codigoPauta) {
		this.codigoPauta = codigoPauta;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getTempoSessao() {
		return tempoSessao;
	}

	public void setTempoSessao(String tempoSessao) {
		this.tempoSessao = tempoSessao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sessao other = (Sessao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Sessao [id=" + id + ", codigoPauta=" + codigoPauta + ", dataInicio=" + dataInicio + ", tempoSessao="
				+ tempoSessao + "]";
	}
	
	

}
