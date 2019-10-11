package fr.dauphine.clauxaurelien.shapes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestShapes 
    extends TestCase
{
	
	public static void main( String[] args )
	{
		Point p = new Point(4,5);
    	System.out.println(p.getX()+" "+p.getY());
	}
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestShapes( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestShapes.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testShapes()
    {
        assertTrue( true );
    }
}
