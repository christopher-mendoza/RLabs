package dev.mendoza.models;

public class Moon {
	private String name;
	private int radius;
	private int mass;



	public Moon(String name) {
		this.name = name;
	}
	
	public Moon(String name, int radius, int mass) {
		super();
		this.name = name;
		this.radius = radius;
		this.mass = mass;
	}

	@Override
	public String toString() {
		return "Moon [name=" + name + ", radius=" + radius + ", mass=" + mass + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}
	
	
}
