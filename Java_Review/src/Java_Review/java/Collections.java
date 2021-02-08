package Java_Review.java;
//below is how you import classes from the 'java standard library---------------------
//the '.*' just means import all classes in the package 'util' you can specify 
//packages by typing 'import java.util.ArrayList;'
import java.util.*;

//this is 
public class Collections {
	
	static ArrayList<Integer> arrL;
	ArrayList<String> arrList;
	HashMap<Integer, String> hMap;
	
	//'constructor example: constructors are named after the class and 
	//can be overloaded too.
	Collections(){
		arrL = new ArrayList<Integer>();
		arrList = new ArrayList<String>();
		hMap = new HashMap<Integer, String>();
	}//end of 'constructor'
	
	public ArrayList<Integer> populateArrList(){
		for(int i = 0; i < 10; i++) {
			arrL.add(i);
		}//end of the 'for loop'
		return arrL;
	}//end of 'populateArrayList'
}
