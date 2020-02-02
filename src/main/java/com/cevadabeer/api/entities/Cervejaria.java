package com.cevadabeer.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cervejaria implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String tipoLogradouro;
	private String nomeRua;
	private String numero;
	private String cidade;
	private String estado;
	private List<Produto> Produto;
	private List<Cerveja> Cerveja;
	
	public Cervejaria() {
	}

	public Cervejaria(Long id, String nome, String tipoLogradouro, String nomeRua, String numero, String cidade,
			String estado, List<com.cevadabeer.api.entities.Produto> produto,
			List<com.cevadabeer.api.entities.Cerveja> cerveja) {
		this.id = id;
		this.nome = nome;
		this.tipoLogradouro = tipoLogradouro;
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		Produto = produto;
		Cerveja = cerveja;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Produto> getProduto() {
		return Produto;
	}

	public void setProduto(List<Produto> produto) {
		Produto = produto;
	}

	public List<Cerveja> getCerveja() {
		return Cerveja;
	}

	public void setCerveja(List<Cerveja> cervejas) {
		Cerveja = cervejas;
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
		Cervejaria other = (Cervejaria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
	
}
