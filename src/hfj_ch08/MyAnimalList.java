package hfj_ch08;

import java.util.Arrays;

public class MyAnimalList {
	
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;
	
	public void add(Animal a){
		if (nextIndex < animals.length){
			animals[nextIndex] = a;
			System.out.println("Animal added at " + nextIndex);
			nextIndex++;
		}
	}
	
	public void getAnimals(){
		System.out.println(Arrays.toString(animals));
		for (int i = 0; i < animals.length; i++){
			if (animals[i] == null){
				System.out.println("No more animals");
				break;
			} else {
			animals[i].eat();
			animals[i].roam();
			animals[i].makeNoise();
			System.out.println("---");
			}
		}
	}
	

}
