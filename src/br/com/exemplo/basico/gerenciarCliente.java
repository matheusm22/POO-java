package br.com.exemplo.basico;

import com.construtores.cliente;

public class gerenciarCliente {

	public static void main(String[] args) {
	
				
				cliente cl2 = new cliente();
				cl2.setId(10);
				cl2.SetNome("Matheus");
				cl2.SetEmail("matheus@gmail.com");
				System.out.println(cl2.nomePorId(10));

			}

		}


	


