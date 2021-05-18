package dev.mendoza.encapsulation.a;

public class APlayground {
	
	public static void main(String[] args) {
		Shape s = new Shape();
		s.publicMethod();
		s.protectedMethod();
		s.defaultMethod();
		// s.privateMethod(); No access because it is not in the same class
	}

}
