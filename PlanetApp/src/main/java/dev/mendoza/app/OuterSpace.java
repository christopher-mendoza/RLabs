package dev.mendoza.app;

import dev.mendoza.models.Planet;

public class OuterSpace {
	
	public static void main(String[] args) {
		Planet earf = new Planet("Earf", 726646573, 2822828, false);
		
		earf.addMoon("Phobos", 7266465, 28228);
		earf.addMoon("Deimos", 845863241, 667985);
		
		System.out.println(earf);
		System.out.println(earf.calculateSurfaceGravity());
		

	}

}
