package dev.mendoza.scopes;


/*
 * When a variable is declared in Java, it is attached to a specific scope
 * within the program. This scope is determined by where the variable resides
 * (where it is declared).
 * 
 * The different variable scopes in Java are:
 * Class (static) scope
 * Instance (object) scope
 * Method scope
 * Block scope
 */
public class VariableScopes {
	/*
	 * Class Scope variables reside in the class definition themselves.
	 * 
	 * This means that when an object updates a class-scoped variable, the change
	 * is reflected across all instances of the class.
	 * 
	 * Class scope is declared with the static keyword.
	 * Methods can also be declared as a class scope.
	 * When we declare a variable as a class scope, we should reference it through
	 * the class (not an instance).
	 * 	- VariableScope.classScope
	 */
	public static String classScope;
	
	/*
	 * Instance Scope means that the variable is attached to an individual object created from the class.
	 * When an instance-scoped variable is modified, it has no effect on the other,
	 * distinct instance of the class.
	 */
	public String instanceScope;
	
	// Static methods are considered class scope
	public static void classScopeMethod() {
		
	}
	
	/*
	 * Method scope - is the scope of a variable declared within a method block (static or instance method)
	 * 
	 * These method scoped variables are only available (visible) with the method they are declared.
	 * They do not exist after the method executes.
	 * 
	 */
	public static void methdodScopeExampleMethod(String methodScopeParameter) {
		// This variable only exists for the duration of this method
		String methodScope = "I am method scope.";
	}
	
	/*
	 * Block Scope - Variables only exist within the specific control flow block
	 * 
	 * for, if/else, while, do-while, switch statements/cases... {}
	 * 
	 * After the block ends, the variables declared within it are no longer available
	 */
	public static void main(String[] args) {
		if(true) {
			String str = "Hello";
		}
		// str does not exist outside of this block
		
	}
}
