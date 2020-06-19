import java.util.*;

/**
 * 5. Write a method called equals that accepts two stacks of integers as
 * parameters and returns true if the two stacks store exactly the same
 * sequence of integer values in the same order. Your method must restore
 * the two stacks to their original state before returning. Use one stack as
 * auxiliary storage.
 * 
 * @author J.Ho
 */
public class StackQueue {

	public static boolean equals(Stack<Integer> st1, Stack<Integer> st2) {
		
		boolean flag = true;
		Stack<Integer> bk = new Stack<Integer>();
		
		// if the stack size is different, return false
		if(st1.size() != st2.size()) {
			flag = false;
			return flag;
		}
		
		// check each member in the two stacks
		while(!st1.empty()) {
			
			// check if the top elements have the same value
			if(st1.peek() == st2.peek()) {
				
				// remove the top elements and store into the backup stack
				st1.pop();
				bk.add(st2.pop());				
			}
			else {
				// put false into flag, break from the loop
				flag = false;
				break;
			}
		}
		
		// restore the two stacks to original state
		while(!bk.empty()) {
			int num = bk.pop();
			st1.add(num);
			st2.add(num);
		}
		
		return flag;
	}
}
