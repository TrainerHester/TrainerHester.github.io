//:com/gui/start/BorderLayout1.java
package com.gui.start;

import javax.swing.*;
import java.awt.*;

public class BorderLayout1 extends JFrame{
	public BorderLayout1() {
		add(BorderLayout.CENTER, new JButton("center"));
		add(BorderLayout.EAST, new JButton("east"));
		add(BorderLayout.WEST, new JButton("west"));
		add(BorderLayout.NORTH, new JButton("north"));
		add(BorderLayout.SOUTH, new JButton("south"));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new BorderLayout1(), 300, 250);
	}

}
