package Java_Review.java;

public class PrimitaveTypes {
	
	//8-bit signed twos complement integer
	//range: -128 - 127
	byte exByte = 12;
	
	//short: 16-bit signed twos complement integer
	//range: -32,768 - 32,767
	short exShort = 30000;
	
	//int: 32-bit signed twos complement integer
	//range: -2^31 - (2^31 - 1)
	int exInt = 333;
	
	//long: 64-bit signed twos complement integer
	//range: -2^63 - (2^63 - 1)
	long exLong = 2000000;
	
	//float: 32-bit single precision floating point
	//warning: don`t use for precise values
	float exFloat = 22.31f;
	
	//double: 64-bit double-precision floating point
	//use for precise values like currency values
	double exDouble = 2.2222;
	
	//boolean: either 'true' or 'false'
	//use as condition to lock loops
	boolean exBool = false;
	
	//16-bit unicode character
	//range: '\u0000' - '\uffff' aka 65,535 values inclusively 
	char exChar = 'B';
	
	//---------------------------------------------------------------------
	
	//Using 'getters' to give the values of the instance variables when I call this class as an object in other classes
	
	public byte getByte() {
		return exByte;
	}//end of method 'getByte'
	
	public short getShort() {
		return exShort;
	}//end of method 'getShort'
	
	public int getInt() {
		return exInt;
	}//end of method 'getInt'
	
	public long getLong() {
		return exLong;
	}//end of method 'getLong'
	
	public float getFloat() {
		return exFloat;
	}//end of method 'getFloat'
	
	public double getDouble() {
		return exDouble;
	}//end of method 'getDouble'
	
	public boolean getBool() {
		return exBool;
	}//end of method 'getBool'
	
	public char getChar() {
		return exChar;
	}//end of method 'getChar'
	
	//---------------------------------------------------------------------------
	
	//Using 'setters' to change the values of the instance variables when I call this class as an object in other classes
	
	public byte setByte(byte b) {
		exByte = b;
		return exByte;
	}//end of method 'setByte'
	
	public short setShort(short s) {
		exShort = s;
		return exShort;
	}//end of method 'setShort'
	
	public int setInt(int i) {
		exInt = i;
		return exInt;
	}//end of method 'setInt'
	
	public long setLong(long l) {
		exLong = l;
		return exLong;
	}//end of method 'setLong'
	
	public float setFloat(float f) {
		exFloat = f;
		return exFloat;
	}//end of method 'setFloat'
	
	public double setDouble(double d) {
		exDouble = d;
		return exDouble;
	}//end of method 'setDouble'
	
	public boolean setBool(boolean b) {
		exBool = b;
		return exBool;
	}//end of method 'setBool'
	
	public char setChar(char c) {
		exChar = c;
		return exChar;
	}//end of method 'setChar'
}
