//:com/gui/start/TextFields.java
package com.gui.start;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

public class TextFields extends JFrame{
	private JButton
		b1 = new JButton("Get Text"),
		b2 = new JButton("Set Text");
	
	private JTextField
		t1 = new JTextField(30),
		t2 = new JTextField(30),
		t3 = new JTextField(30);
	
	private String s = "";
	private String t1_field = "";
	
	class UpperCaseDocument extends PlainDocument{
		private boolean upperCase = true;
		public void setUpperCase(boolean flag) {
			upperCase = flag;
		}
		public void insertString(int offset, String str, AttributeSet attSet) throws BadLocationException {
			t1_field += str;
			if(upperCase) 
				str = str.toUpperCase();
			super.insertString(offset, str, attSet);
		}
	}
	private UpperCaseDocument ucd = new UpperCaseDocument();
	
	public TextFields() {
		t1.setDocument(ucd);
		ucd.addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				
			}

			@Override
			public void insertUpdate(DocumentEvent de) {
				
				t2.setText(t1_field);
				t3.setText("Text: " + t1.getText());
			}

			@Override
			public void removeUpdate(DocumentEvent de) {
				int i1 = de.getOffset();
				int i2 = de.getLength();
				t1_field = t1_field.substring(0, i1) + t1_field.substring(i1 + i2);
				t2.setText(t1_field);
			}
			
		});
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(t1.getSelectedText() == null)
					s = t1.getText();
				else
					s = t1.getSelectedText();
				t1.setEditable(true);
			}
			
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ucd.setUpperCase(false);
				t1.setText("Insert by Button2: " + s);
				ucd.setUpperCase(true);
				t1.setEditable(false);
			}
			
		});
		t1.addActionListener(new ActionListener() {
			private int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				t3.setText("t1 Action Event " + count++);
				
			}
			
		});
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(t1);
		add(t2);
		add(t3);
	}

	public static void main(String[] args) {
		SwingConsole.run(new TextFields(), 375, 200);
	}

}
