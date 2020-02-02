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
		result = prime * result + ((IBU == null) ? 0 : IBU.hashCode());
		result = prime * result + ((IngredientesReceita == null) ? 0 : IngredientesReceita.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((diasMaturacao == null) ? 0 : diasMaturacao.hashCode());
		result = prime * result + ((estilo == null) ? 0 : estilo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rotulo == null) ? 0 : rotulo.hashCode());
		result = prime * result + ((teorAlcoolico == null) ? 0 : teorAlcoolico.hashCode());
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
		if (IBU == null) {
			if (other.IBU != null)
				return false;
		} else if (!IBU.equals(other.IBU))
			return false;
		if (IngredientesReceita == null) {
			if (other.IngredientesReceita != null)
				return false;
		} else if (!IngredientesReceita.equals(other.IngredientesReceita))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (diasMaturacao == null) {
			if (other.diasMaturacao != null)
				return false;
		} else if (!diasMaturacao.equals(other.diasMaturacao))
			return false;
		if (estilo == null) {
			if (other.estilo != null)
				return false;
		} else if (!estilo.equals(other.estilo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rotulo == null) {
			if (other.rotulo != null)
				return false;
		} else if (!rotulo.equals(other.rotulo))
			return false;
		if (teorAlcoolico == null) {
			if (other.teorAlcoolico != null)
				return false;
		} else if (!teorAlcoolico.equals(other.teorAlcoolico))
			return false;
		return true;
	}
	
	
}
