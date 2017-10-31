package com.gui.start;

/**
 * @author Hester
 * 初始的frame运用，产生的frame只有标题
 */

import javax.swing.*;

public class HelloSwing {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Hello Swing"); //新建一个frame对象并设置标题
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //激活关闭按钮
		frame.setSize(300, 160); //设置Frame的大小
		frame.setVisible(true); //设置为可见
		for(int i = 0; i < (int)(Math.random() * 20); i++) {
			System.out.println(i);
			JLabel label = new JLabel("label No." + i);
			frame.add(label);
		}
	}
}
