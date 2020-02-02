package com.cevadabeer.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IngredientesReceita implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private Cerveja cerveja;
	private Ingrediente ingrediente;
	private Float quantidadePorLitro;
	
	public IngredientesReceita() {
	}

	public IngredientesReceita(Long id, Ingrediente ingrediente, Float quantidadePorLitro) {
		super();
		this.id = id;
		this.ingrediente = ingrediente;
		this.quantidadePorLitro = quantidadePorLitro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public Float getQuantidadePorLitro() {
		return quantidadePorLitro;
	}

	public void setQuantidadePorLitro(Float quantidadePorLitro) {
		this.quantidadePorLitro = quantidadePorLitro;
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
		IngredientesReceita other = (IngredientesReceita) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
}
