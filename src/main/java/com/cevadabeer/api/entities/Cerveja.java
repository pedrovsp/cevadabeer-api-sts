package com.cevadabeer.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.cevadabeer.api.entities.enums.Conplexidade;
import com.cevadabeer.api.entities.enums.Cor;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cerveja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private Cor cor;
	private double teorAlcoolico;
	private String estilo;
	private String nome;
	private double ibu;
	private Integer diasMaturacao;
	private Conplexidade conplexidade;
	
	@ManyToOne
	@JoinColumn(name = "cervejaria_id")
	private Cervejaria cervejaria;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cerveja")
	private List<Producao> producoes = new ArrayList<>();
	
	@OneToMany(mappedBy = "id.cerveja")
	private Set<IngredienteReceita> receita = new HashSet<>();
	
	public Cerveja() {
	}

	public Cerveja(Long id, Cor cor, double teorAlcoolico, String estilo, String nome, double ibu, Integer diasMaturacao,
			Conplexidade conplexidade, Cervejaria cervejaria) {
		this.id = id;
		this.cor = cor;
		this.teorAlcoolico = teorAlcoolico;
		this.estilo = estilo;
		this.nome = nome;
		this.ibu = ibu;
		this.diasMaturacao = diasMaturacao;
		this.conplexidade = conplexidade;
		this.cervejaria = cervejaria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(Float teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getIbu() {
		return ibu;
	}

	public void setIbu(Float ibu) {
		this.ibu = ibu;
	}

	public Integer getDiasMaturacao() {
		return diasMaturacao;
	}

	public void setDiasMaturacao(Integer diasMaturacao) {
		this.diasMaturacao = diasMaturacao;
	}

	public Cervejaria getCervejaria() {
		return cervejaria;
	}

	public void setCervejaria(Cervejaria cervejaria) {
		this.cervejaria = cervejaria;
	}
	
	public Conplexidade getConplexidade() {
		return conplexidade;
	}

	public void setConplexidade(Conplexidade conplexidade) {
		this.conplexidade = conplexidade;
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
		Cerveja other = (Cerveja) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public List<Producao> getProducao() {
		return producoes;
	}

	public Set<IngredienteReceita> getReceita(){
		return receita;
	}
}
