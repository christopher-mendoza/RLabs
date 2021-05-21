package dev.mendoza.garbagecollection;

public class GarbageDriver {
	
	public static void main(String[] args) {
		System.out.println("Instantiating a new GarbageDriver object.");
		GarbageDriver garbage = new GarbageDriver();
		System.out.println("GarbageDriver object successfully created.");
		
		System.out.println("Some amount of time passes...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Assign the variable garbage to null");
		garbage = null;
		
		System.gc(); // NEVER DO THIS
		
		for(;;) {
			System.out.println("...");
		}
		
		
	}
	
	@Override
	protected void finalize() {
		System.out.println("GarbageDriver's finalize() method called.");
		System.out.println("Goodbye");
		System.exit(0);
	}
}
