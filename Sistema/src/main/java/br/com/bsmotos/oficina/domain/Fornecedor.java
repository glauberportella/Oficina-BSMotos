package br.com.bsmotos.oficina.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Fornecedor extends GenericDomain {
	@Column(length = 50, nullable = false)
	private String nomeFantasia;

	@Column(length = 50, nullable = false)
	private String telefone;

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
