package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Point2dTest {

	/**
	 * Set some Point2d for testing their functionality
	 */

	private Point2d p2D;

	@Before
	public void setup(){

		// SETUP PHASE
		p2D = new Point2d(0, 0);
	}

	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		p2D.setX(5);

		assertEquals(5, p2D.getX(), 0.001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		p2D.setY(6);

		assertEquals(6, p2D.getY(), 0.001);
	}


	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		p2D.setX(2);
		p2D.setY(2);

		Point2d point = new Point2d(1, 1);
		double value = p2D.distanceFrom(point);

		assertEquals(1.4142, value, 0.01);

	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		p2D.setX(1);
		p2D.setY(1);
		double value = p2D.distanceFromOrigin();

		assertEquals(1.4, value, 0.1);
	}
}
