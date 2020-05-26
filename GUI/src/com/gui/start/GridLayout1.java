//:com/gui/start/GridLayout1.java
package com.gui.start;

import java.awt.*;
import javax.swing.*;

public class GridLayout1 extends JFrame{
	public GridLayout1() {
		setLayout(new GridLayout(7, 3)); //将窗口分为7 * 3的区域进行布局
		for(int i = 0; i < 20; i++) {
			add(new Button("button " + i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new GridLayout1(), 300, 550);
	}
}
