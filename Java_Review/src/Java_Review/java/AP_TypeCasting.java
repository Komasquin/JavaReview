package Java_Review.java;

//this class extends the 'PrimitiveTypes' class so when you make an object of it in the main 
//method this classes object can call methods from its parent class 'PrimitiveTypes'

public class AP_TypeCasting extends PrimitaveTypes{

	
	//This is an 'up-casting' example
	//up-casting: byte -> short -> int -> long -> float -> double
	//the methods named 'cast()' are an example of 'method overloading: where many methods have the same name but different parameter variables'

	public short castUp(byte s) {
		return (short)s;
	}//end of method 'castUp'
	
	public int castUp(short s) {
		return (int)s;
	}//end of method 'casUpt'
	
	public float castUp(long s) {
		return (float)s;
	}//end of method 'castUp'
	
	public double castUp(float s) {
		return (double)s;
	}//end of method 'castUp'
	
	public double castUp(int s) {
		return (double)s;
	}//end of method 'castUp'-------------------This is important, you can cast though multiple levels of primitive types. Not just one at a time.
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	//This is an 'down-casting' example
	//up-casting: byte <- short <- int <- long <- float <- double
	//the methods named 'cast()' are an example of 'method overloading: where many methods have the same name but different parameter variables'
		
	public byte castDown(short s) {
		return (byte)s;
	}//end of method 'castDown'
		
	public int castDown(long s) {
		return (int)s;
	}//end of method 'castDown'
		
	public long castDown(float s) {
		return (long)s;
	}//end of method 'castDown'
		
	public int castDown(double s) {
		return (int)s;
	}//end of method 'castDown'-------------------This is important, you can cast though multiple levels of primitive types. Not just one at a time.
		
}
