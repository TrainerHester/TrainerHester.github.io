//:com/gui/start/GridLayout1.java
package com.gui.start;

import java.awt.*;
import javax.swing.*;

public class GridLayout1 extends JFrame{
	public GridLayout1() {
		setLayout(new GridLayout(7, 3)); //�����ڷ�Ϊ7 * 3��������в���
		for(int i = 0; i < 20; i++) {
			add(new Button("button " + i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new GridLayout1(), 300, 550);
	}
}
