import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedIntListTest {

	//------------------------------------
	// tests for LinkdIntList.isSorted()
	//------------------------------------
	@Test
	void test1() {		

		// expected result --> true (Sorted)
		LinkedIntList list = new LinkedIntList();
		list.add(-5);
		list.add(-1);
		list.add(0);
		list.add(3);
		list.add(6);
		list.add(10);
		list.add(18);
		assertEquals(true, list.isSorted());
	}

	@Test
	void test2() {		

		// expected result --> false (Unsorted)
		LinkedIntList list = new LinkedIntList();
		list.add(-5);
		list.add(-1);
		list.add(0);
		list.add(3);
		list.add(-8);
		list.add(10);
		list.add(18);
		assertEquals(false, list.isSorted());
	}

}
