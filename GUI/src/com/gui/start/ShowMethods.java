//:com/gui/start/ShowMethod.java
package com.gui.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
import java.util.regex.*;

public class ShowMethods extends JFrame{
	private JTextField name = new JTextField(25);
	private JTextArea results = new JTextArea(40, 65);
	private static Pattern addListener = Pattern.compile("(add\\w+?Listener\\(.*?\\))"); //������ʽ,����ƥ��addXXXListener(type arg...)
	private static Pattern qualifier = Pattern.compile("\\w+\\."); //������ʽ,����֮��ȥ��ǰ׺ for example: java.util.ArrayList -> ArrayList
	
	class NameL implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String nm = name.getText().trim();
			if(nm.length() == 0) {
				results.setText("No match");
				return;
			}
			Class<?> kind;
			try {
				kind = Class.forName("javax.swing." + nm); //������ƻ�ȡClass
			} catch (ClassNotFoundException ex) {
				ex.printStackTrace();
				results.setText("No match");
				return;
			}
			Method[] methods = kind.getMethods(); //��ȡClass�еķ���
			results.setText("");
			for(Method m : methods) {
				Matcher matcher = addListener.matcher(m.toString());
				if(matcher.find()) {
					//System.out.println(matcher.group());
					results.append(qualifier.matcher(matcher.group(1)).replaceAll("") + "\n");
				}
			}
		}
		
		
	}
	
	public ShowMethods() {
		NameL nameListener = new NameL();
		name.addActionListener(nameListener);
		JPanel top = new JPanel();
		top.add(new JLabel("Swing class name (press Enter):"));
		top.add(name);
		add(BorderLayout.NORTH, top);
		add(new JScrollPane(results));
		//��ʼ�����
		name.setText("JTextArea");
		nameListener.actionPerformed(new ActionEvent("", 0, ""));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new ShowMethods(), 500 ,400);
	}

}
