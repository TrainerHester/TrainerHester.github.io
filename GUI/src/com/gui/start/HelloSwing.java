package com.gui.start;

/**
 * @author Hester
 * ��ʼ��frame���ã�������frameֻ�б���
 */

import javax.swing.*;

public class HelloSwing {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Hello Swing"); //�½�һ��frame�������ñ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //����رհ�ť
		frame.setSize(300, 160); //����Frame�Ĵ�С
		frame.setVisible(true); //����Ϊ�ɼ�
		for(int i = 0; i < (int)(Math.random() * 20); i++) {
			System.out.println(i);
			JLabel label = new JLabel("label No." + i);
			frame.add(label);
		}
	}
}
