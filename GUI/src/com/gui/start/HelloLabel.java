package com.gui.start;

import javax.swing.*;
import java.util.concurrent.*;

//�ó��������һ��Label��ȱ������main�߳���ʹ�ø����������һ����ϰ��

public class HelloLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Label"); //�½�һ��label
		frame.add(label); //��label���뵽frame��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label.setText("This is a different!"); //�ı�label������
	}

}
