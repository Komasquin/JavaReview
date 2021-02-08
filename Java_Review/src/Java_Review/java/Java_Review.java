package Java_Review.java;
public class Java_Review {
	public static void main(String [] args) {
		
		Calculator obj = new Calculator();
		/**
		1) below is a double named 'value' set to equal the method call by 'obj', to the 'add()' method 
		in the 'calculator' class.
		
		2) the 'add()' method takes two double values as parameter variables
		
		3) for the 'parameter variables' we use the same object 'obj' to call the method
		'castUp()' in our 'AP_TypeCalculator' class. this method takes one parameter as an 
		'int' and returns that parameter variable as a 'double'.
		
		4) again we use the object 'obj' in the parameter field for the 'castUp()', we use the object 'obj' 
		to call the method 'setInt()' that returns an 'int' value from the 'PrimitaveTypes' class. 
		
		we are able to call these methods from different classes because of 'inheritance'
		using the 'extends' keyword we are able to access methods in the parent and grandparent 
		classes using only the child class object.
		
		Methods called by the object 'obj'
		---------------------------------
		public double add(double a, double b) from 'Calculator' class
		public double castUp(int s) from 'AP_TypeCasting' class
		public int setInt(int i) from 'PrimitaveTypes' class
		**/
		
		double value = obj.add(obj.castUp(obj.setInt(4)), obj.castUp(obj.setInt(7)));
		
		System.out.println("Output of calculator = " + value);
		
		//------------------------------------------------------------------------------------------------------
		
		//two different objects of the same class
		
		Collections coll = new Collections();
		Collections coll2 = new Collections();
		
		//here I populate the objects with values
		coll.arrList.add("Moss");
		coll.arrList.add("Hoss");
		coll.arrList.add("coss");
		coll.arrList.add("noss");
		
		coll2.arrList.add("Cool");
		coll2.arrList.add("beans");
		coll2.arrList.add("stellar");
		coll2.arrList.add("rightous");
		
		//here I populate one of the objects 'static' ArrayList 'arrL' 
		//this objects name is 'coll'
		//see class for more details
		coll.populateArrList();
		
		//now all the 'ArrayLists' are printed
		System.out.println("ArrayList 1: " + coll.arrList.toString());
		System.out.println("ArrayList 2: " + coll.arrList.toString());
		System.out.println("Static ArrayList for object 1: " + coll.arrL.toString());
		
		//here I print the 'static' 'ArrayList' for the second object
		//notice that changes to one 'static' item affects the other objects static item
		System.out.println("Static ArrayList for object 2: " + coll2.arrL.toString());
		
		//populating the 'HashMap'
		coll.hMap.put(3, "Moss");
		coll.hMap.put(6, "Soooon");
		
		//printing the 'HashMap' values
		System.out.println("The value of the HashMap with key #3: " + coll.hMap.get(3));
		
	}//end of 'main' method
}
