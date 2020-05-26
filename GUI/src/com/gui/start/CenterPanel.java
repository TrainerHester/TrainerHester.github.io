package com.gui.start;

import java.awt.*;

import javax.swing.*;

public class CenterPanel extends JFrame {
	private JPanel jp = new JPanel();
	
	public CenterPanel(int width, int height) {
		this.getContentPane().setBackground(Color.blue);
		setBounds(300, 300, width, height);
		setLayout(null);
		jp.setBounds(width / 4, height / 4, width / 2, height / 2);
		jp.setBackground(Color.yellow);
		add(jp);
		setTitle("CenterPanel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CenterPanel cp = new CenterPanel(500, 300);
	}

}
