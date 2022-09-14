package br.com.alura.java.io.test;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author Lucas Rodrigues
 * @version 0.1
 * 
 */

public class Cliente implements Serializable {

	
	private static final long serialVersionUID = 1155169687209077648L;
	String nome;
	String cpf;
	String profissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
