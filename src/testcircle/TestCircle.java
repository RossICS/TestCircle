/*
 * TestCircle.java from Chapter 8
 * A simple application for testing the Circle class.
 */

package testcircle;
 
 /**
 * The Circle class is tested.
 */
 public class TestCircle {

	public static void main(String[] args) {
		Circle spot = new Circle();
                Circle spot2 = new Circle();
                
                spot.setRadius(5);
                spot2.setRadius(3);
		
		System.out.println("Circle radius: " + spot2.getRadius());
		System.out.println("Circle circumference: " + spot2.circumference());
		
	}
}
