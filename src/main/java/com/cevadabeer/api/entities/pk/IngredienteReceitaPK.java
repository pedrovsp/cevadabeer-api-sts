package com.cevadabeer.api.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cevadabeer.api.entities.Cerveja;
import com.cevadabeer.api.entities.Ingrediente;

@Embeddable
public class IngredienteReceitaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "ingrediente_id")
	private Ingrediente ingrediente;
	
	@ManyToOne
	@JoinColumn(name = "cerveja_id")
	private Cerveja cerveja;
	
	
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
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
		result = prime * result + ((cerveja == null) ? 0 : cerveja.hashCode());
		result = prime * result + ((ingrediente == null) ? 0 : ingrediente.hashCode());
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
		IngredienteReceitaPK other = (IngredienteReceitaPK) obj;
		if (cerveja == null) {
			if (other.cerveja != null)
				return false;
		} else if (!cerveja.equals(other.cerveja))
			return false;
		if (ingrediente == null) {
			if (other.ingrediente != null)
				return false;
		} else if (!ingrediente.equals(other.ingrediente))
			return false;
		return true;
	}
	
	
}
