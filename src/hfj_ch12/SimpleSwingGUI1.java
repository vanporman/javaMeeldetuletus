package hfj_ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingGUI1 {
	JButton colorButton;
	JButton labelButton;
	JFrame frame;
	JLabel label;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleSwingGUI1 gui = new SimpleSwingGUI1();
		gui.go();
	}
	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		colorButton = new JButton("change color");
		colorButton.addActionListener(new ColorListener());
		
		labelButton = new JButton("change label");
		labelButton.addActionListener(new LabelListener());
		
		label = new JLabel("I'm a label");
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	class ColorListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			frame.repaint();
			
		}
		
	}

	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			label.setText("Label changed!");	
		}		
	}
	
}
