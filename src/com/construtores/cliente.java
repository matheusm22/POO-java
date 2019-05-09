package com.construtores;

public class cliente {

	private int id;
	private String nome;
	private String email;
	
	/*
	 * Métodos de acesso get set...
	 */
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void SetNome(String Nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void SetEmail(String Email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	/*
	 * Sempre público
	 * Sempre com o mesmo nome da classe
	 * Não tem tipo de retorno, ou seja, NÃO É VOID OU
	 * QUALQUER OUTRO TIPO
	 */
	public cliente(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public cliente() {}
	
	public String cadastrar() {
		return "Cadastro realizado";
		
	}
	public String nomePorId(int id) {
		
		String msg="";
		
		if(this.id==id) {
			msg = this.nome;
		}
		else {
			msg = "Não localizado";
		}
		return msg;
		
	}
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		
	}
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		
	}
	
	
}


		