package com.cevadabeer.api.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Producao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private Integer quantidadeEmLitros;
	private Instant dtInicio;
	private Instant dtFim;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "cerveja_id")
	private Cerveja cerveja;
	
	public Producao() {
	}

	public Producao(Long id, Integer quantidadeEmLitros, Instant dtInicio, Instant dtFim, Cerveja cerveja) {
		this.id = id;
		this.quantidadeEmLitros = quantidadeEmLitros;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.cerveja = cerveja;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidadeEmLitros() {
		return quantidadeEmLitros;
	}

	public void setQuantidadeEmLitros(Integer quantidadeEmLitros) {
		this.quantidadeEmLitros = quantidadeEmLitros;
	}

	public Instant getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Instant dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Instant getDtFim() {
		return dtFim;
	}

	public void setDtFim(Instant dtFim) {
		this.dtFim = dtFim;
	}

	public Cerveja getCerveja() {
		return cerveja;
	}

	public void setCerveja(Cerveja cerveja) {
		this.cerveja = cerveja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producao other = (Producao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
