//:com/gui/start/OutputFile.java
package com.gui.start;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class OutputFile extends JFrame {
	
	private JButton copy = new JButton("copy");
	private JTextField filename = new JTextField(40);
	private JTextArea out = new JTextArea();
	private JLabel label = new JLabel("File Name: ");
	
	public OutputFile() {
		setLayout(new BorderLayout());
		out.setLineWrap(true);
		out.setWrapStyleWord(true);
		
		JScrollPane jsp = new JScrollPane(out);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(label);
		jp.add(filename);
		
		add(copy, BorderLayout.SOUTH);
		add(jsp, BorderLayout.CENTER);
		add(jp, BorderLayout.NORTH);
		
		copy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				out.setText("");
				String s = filename.getText();
				FileReader fr = null;
				BufferedReader br = null;
				String temp;
				try {
					fr = new FileReader(s);
					br = new BufferedReader(fr);
					while((temp = br.readLine())!= null) {
						out.append(temp + "\n");
					}
					br.close();
					fr.close();
				} catch(FileNotFoundException e) {
					out.setText("File not found!");
				} catch (IOException e) {
					out.setText("Something wrong happened during reading task!");
				}
			}
			
		});
		
		filename.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				copy.doClick();
			}
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocation(300, 100);
		setVisible(true);
		setTitle("Test FileReader!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OutputFile();
	}

}
