//==================================================================
//Class: Octagon
//Description: Octagon object class
//By: J.Ho
//Date: 04/16/2020
//==================================================================
public class Octagon implements Shape {
	
	double side;		// side length of Octagon
	
	// ****** constructor ******
	public Octagon() {
		
	}

	// ****** getter ******
	public double getSide() {
		return side;
	}

	// ****** setter ******
	public void setSide(double side) {
		this.side = side;
	}

	// ****** methods ******
	public double getArea() {
		
		// side <=0 is invalid number
		if(this.side <= 0) {
			return 0.0;
		}
		
		//Area of Octagon: 2a^2(1+√2) **a=length of one side
		return 2 * (1 + Math.sqrt(2)) * Math.pow(this.side, 2);
		
	}
	public double getPerimeter() {
		
		// side <=0 is invalid number
		if(this.side <= 0) {
			return 0.0;
		}
		
		// Perimeter of Octagon: 8a **a=length of one side
		return 8 * side;
		
	}

}
