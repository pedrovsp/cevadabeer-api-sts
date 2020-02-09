package com.cevadabeer.api.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.cevadabeer.api.entities.pk.IngredienteReceitaPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class IngredienteReceita implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IngredienteReceitaPK id = new IngredienteReceitaPK();
	
	private Double quantidade;
	
	public IngredienteReceita() {
	}

	public IngredienteReceita(Ingrediente ingrediente, Cerveja cerveja, Double quantidade) {
		id.setCerveja(cerveja);
		id.setIngrediente(ingrediente);
		this.quantidade = quantidade;
	}

	@JsonIgnore
	public Cerveja getCerveja() {
		return id.getCerveja();
	}
	
	public void setCerveja(Cerveja cerveja) {
		id.setCerveja(cerveja);
	}
	
	public Ingrediente getIngrediente() {
		return id.getIngrediente();
	}
	
	public void setIngrediente(Ingrediente ingrediente) {
		id.setIngrediente(ingrediente);
	}
	
	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
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
		IngredienteReceita other = (IngredienteReceita) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
