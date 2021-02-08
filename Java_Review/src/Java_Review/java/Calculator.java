package Java_Review.java;
/**
this class 'extends' 'AP_TypeCasting' so when you make an object of
'Calculator' in the 'Main method' it can call methods and variables from its 
parent class 'AP_TypeCasting' and its grandparent 'PrimitiveTypes'
because they 'extend' eachother.

think of it like this: you have your grandparents eyes, and your parents lips
because you 'inherited' the traits
**/
public class Calculator extends AP_TypeCasting {
	/**
	the add method is 'public' and calls to the 'adder' method that is 'private'. 
	that is an example of 'encapsulation' to protect your methods 
	from being modified to perform unwanted behavior. there are 
	also two methods and two other methods with the same name. this 
	is called 'method overloading' and the JVM knows they are different
	based on there parameter variables.
	**/
	/**
	 public access specifier: can be accessed by any package.
	 
	 protected access specifier: can be accessed in the same package or sub-classes packages.
	 
	 default access specifier: can only be accessed in the package it belongs to.
	 
	 private access specifier: can only be accessed in the class they belong to.
	 **/
	public int add(int a, int b) {
		return adder(a,b);
	}//end of method 'add'
	
	private int adder(int a, int b) {
		return a + b;
	}//end of method 'adder'
	
	public double add(double a, double b) {
		return adder(a,b);
	}//end of method 'add'
	
	private double adder(double a, double b) {
		return a + b;
	}//end of method 'add'
	
	//-------------------------------------------------
	
	/**
	the 'sub' method is 'public' and calls to the 'subtract' method. 
	that is an example of 'encapsulation' to protect your methods 
	from being modified to perform unwanted behavior. there are 
	also two methods and two other methods with the same name. this 
	is called 'method overloading' and the JVM knows they are different
	based on there parameter variables.
	**/
	
	public int sub(int a, int b) {
		return subtract(a,b);
	}//end of method 'sub'
	
	private int subtract(int a, int b) {
		return a - b;
	}//end of method 'subtract'
	
	public double sub(double a, double b) {
		return subtract(a,b);
	}//end of method 'sub'
	
	private double subtract(double a, double b) {
		return a + b;
	}//end of method 'subtract'

}//end of class 
