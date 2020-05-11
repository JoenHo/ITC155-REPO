/**
 * @class: Nums class
 * @author: J.Ho
 * @date: 5/11/2020
 */
public class Nums {

	public static void main(String[] args) {
		// ----------------------------------------------------
		// Test1 : expected output: 1, 2, 3, 4, 5
		// ----------------------------------------------------
		writeNums(5);
		System.out.println(); // to complete the line of output
		// ----------------------------------------------------
		// Test2 : expected output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
		// ----------------------------------------------------		
		writeNums(12);
		System.out.println(); // to complete the line of output
		// ----------------------------------------------------
		// Test3 : expected output: 1
		// ----------------------------------------------------		
		writeNums(1);
		System.out.println(); // to complete the line of output
		// ----------------------------------------------------
		// Test4 : expected output: Invalid Input: -3
		// ----------------------------------------------------		
		writeNums(-3);
		System.out.println(); // to complete the line of output

	}
	
	/**
	 * prints the first n integers starting with 1 in sequential order, separated by commas.
	 * @param n
	 */
	public static void writeNums(int n){

	    if(n < 1){
	        throw new IllegalArgumentException("Invalid Input: " + n);
	    }

	    if(n == 1){
	        System.out.print("1");
	    }
	    else{
	        writeNums(n-1);
	        System.out.print(", " + n);
	    }
	}
}
