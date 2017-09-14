package hfj_ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color colorConstructor = new Color(red, green, blue);
		
		g2d.setColor(colorConstructor);
		g2d.fillRect(50, 50, 100, 100);
	}

}
