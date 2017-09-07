package hfj_ch08;

abstract public class Animal {
	
	private String picture;
	private String food;
	private Boolean hunger = false;
	private String boundaries;
	private String location;
	
	public void makeNoise(){
		System.out.println("Im general animal noise!");
	}
	
	public void eat(){
		System.out.println("If im an animal, I eat");
	}
	
	public void sleep(){
		System.out.println("All animals sleep");
	}
	
	public void roam(){
		System.out.println("I roam around, Im from animal class");
	}
	
}
