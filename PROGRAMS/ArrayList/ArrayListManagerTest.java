import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

/**
 * class: ArrayListManagerTest class
 * @author J.Ho
 * Date: 04/28/2020
 */
class ArrayListManagerTest {

	@Test
	void testRemoveEvenLength() {
		
		ArrayListManager arrMgr = new ArrayListManager();
		ArrayList<String> inputList = new ArrayList<String>(), outputList = new ArrayList<String>();
		// input
		inputList.add("ODD");
		inputList.add("EVEN");
		inputList.add("even");
		inputList.add("odd");
		inputList.add("123");
		inputList.add("123456");
		inputList.add("FAIL");
		inputList.add("SUCCESS");
		// expect output
		outputList.add("ODD");
		outputList.add("odd");
		outputList.add("123");
		outputList.add("SUCCESS");
		// test
		assertEquals(outputList.clone(), arrMgr.removeEvenLength(inputList).clone());
	}

	@Test
	void testDoubleList() {

		ArrayListManager arrMgr = new ArrayListManager();
		ArrayList<String> inputList = new ArrayList<String>(), outputList = new ArrayList<String>();
		// input
		inputList.add("How");
		inputList.add("Are");
		inputList.add("You?");
		inputList.add("DOUBLE");
		// expect output
		outputList.add("How");
		outputList.add("How");
		outputList.add("Are");
		outputList.add("Are");
		outputList.add("You?");
		outputList.add("You?");
		outputList.add("DOUBLE");
		outputList.add("DOUBLE");
		// test
		assertEquals(outputList.clone(), arrMgr.doubleList(inputList).clone());
	}

}
