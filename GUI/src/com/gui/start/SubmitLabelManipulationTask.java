package com.gui.start;

import javax.swing.*;
import java.util.concurrent.*;

public class SubmitLabelManipulationTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Swing!");
		final JLabel label = new JLabel("This is a label!");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(160, 300);
		frame.setVisible(true);
		//������֮ǰ����
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				label.setText("This is a different!");
			}
		}); //�˴��½���һ�������࣬ʵ��Runnable�ӿ�,�Ӷ�ʹ������Ĳ���������main�߳�
	}

}
