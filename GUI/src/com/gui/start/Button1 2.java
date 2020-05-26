//:com/gui/start/Button1.java
package com.gui.start;

import javax.swing.*;
import java.awt.*;

public class Button1 extends JFrame{
	private JButton
		b1 = new JButton("Button1"),
		b2 = new JButton("Button2");
	private JLabel
		label1 = new JLabel("Label one"),
		label2 = new JLabel("Label two");
	
	public Button1() {
		setLayout(new FlowLayout()); //每加入一个控件，都会从左到右，从上到下分布
		add(b1);
		add(b2);
		add(label1);
		add(label2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Button1(), 200, 100);
	}

}
