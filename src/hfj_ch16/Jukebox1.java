package hfj_ch16;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Jukebox1 {
	
	//vr1
//	ArrayList<String> songList = new ArrayList<String>();
	//vr2
	ArrayList<Song> songList = new ArrayList<Song>(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jukebox1().go();
	}
	
	class ArtistCompare implements Comparator<Song>{
		public int compare(Song one, Song two){
			return one.getArtist().compareTo(two.getArtist());
		}
	}
	
	public void go(){
		//raamatu j2rgi
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
//		ArtistCompare artistCompare = new ArtistCompare();
//		Collections.sort(songList, artistCompare);
//		System.out.println(songList);
		
//		HashSet<Song> songSet = new HashSet<Song>();
//		songSet.addAll(songList);
//		System.out.println(songSet);
		
		TreeSet<Song> songSet = new TreeSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
		
		//tehtud loengu ylesande j2rgi
//		int counter = 11;
//		for (int i = 0; i < 10; i++){
//			counter--;
//			System.out.println("Sisesta muusikapalu " + counter + " korda");
//			Scanner sc = new Scanner(System.in);
//			String userInput = sc.nextLine();
//			songList.add(userInput);
//		}
//		Collections.sort(songList);
//		System.out.println(songList);
	}
	
	void getSongs(){
		try{
			File file = new File("SongListMore.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null){
				addSong(line);
			}
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	void addSong(String lineToParse){
		String[] tokens = lineToParse.split("/");
//		songList.add(tokens[0]);
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}

}
