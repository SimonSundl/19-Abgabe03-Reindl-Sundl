package at.fhj.iit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Point3dTest {

	/**
	 * Set some Point3d for testing their functionality
	 */

	private Point3d p3D;

	@Before
	public void setup(){

		// SETUP PHASE
		p3D = new Point3d(0, 0, 0);
	}

	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		p3D.setX(5);

		assertEquals(5, p3D.getX(), 0.001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		p3D.setY(2);

		assertEquals(2, p3D.getY(), 0.001);
	}


	/**
	 * Test the Setter of the z-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of z
	 */
	@Test
	public void testSetZ(){
		p3D.setZ(4);

		assertEquals(4, p3D.getZ(), 0.001);
	}

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		p3D.setX(2);
		p3D.setY(2);
		p3D.setZ(2);

		Point3d point = new Point3d(1, 1, 1);
		double value = p3D.distanceFrom(point);

		assertEquals(1.7, value, 0.1);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		p3D.setX(1);
		p3D.setY(1);
		p3D.setZ(2);
		double value = p3D.distanceFromOrigin();

		assertEquals(2.4, value, 0.1);
	}
}