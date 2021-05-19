package dev.mendoza.abstraction;

public class RedGiant extends Star {

	public RedGiant() {
		this("Default Red Giant Name");
	}
	
	public RedGiant(String name) {
		this.name = name;
	}
	
	@Override
	public void superNova() {
		// TODO Auto-generated method stub
		System.out.println("RedGiant's version of a supernova");
		
	}
	
	public void redGiantCanDo() {
		System.out.println("Only red giants can do this");
	}

	@Override
	public void twinkle() {
		// TODO Auto-generated method stub
		
	}

	
}
