package br.com.classes;

public class Usuario {
	// declara��o dos atributos da classe Usu�rio
	public String login;
    public String senha;

	// Declara��o dos m�todos da classe Usu�rio
	public String cadastrar() {
		return "(Cadastro realizado com sucesso)";
	}

	// Declara��o do m�todo logar para permitir o acesso ao sistema
	public String logar() {
		
		String msg="";

		if (login.equals("adm") && senha.equals("123")) {
			msg = "bem-vindo!";
		
		} else {
		    msg = "Login ou senha incorreto";
		}
		return msg;
	}	
	
	// Declara��o do m�todo logout
	public String logout() {
        return "Voc� saiu do aplicativo";
	}
}