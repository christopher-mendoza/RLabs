package dev.mendoza.inheritance;

public class CarGarage {
	
	public static void main(String[] args) {
		Car c = new Car("New Car", 800, "pink");
		System.out.println(c);
		
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getColor());
		
		c.setName(null);
		c.setMileage(-9);
		c.setColor(null);
		
		c.setName("Mercedes");
		c.setMileage(10000);
		c.setColor("White");
		
		System.out.println(c);
		c.drive();
		
		Subaru cross = new Subaru("Crosstrek", 10000, "blue");
		System.out.println(cross);
		cross.drive();
	}

}
