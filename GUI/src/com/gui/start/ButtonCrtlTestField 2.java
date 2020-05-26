//:com/gui/start/ButtonCrtlTextField.java

package com.gui.start;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonCrtlTestField extends JFrame {
	private JButton b = new JButton("Foucu it to edit TextFiled");
	private JTextArea txt = new JTextArea(40, 65);
	
	class MyFocusListener extends FocusAdapter {

		@Override
		public void focusGained(FocusEvent e) {
			txt.setEditable(true);
			txt.requestFocus();
		}
		
	}
	
	public ButtonCrtlTestField() {
		setLayout(new BorderLayout());
		b.addFocusListener(new MyFocusListener());
		b.setBackground(Color.BLUE);
		txt.setEditable(false);
		add(BorderLayout.SOUTH, b);
		add(BorderLayout.CENTER, txt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new ButtonCrtlTestField(), 500, 300);
	}

}
