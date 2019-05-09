package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.classes.Usuario;

public class GerenciarUsuarios extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame janela = new JFrame();
		janela.setSize(505,400);
		janela.setTitle("Gerenciar Usuários");
		janela.setLocationRelativeTo(null);//alinha a janela ao centro da tela
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setResizable(false);//impede que a janela seja redimensionada
		
        //Configurar o gerenciado de layout
		//usaremos null
		janela.getContentPane().setLayout(null);
		
		//Agora podemos criar nossos componentes e posiciona-los da maneira que quisermos
		JButton btmCadastrar = new JButton("Cadastrar");
		JButton btmLogar = new JButton("Logar");
		JButton btmLogout = new JButton("Logout");
		/*
		 * O Fato de você ter configurado o gerenciador de layout como nulll
		 * (absolute) lhe permite posicionar os elementos(componentes) qualquer parte da tela usando
		 * coordenadas:
		 * x-> posição horizontal
		 * y-> posição vertical
		 * width -> largura
		 * height -> altura
		 */
		//165,300,150,30
		//330,300,150,30
		btmCadastrar.setBounds(330,300,150,30);
		btmLogar.setBounds(170,300,150,30);
		btmLogout.setBounds(10,300,150,30);
		
		//para adicionar o botão a janela iremos usar
		//o comando add e passar como parâmetro o componente
		//que neste e caso é o btn cadastrar
		
		janela.add(btmCadastrar);
		janela.add(btmLogar);
		janela.add(btmLogout);
		//vamos inserir as labels a janela
		JLabel lblLogin = new JLabel("login:");
		lblLogin.setBounds(40, 50, 100, 30);
		janela.add(lblLogin);
		
		final JTextField txtLogin = new JTextField();
		txtLogin.setBounds(120,50,330,30);
		janela.add(txtLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(40, 100, 100, 30);
		janela.add(lblSenha);
		
		final JPasswordField txtSenha = new JPasswordField();
		txtSenha.setBounds(120, 100, 330, 30);
		janela.add(txtSenha);
		
		
		final JTextField txtResultado = new JTextField();
		txtResultado.setBounds(120,150,330,120);
		txtResultado.setEditable(false);
		janela.add(txtResultado);
		
		
		/*
		 * Vamos adicionar a ação de clique ao botão cadastrar e erealizar
		 * a chamada do método cadstrar que está na classe Usuário
		 */
		
		
		
		final Usuario us = new Usuario();
		
		btmCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//txtLogin.setText("oi");
				us.login = txtLogin.getText(); //Pegar o que foi escrito na caixa do login
				us.senha = txtSenha.getText(); //Pegar o que foi escrito na caixa senha
				txtResultado.setText(us.cadastrar());
			}
		});
		
		btmLogar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtResultado.setText(us.logar());
				
			}
		});
		btmLogout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtResultado.setText(us.logout());
			}
		});
		
		janela.setVisible(true);
	}

}
