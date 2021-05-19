package dev.mendoza.abstraction;

public class OuterSpace {

	public static void main(String[] args) {
		Star sun = new YellowDwarf();
		
		sun.superNova();
		sun.solarFlare();
		
		YellowDwarf anotherSun = new YellowDwarf();
		anotherSun.supportLifeOnPlanetEarth();
	}
}
