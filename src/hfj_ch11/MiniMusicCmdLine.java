package hfj_ch11;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.*;

public class MiniMusicCmdLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] args2 = new int[2];
		
		int counter = 2;
		
		for (int i = 0; i < 2; i++){
			counter--;
			if (args2[0] > 0){
				System.out.println("Sisesta noot");
			} else {
				System.out.println("Sisesta instrument");
			}
	
			Scanner sc = new Scanner(System.in);
			int userInput = sc.nextInt();
		
			args2[i] = userInput;
		}
//		args2[0] = 40;
//		args2[1] = 70;
		System.out.println(Arrays.toString(args2));
		
		MiniMusicCmdLine mini = new MiniMusicCmdLine();
		if (args2.length < 2){
			System.out.println("Dont forget the instrument and note args!!!");
		} else {
//			int instrument = Integer.parseInt(args[0]);
			int instrument = (args2[0]);
//			int note = Integer.parseInt(args[1]);
			int note = (args2[1]);
			mini.play(instrument, note);
		}
	}
	
	public void play(int instrument, int note){
		try{
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			MidiEvent event = null;
			
			ShortMessage first = new ShortMessage();
			first.setMessage(192, 1, instrument, 0);
			MidiEvent changeInstrument = new MidiEvent(first, 1);
			track.add(changeInstrument);
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, note, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, note, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			player.setSequence(seq);
			player.start();
				Thread.sleep(5000);
				player.close();
			System.exit(0);
			
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

}
