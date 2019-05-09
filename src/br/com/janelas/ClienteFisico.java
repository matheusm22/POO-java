package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.POO.herança.PessoaFisica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteFisico extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	protected JLabel txtId;
	protected JLabel txtNome;
	protected JLabel txtEmail;
	protected JLabel txtTelefone;
	protected JLabel txtEndereco;
	protected JLabel txtCPF;
	protected JLabel txtRG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteFisico frame = new ClienteFisico();
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
	public ClienteFisico() {
		setTitle("Pessoa Fisica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(55, 28, 24, 14);
		lblId.setFont(new Font("Swis721 Lt BT", Font.PLAIN, 11));
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(37, 53, 48, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(84, 22, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 50, 307, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(37, 78, 48, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(84, 78, 307, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(26, 106, 53, 14);
		contentPane.add(lblTelefone);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 103, 307, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 128, 290, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(84, 159, 120, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(84, 190, 120, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(26, 131, 65, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(37, 162, 42, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(37, 193, 24, 14);
		contentPane.add(lblRg);
		
		JButton btnCadastrar = new JButton("Cadastrar");
	    final PessoaFisica pf = new PessoaFisica();
	    
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.setId(Integer.parseInt(txtId.getText()));
				pf.setNome(txtNome.getText());
				pf.setEmail(txtEmail.getText());
				pf.setTelefone(txtTelefone.getText());
				pf.setEndereco(txtEndereco.getText());
				pf.setNome(txtCPF.getText());
				pf.setNome(txtRG.getText());
		
				pf.cadastrar();
				JOptionPane.showMessageDialog(null, "cadastrou!");
			}
		});
		
		
		btnCadastrar.setBounds(268, 159, 123, 53);
		contentPane.add(btnCadastrar);
	}
}
