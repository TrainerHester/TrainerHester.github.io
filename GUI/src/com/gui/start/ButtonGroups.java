//:com/gui/start/ButtonGroups
package com.gui.start;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.*;
import java.lang.reflect.*;

public class ButtonGroups extends JFrame{
	private static String[] ids = {"June", "Ward", "Beaver", "Wally", "Eddie", "Lumpy"};
	
	static JPanel makeBPanel(Class<? extends AbstractButton> kind, String[] ids) {
		ButtonGroup bg = new ButtonGroup();
		JPanel jp = new JPanel();
		String title = kind.getName();
		title = title.substring(title.lastIndexOf(".") + 1);
		jp.setBorder(new TitledBorder(title));
		for(String s : ids) {
			AbstractButton ab = new JButton("Failed");
			try {
				Constructor<? extends AbstractButton> ctro = kind.getConstructor(String.class);
				ab = (AbstractButton)ctro.newInstance(s);
			} catch (Exception e) {
				System.err.println("can't create " + kind);
			}
			bg.add(ab);//将按钮添加到按钮组
			jp.add(ab);//将按钮添加到Panel
			ab.addItemListener(new ItemListener() {//添加事件
				@Override
				public void itemStateChanged(ItemEvent ie) {
					AbstractButton button = (AbstractButton)ie.getItem();
					if(button.isSelected()) {
						System.out.println(button.getText());
					}
				}
				
			});
		}
		return jp;
	}
	
	public ButtonGroups() {
		setLayout(new FlowLayout());
		add(makeBPanel(JButton.class, ids));
		add(makeBPanel(JToggleButton.class, ids));
		add(makeBPanel(JCheckBox.class, ids));
		add(makeBPanel(JRadioButton.class, ids));
	}

	public static void main(String[] args) {
		SwingConsole.run(new ButtonGroups(), 500, 350);
	}

}
