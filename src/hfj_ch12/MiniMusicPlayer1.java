package hfj_ch12;

import java.awt.Color;
import java.awt.Graphics;

import javax.sound.midi.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniMusicPlayer1 {		//Version 3, p 391, ch12
	
	static JFrame f = new JFrame("Tekst");
	static MyDrawingPanel mdp;

	public static void main(String[] args) {
		MiniMusicPlayer1 miniMP = new MiniMusicPlayer1();
		miniMP.go();
		
	}
	
	public void setUpGUI(){
		mdp = new MyDrawingPanel();
		f.setContentPane(mdp);
		f.setBounds(30, 30, 300, 300);
		f.setVisible(true);
	}
	
	public void go(){
		setUpGUI();
		
		try{
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(mdp, eventsIWant);
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			int r = 0;
			for (int i = 5; i < 60; i += 4){
				r = (int) ((Math.random() * 50) +1);
				track.add(makeEvent(144, 1, r, 100, i));
				track.add(makeEvent(176, 1, 127, 0, i));
				track.add(makeEvent(128, 1, r, 100, i+2));
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex){
			ex.printStackTrace();
		}			
	}
	
	public static MidiEvent makeEvent(int cmod, int chan, int one, int two, int tick){
		MidiEvent event = null;
		try{
			ShortMessage a = new ShortMessage();
			a.setMessage(cmod, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e){ }
		return event;
	}
	
	class MyDrawingPanel extends JPanel implements ControllerEventListener{
		boolean msg = false;
		
		public void controlChange(ShortMessage events){
			msg = true;
			repaint();
		}
		
		public void paintComponent(Graphics g){
			if (msg){
				int red = (int) (Math.random() * 250);
				int green = (int) (Math.random() * 250);
				int blue = (int) (Math.random() * 250);
				
				g.setColor(new Color(red, green, blue));
				
				int height = (int) ((Math.random() * 120) + 10);
				int width = (int) ((Math.random() * 120) + 10);
				
				int x = (int) ((Math.random() * 40) + 10);
				int y = (int) ((Math.random() * 40) + 10);
				
				g.fillRect(x, y, height, width);
			}
		}
	}
}
