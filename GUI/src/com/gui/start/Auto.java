package com.gui.start;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Auto {

	private JFrame frmSimpleGui;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auto window = new Auto();
					window.frmSimpleGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Auto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleGui = new JFrame();
		frmSimpleGui.setTitle("Simple GUI");
		frmSimpleGui.setBounds(100, 100, 330, 300);
		frmSimpleGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleGui.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(173, 67, 79, 21);
		frmSimpleGui.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(173, 112, 79, 21);
		frmSimpleGui.getContentPane().add(passwordField);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(59, 70, 54, 15);
		frmSimpleGui.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(59, 115, 54, 15);
		frmSimpleGui.getContentPane().add(lblPassword);
		
		JButton btnLogIn = new JButton("log in");
		btnLogIn.setBounds(56, 161, 93, 23);
		frmSimpleGui.getContentPane().add(btnLogIn);
		
		JPanel panel = new JPanel();
		panel.setBounds(167, 161, 117, 72);
		frmSimpleGui.getContentPane().add(panel);
	}
}
