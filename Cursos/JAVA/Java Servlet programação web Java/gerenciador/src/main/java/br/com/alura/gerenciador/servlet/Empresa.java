package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	private int id;
	private String nome;
	private Date dataAbertura = new Date();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataAbertura() { 
	    return dataAbertura;
	}
}
