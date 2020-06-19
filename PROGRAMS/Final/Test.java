import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Test {

	//------------------------------
	// StackQueue.equals() test
	//------------------------------
	@org.junit.jupiter.api.Test
	void testEquals() {
		
		Random rnd = new Random();
		Stack<Integer> st1 = new Stack<Integer>();
		Stack<Integer> st2 = new Stack<Integer>();
		
		//---------------------
		// Test for 'True'
		//---------------------
		for(int i = 0; i < 8; i++) {
			 int num = rnd.nextInt(100);
			 st1.add(num);
			 st2.add(num);
		}
		assertEquals(true, StackQueue.equals(st1, st2));
		
		//---------------------
		// Test for 'False' *different size
		//---------------------		
		st1.clear();
		st2.clear();
		st2.add(0);
		for(int i = 0; i < 5; i++) {
			 int num = rnd.nextInt(100);
			 st1.add(num);
			 st2.add(num);
		}
		assertEquals(false, StackQueue.equals(st1, st2));
		
		//---------------------
		// Test for 'False' *different value
		//---------------------		
		st1.clear();
		st2.clear();
		for(int i = 0; i < 5; i++) {
			 int num = rnd.nextInt(100);
			 st1.add(num);
			 st2.add(num + 1);
		}
		assertEquals(false, StackQueue.equals(st1, st2));
		
	}
	
	//------------------------------
	// LinkedIntList.hasTwoConsecutive() test
	//------------------------------
	@org.junit.jupiter.api.Test
	void testHasTwoConsecutive() {
		
		LinkedIntList list = new LinkedIntList();
		
		//---------------------
		// Test for 'False'
		//---------------------			
		for(int i = 0; i < 5; i++) {
			 list.add(i*2);
		}
		assertEquals(false, list.hasTwoConsecutive());

		//---------------------
		// Test for 'True'
		//---------------------			
		for(int i = 0; i < 5; i++) {
			 list.add(i*2);
		}
		list.add(9);
		assertEquals(true, list.hasTwoConsecutive());

	}
	
	//------------------------------
	// IntTree.isFull() test
	//------------------------------
	@org.junit.jupiter.api.Test
	void testisFull() {
		
		IntTree tree1 = new IntTree(8);
		IntTree tree2 = new IntTree(9);
		
		//---------------------
		// Test for 'False'
		//---------------------			
		assertEquals(false, tree1.isFull());

		//---------------------
		// Test for 'True'
		//---------------------			
		assertEquals(true, tree2.isFull());		
	}
}
