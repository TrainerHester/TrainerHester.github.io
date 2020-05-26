//:com/gui/start/TrackEvent.java
package com.gui.start;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class TrackEvent extends JFrame{
	private HashMap<String, JTextField> h = new HashMap<>();
	private String[] event = {"focusGained", "focusLost", "keyPressed", "keyReleased",
			"keyTyped", "mouseClicked", "mouseEntered", "mouseExited", "mousePressed",
			"mouseReleased", "mouseDragged", "mouseMoved"};
	
	class MyButton extends JButton {
		void report(String field, String msg) {
			h.get(field).setText(msg);
		}
		
		FocusListener fl = new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				report("focusGained", e.paramString());
			}

			@Override
			public void focusLost(FocusEvent e) {
				report("focusLost", e.paramString());
			}
			
			
		};
		
		KeyListener kl = new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				report("keyPressed", e.paramString());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				report("keyReleased", e.paramString());
			}

			@Override
			public void keyTyped(KeyEvent e) {
				report("keyTyped", e.paramString());
			}
			
		};
		
		MouseListener ml = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				report("mouseClicked", e.paramString());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				report("mouseEntered", e.paramString());
			}

			@Override
			public void mouseExited(MouseEvent e) {
				report("mouseExited", e.paramString());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				report("mousePressed", e.paramString());
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				report("mouseReleased", e.paramString());
			}
			
		};
		
		MouseMotionListener mml = new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				report("mouseDragged", e.paramString());
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				report("mouseMoved", e.paramString());
			}
			
		};
		
		
		
		public MyButton(Color color, String label) {
			super(label);
			setBackground(color);
			addFocusListener(fl);
			addKeyListener(kl);
			addMouseListener(ml);
			addMouseMotionListener(mml);
		}
		
	}
	
	private MyButton b1 = new MyButton(Color.BLUE, "test1");
	private MyButton b2 = new MyButton(Color.RED, "test2");
	
	public TrackEvent() {
		setLayout(new GridLayout(event.length + 1 , 2));
		for(String evt: event) {
			JTextField t = new JTextField();
			t.setEditable(false);
			add(new JLabel(evt, JLabel.CENTER));
			add(t);
			h.put(evt, t);
		}
		add(b1);
		add(b2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new TrackEvent(), 700, 500);
	}

}
