package hfj_ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingGUI1 implements ActionListener {
	JButton button;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleSwingGUI1 gui = new SimpleSwingGUI1();
		gui.go();
	}
	
	public void go(){
		JFrame frame = new JFrame();
		button = new JButton("click me");
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		button.setText("I'v been clicked");
		
	}

}
