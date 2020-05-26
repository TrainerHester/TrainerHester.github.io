//:con/gui/start/Buttons.java
package com.gui.start;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;

public class Buttons extends JFrame{
	private JButton jb= new JButton("JButton");
	private BasicArrowButton
		up = new BasicArrowButton(BasicArrowButton.NORTH),
		down = new BasicArrowButton(BasicArrowButton.SOUTH),
		right = new BasicArrowButton(BasicArrowButton.EAST),
		left = new BasicArrowButton(BasicArrowButton.WEST);
	public Buttons() {
		setLayout(new FlowLayout());
		add(jb);
		add(new JToggleButton("JToggleButton"));
		add(new JCheckBox("JCheckBox"));
		add(new JRadioButton("JRadioButton"));
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder("Directions"));
		jp.add(up);
		jp.add(down);
		jp.add(right);
		jp.add(left);
		add(jp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Buttons(), 350, 200);
	}

}
