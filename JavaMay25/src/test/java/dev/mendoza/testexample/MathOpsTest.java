package dev.mendoza.testexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathOpsTest {

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before class ...");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After class ...");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before...");
	}
	
	@After
	public void tearDown() {
		System.out.println("After...");
	}
	
	@Test
	public void addTest() {
		System.out.println("Running add tests");
		assertEquals(10, MathOps.add(5, 5));
	}

	@Test
	public void minusTest() {
		System.out.println("Running minus tests");
		assertEquals(8, MathOps.minus(10,2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideTest() {
		System.out.println("Running divide tests");
		MathOps.divide(1,0);
	}
}
