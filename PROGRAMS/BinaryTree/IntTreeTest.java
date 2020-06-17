import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntTreeTest {

	@Test
	void test1() {
		
		// tree has 6 nodes --> 7 empty branches
		IntTree itree = new IntTree(6);
		assertEquals(7, itree.countEmpty());
	}
	@Test
	void test2() {
		
		// tree has 8 nodes --> 9 empty branches
		IntTree itree = new IntTree(8);
		assertEquals(9, itree.countEmpty());
	}
	@Test
	void test3() {

		// tree has 5 nodes --> 6 empty branches
		IntTree itree = new IntTree(5);
		assertEquals(6, itree.countEmpty());
	}

}
