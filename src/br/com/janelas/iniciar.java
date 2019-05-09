package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class iniciar extends JFrame {

	private JPanel contentPane;
	private JTextField txtOu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iniciar frame = new iniciar();
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
	public iniciar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Pessoa Fisica");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ClienteFisico jpf = new ClienteFisico();
				jpf.setVisible(true);	
				
				
			}
		});
		
		btnNewButton.setBounds(79, 37, 256, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pessoa Juridica");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteJuridico jpf = new ClienteJuridico();
				jpf.setVisible(true);	
			}
		});
		btnNewButton_1.setBounds(79, 147, 256, 48);
		contentPane.add(btnNewButton_1);
		
		txtOu = new JTextField();
		txtOu.setText("OU");
		txtOu.setBounds(197, 116, 26, 20);
		contentPane.add(txtOu);
		txtOu.setColumns(10);
	}

}
