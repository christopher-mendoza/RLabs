package dev.mendoza.generics;

/*
 * We can define our own classes with generic types.
 * 
 * Naming Conventions:
 * Technically, type parameters can be named anything you want.
 * Convention is to use single uppercase letters, to make it obvious
 * that they are not real class names. 
 * 
 * E -> Element
 * K -> Map Key
 * V -> Map Value
 * N -> Number
 * T -> Generic Data Type
 * S, U, V, etc -> For multiple generic types
 */

// We use angle brackets to specify the parameter type
public class GenericClass<T> { // the data of this class' members will be whatever is provided at object instantiation
	private T value;
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T t) {
		this.value = t;
	}
}
