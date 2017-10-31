package com.gui.start;

import javax.swing.*;
import java.util.concurrent.*;

//正规的GUI编程方式，继承Frame类并且main线程只负责分发任务

public class SubmitSwingPrograme extends JFrame {
	JLabel label;
	public SubmitSwingPrograme() {
		super("Hello Swing!");
		label = new JLabel("A Label");
		this.add(label);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final SubmitSwingPrograme ssp = new SubmitSwingPrograme();
		SwingConsole.run(ssp, 1080, 720);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ssp.label.setText("This is different!");
			}
		});
	}

}
