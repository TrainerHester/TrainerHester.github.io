//:com/gui/start/Button3.java

package com.gui.start;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Button3 extends JFrame {
	class MyButton extends JButton {
		Random random = new Random();
		public MyButton(String text) {
			super(text);
			setBackground(Color.BLUE);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					setBackground(
							new Color(random.nextInt(256),
							random.nextInt(256),
							random.nextInt(256)));
				}
				
			});
		}
		
	}
	public Button3() {
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER, new MyButton("change color"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Button3(), 300, 200);
	}

}
