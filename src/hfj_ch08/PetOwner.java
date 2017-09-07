package hfj_ch08;

public class PetOwner {
	
	public void gotShot(){
		Vet v = new Vet();
		Dog d = new Dog();
		Hippo h = new Hippo();
		
		v.giveShot(d);
		v.giveShot(h);
	}

}
