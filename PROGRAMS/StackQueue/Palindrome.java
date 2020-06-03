import java.util.*;

/**
 * 8. Write a method called isPalindrome that accepts a queue of integers as
a parameter and returns true if the numbers in the queue are the same in
reverse order. For example, if the queue stores [3, 8, 17, 9, 17, 8,
3], your method should return true because this sequence is the same in
reverse order. If the queue stores [3, 17, 9, 4, 17, 3], your method
would return false because this sequence is not the same in reverse
order (the 9 and 4 in the middle don't match). The empty queue should
be considered a palindrome. Your method must restore the parameter
queue to its original state before returning. Use one stack as auxiliary
storage.
 * 
 * @author J.Ho
 * 
 */
public class Palindrome {

	public static void main(String[] args) {
		//-------------
		// TEST
		//-------------
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// Test 1 -> is palindrome
		queue.add(3);
		queue.add(8);
		queue.add(17);
		queue.add(9);
		queue.add(17);
		queue.add(8);
		queue.add(3);
		
		if(isPalindrome(queue)) {
			System.out.println(queue + " is Palindrome");
		}else {
			System.out.println(queue + " is not Palindrome");
		}
		
		// Test 2 -> is palindrome
		queue.clear();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);

		if(isPalindrome(queue)) {
			System.out.println(queue + " is Palindrome");
		}else {
			System.out.println(queue + " is not Palindrome");
		}
		
		// Test 3 -> is palindrome
		queue.clear();
		
		if(isPalindrome(queue)) {
			System.out.println(queue + " is Palindrome");
		}else {
			System.out.println(queue + " is not Palindrome");
		}
		
		// Test 4 -> is not palindrome
		queue.clear();
		queue.add(7);
		queue.add(5);
		queue.add(3);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(5);
		queue.add(7);

		if(isPalindrome(queue)) {
			System.out.println(queue + " is Palindrome");
		}else {
			System.out.println(queue + " is not Palindrome");
		}

	}
	
	public static boolean isPalindrome(Queue<Integer> intQue) {

		Queue<Integer> queTemp = new LinkedList<Integer>(intQue);
		Stack<Integer> intStk= new Stack<Integer>();
		boolean isOdd = false;
		int queSize = queTemp.size();
		
		// check if queue size is even or odd number
		if(queSize % 2 != 0) {
			isOdd = true;
		}
		
		// remove half of the numbers from queue and push into stack
		for(int i = 0; i < queSize / 2; i++) {
			intStk.push(queTemp.poll());
		}
		
		// if queue size if odd number
		if(isOdd == true) {
			// remove median number from queue
			queTemp.poll();
		}
		
		// compare each number in queue and stack
		while(!queTemp.isEmpty()) {
			int iQue = queTemp.poll();
			int iStk = intStk.pop();
			
			if(iQue != iStk) {
				// not palindrome
				return false;
			}
			
		}			
		
		return true;
	}

}
