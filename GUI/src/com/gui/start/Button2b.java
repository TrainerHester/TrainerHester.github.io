//:com/gui/start/Button2b.java
package com.gui.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button2b extends JFrame{
	private JButton 
		button1 = new JButton("Button 1"),
		button2 = new JButton("Button 2");
	private JTextField txt = new JTextField(10);
	private ActionListener bl = new ActionListener() { //使用匿名内部类实现事件监听
		public void actionPerformed(ActionEvent e) {
			String s = ((JButton)e.getSource()).getText();
			txt.setText(s);
		}
	};
	
	public Button2b() {
		button1.addActionListener(bl);
		button2.addActionListener(bl);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(txt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Button2b(), 200, 200);
	}

}
