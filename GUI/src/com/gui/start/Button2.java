//:com/gui/start/Button2.java
package com.gui.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5828712884530293792L;
	private JButton
		button1 = new JButton("Button one"),
		button2 = new JButton("Button two");
	private JTextField txt = new JTextField(10);
	
	class ButtonListener implements ActionListener { //�����¼���������ʹ����������һ�������ѡ��
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String name = ((JButton)e.getSource()).getText();
			txt.setText(name); //�ڲ�����Է����ⲿ���private��Ա
		}
		
	}
	
	public Button2() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		button1.addActionListener(new ButtonListener()); //ע���¼�
		button2.addActionListener(new ButtonListener());
		add(txt);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Button2(), 200, 200);
	}

}
