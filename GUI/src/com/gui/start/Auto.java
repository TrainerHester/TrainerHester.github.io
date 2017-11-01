package com.gui.start;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Auto {

	private JFrame frmCalculator;
	private JTextField textField;
	private JLabel lblNum;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auto window = new Auto();
					window.frmCalculator.setVisible(true);
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
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 469, 236);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("num1");
		lblNewLabel.setBounds(56, 40, 34, 25);
		frmCalculator.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(178, 42, 220, 21);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNum = new JLabel("num2");
		lblNum.setBounds(56, 84, 34, 25);
		frmCalculator.getContentPane().add(lblNum);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(178, 86, 220, 21);
		frmCalculator.getContentPane().add(textField_1);
		
		JButton btnSum = new JButton("sum");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				String s1 = textField_1.getText();
				try {
					int x = Integer.parseInt(s);
					int y = Integer.parseInt(s1);
					String output = String.valueOf(x + y);
				
					textField_2.setText(output);
				} catch(NumberFormatException ee) {
					textField_2.setText("Invalid Input!");
				}
			}
		});
		btnSum.setBounds(24, 140, 93, 23);
		frmCalculator.getContentPane().add(btnSum);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 141, 220, 21);
		frmCalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
