package dev.mendoza.primitives;

public class PrimitivePlayground {

	public static void main(String[] args) {
		/*
		 * Variables
		 * All variables only hold a single value
		 * 
		 * Primitives reserve a fixed amount of memory
		 * to hold a specific value of a specific type
		 * 
		 * In java, there are 8 primitives:
		 * - Whole Numbers: byte, short, char, int, long
		 * - Decimal Numbers: float, double
		 * - Other: boolean
		 * 
		 * EVERYTHING ELSE is a reference variable (holds a 
		 * reference to an object's location in memory)
		 * 
		 * REMEMBER: Java is statically typed
		 */
		
		byte b = 127;                 // 1 byte
		short s = 32767;              // 2 bytes
		char c = 'c';                 // 2 bytes
		int i = 2147483647;           // 4 bytes
		long l = 922337036854775807L; // 8 bytes
		float f = 3.4f;
		double d = 688.77;
		boolean bool = false;
		
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("char: " + c);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("boolean: " + bool + "\n");
		
		/*
		 * Casting: How we can convert from one data type to another
		 * 
		 * Most conversions have to be done explicitly
		 */

		// Note that if casting down (down casting), it won't always work
		long longNum = 94l;
		int dCastedInt = (int) longNum;
		System.out.println("Down Casted Integer: " + dCastedInt);
		
		// Casting up can be done implicitly - but it is always better to be explicit
		long uCastedInt = i;
		System.out.println("Up Casted Integer: " + uCastedInt + "\n");
	}

}
