package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.POO.herança.PessoaJuridica;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteJuridico extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteJuridico frame = new ClienteJuridico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClienteJuridico() {
		setTitle("Pessoa juridica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(52, 32, 21, 14);
		contentPane.add(lblId);
		
		JLabel lblRazosocial = new JLabel("Raz\u00E3oSocial:");
		lblRazosocial.setBounds(10, 57, 84, 14);
		contentPane.add(lblRazosocial);
		
		textField = new JTextField();
		textField.setBounds(119, 29, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 54, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNomefantasia = new JLabel("NomeFantasia:");
		lblNomefantasia.setBounds(0, 82, 94, 14);
		contentPane.add(lblNomefantasia);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 79, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(37, 107, 72, 14);
		contentPane.add(lblCnpj);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 104, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(37, 134, 72, 14);
		contentPane.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 131, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(25, 159, 84, 14);
		contentPane.add(lblTelefone);
		
		textField_5 = new JTextField();
		textField_5.setBounds(119, 156, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(23, 184, 86, 14);
		contentPane.add(lblEndereo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(119, 181, 96, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		final PessoaJuridica pj = new PessoaJuridica();	
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				pj.cadastrar();
			}
		});
		btnCadastrar.setBounds(257, 82, 112, 91);
		contentPane.add(btnCadastrar);
	}

}
