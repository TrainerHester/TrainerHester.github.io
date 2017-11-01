package com.gui.start;

import javax.swing.*;
import java.util.concurrent.*;

//该程序添加了一个Label，缺陷在于main线程中使用更改组件不是一个好习惯

public class HelloLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Label"); //新建一个label
		frame.add(label); //将label加入到frame中
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label.setText("This is a different!"); //改变label的内容
	}

}
