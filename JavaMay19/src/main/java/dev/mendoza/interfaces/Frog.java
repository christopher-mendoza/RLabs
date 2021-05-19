package dev.mendoza.interfaces;

// When you implement an interface, you MUST define implementations for all of the abstract methods in the interface
public class Frog extends Animal implements Amphibious, Ectothermic {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Ribbit");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("The frog keeps swimming.");
	}

	public static void main(String[] args) {
		Frog f1 = new Frog();
		f1.swim();
		f1.makeSound();
		f1.heatUp();
		f1.coolDown();
		
		Swimmable f2 = new Frog();
		f2.swim();
		f2.floatOnWater();
		
		Animal f3 = new Frog();
		f3.exist();
		f3.makeSound();
	}

	@Override
	public void coolDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heatUp() {
		// TODO Auto-generated method stub
		
	}
}
