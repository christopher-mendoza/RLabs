package dev.mendoza.lambdas;

@FunctionalInterface
public interface Magic {
	// variables
	// int count = 0;
	
	void castSpell(); // public abstract implied
	
	default void castHex() { // 'default' is not the access modifier that provides package-private access
		System.out.println("Shamans be like");
	}
}
