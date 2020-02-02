package com.cevadabeer.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cerveja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String cor;
	private Float teorAlcoolico;
	private String estilo;
	private String nome;
	private Float IBU;
	private Integer diasMaturacao;
	private String rotulo;
	private List<IngredientesReceita> IngredientesReceita;
	
	public Cerveja() {
	}

	public Cerveja(Long id, String cor, Float teorAlcoolico, String estilo, String nome, Float iBU,
			Integer diasMaturacao, String rotulo,
			List<com.cevadabeer.api.entities.IngredientesReceita> ingredientesReceita) {
		this.id = id;
		this.cor = cor;
		this.teorAlcoolico = teorAlcoolico;
		this.estilo = estilo;
		this.nome = nome;
		IBU = iBU;
		this.diasMaturacao = diasMaturacao;
		this.rotulo = rotulo;
		IngredientesReceita = ingredientesReceita;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Float getTeorAlcoolico() {
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

	public Float getIBU() {
		return IBU;
	}

	public void setIBU(Float iBU) {
		IBU = iBU;
	}

	public Integer getDiasMaturacao() {
		return diasMaturacao;
	}

	public void setDiasMaturacao(Integer diasMaturacao) {
		this.diasMaturacao = diasMaturacao;
	}

	public String getRotulo() {
		return rotulo;
	}

	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}

	public List<IngredientesReceita> getIngredientesReceita() {
		return IngredientesReceita;
	}

	public void setIngredientesReceita(List<IngredientesReceita> ingredientesReceita) {
		IngredientesReceita = ingredientesReceita;
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

	
	
	
}
