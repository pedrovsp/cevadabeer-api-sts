package com.cevadabeer.api.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	@OneToMany(mappedBy="cervejaria")
	private Set<Produto> produto = new HashSet<>();
	
	@OneToMany(mappedBy="cervejaria")
	private Set<Cerveja> cerveja = new HashSet<>();
	
	public Cervejaria() {
	}

	public Cervejaria(Long id, String nome, String tipoLogradouro, String nomeRua, String numero, String cidade,
			String estado, Set<com.cevadabeer.api.entities.Produto> produto,
			Set<com.cevadabeer.api.entities.Cerveja> cerveja) {
		this.id = id;
		this.nome = nome;
		this.tipoLogradouro = tipoLogradouro;
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.produto = produto;
		this.cerveja = cerveja;
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

	public Set<Produto> getProduto() {
		return this.produto;
	}

	public void setProduto(Set<Produto> produto) {
		this.produto = produto;
	}

	public Set<Cerveja> getCerveja() {
		return this.cerveja;
	}

	public void setCerveja(Set<Cerveja> cervejas) {
		this.cerveja = cervejas;
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
