import java.util.*;

/**
 * 2. Write a method called stutter that accepts a stack of integers as a
 * parameter and replaces every value in the stack with two occurrences of
 * that value. Preserve the original relative order. For example, if the stack
 * stores [3, 7, 1, 14, 9], your method should change it to store 
 * [3, 3,7, 7, 1, 1, 14, 14, 9, 9]. Use a single queue as auxiliary storage.
 * 
 * @author J.Ho
 * 
 */
public class Stutter {

	public static void main(String[] args) {
		//-------------
		// TEST
		//-------------
		Stack<Integer> intStack= new Stack<Integer>();
		intStack.push(3);
		intStack.push(7);
		intStack.push(1);
		intStack.push(14);
		intStack.push(9);
		
		if(stutter(intStack).toString().equals("[3, 3, 7, 7, 1, 1, 14, 14, 9, 9]")) {
			System.out.println("Test OK: " + intStack);
		}else {
			System.out.println("Test NG: " + intStack);
		}

	}
	
	public static Stack<Integer> stutter(Stack<Integer> intStack){
		
		Stack<Integer> backUpStack= new Stack<Integer>();
		
		// store each number twice into bakUpStack  
		while(!intStack.empty()) {
			int bkInt = intStack.pop();
			backUpStack.push(bkInt);
			backUpStack.push(bkInt);
		}
		
		// restore numbers into intStack
		while(!backUpStack.empty()) {
			intStack.push(backUpStack.pop());
		}
		
		return intStack;
	}

}
