import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//==================================================================
//Class: OctagonTest
//Description: OctagonTest class
//By: J.Ho
//Date: 04/20/2020
//==================================================================
class OctagonTest {
	
	@Test
	public void testGetArea() {
		
		// create an Octagon instance
		Octagon oct = new Octagon();

		// ---------------------
		// 1) side = 5.0, expect area = 121
		// ---------------------
		// set side to '5.0';
		oct.setSide(5.0);
		// test
		assertEquals(121, Math.round(oct.getArea()));
		
		// ---------------------
		// 2) side = 10, expect area = 483
		// ---------------------
		// set side to '10';
		oct.setSide(10);
		// test
		assertEquals(483, Math.round(oct.getArea()));
		
		// ---------------------
		// 3) side = 0, expect area = 0
		// ---------------------
		// set side to '0';
		oct.setSide(0);
		// test
		assertEquals(0, Math.round(oct.getArea()));

		// ---------------------
		// 4) side = -3, expect area = 0
		// ---------------------
		// set side to '-3';
		oct.setSide(-3);
		// test
		assertEquals(0, Math.round(oct.getArea()));
		
	}

	@Test
	public void testGetPerimeter() {
		
		// create an Octagon instance
		Octagon oct = new Octagon();
		
		// ---------------------
		// 1) side = 5.0, expect perimeter = 40
		// ---------------------
		// set side to '5.0';
		oct.setSide(5.0);
		// test
		assertEquals(40, Math.round(oct.getPerimeter()));
		
		// ---------------------
		// 2) side = 10, expect perimeter = 80
		// ---------------------
		// set side to '10';
		oct.setSide(10);
		// test
		assertEquals(80, Math.round(oct.getPerimeter()));
		
		// ---------------------
		// 3) side = 0, expect perimeter = 
		// ---------------------
		// set side to '0';
		oct.setSide(0);
		// test
		assertEquals(0, Math.round(oct.getPerimeter()));

		// ---------------------
		// 4) side = -3, expect perimeter = 
		// ---------------------
		// set side to '-3';
		oct.setSide(-3);
		// test
		assertEquals(0, Math.round(oct.getPerimeter()));
		
	}
	
}
