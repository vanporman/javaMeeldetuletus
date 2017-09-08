package hfj_ch08;



public class AnimalTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAnimalList list = new MyAnimalList();
		Dog d = new Dog();
		Cat c = new Cat();
		Hippo h = new Hippo();
		
		PetOwner po = new PetOwner();
		
		list.add(d);
		list.add(c);
		list.add(h);
		
		d.roam();
		h.roam();
		
		c.eat();
		
		d.sleep();
		c.sleep();
		
		d.makeNoise();
		
		po.gotShot();
		
		list.getAnimals();

	}

}
