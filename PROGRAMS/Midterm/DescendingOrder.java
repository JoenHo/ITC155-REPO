import java.util.Scanner;

/**
 * Midterm Problem 3:
 * Write a void method selectionSortDescendTrace() that takes an integer array, 
 * and sorts the array into descending order. The method should use nested loops 
 * and output the array after each iteration of the outer loop, 
 * thus outputting the array N-1 times (where N is the size). 
 * Complete main() to read in a list of up to 10 positive integers (ending in -1) 
 * and then call the selectionSortDescendTrace() method.
 * 
 * @author J.Ho
 *
 */
public class DescendingOrder {

	public static void selectionSortDescendTrace(int [] numbers, int numElements) {
		int largestIndex, temp;
		for(int i = 0; i < numElements - 1; i++) {
			largestIndex = i;
			
			// find the largest number in the array
			for(int j = i + 1; j < numElements; j++) {
				if(numbers[i] < numbers[j]) {
					largestIndex = j;
				}
			}
			
			// swap
			temp = numbers[i];
			numbers[i] = numbers[largestIndex];
			numbers[largestIndex] = temp;
			
			// print out
			for(int k = 0 ; k < numElements; k++) {
				System.out.print(numbers[k] + " ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int input, i = 0;
		int numElements = 0;
		int [] numbers = new int[10];
		
		System.out.println("Enter Positive Integers (separated by space, -1 to exit): ");
		input = scnr.nextInt();
		while(i < 10 && input != -1) {
			numbers[i] = input;
			i++;
			input = scnr.nextInt();
		}
		numElements = i;
		selectionSortDescendTrace(numbers, numElements);
		
		scnr.close();
	}
}