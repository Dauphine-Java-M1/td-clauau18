package td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(PrimeCollectionTest.class);
    }

    
    public void testPrimeCollection()
    {
    	this.test0isPrime();
        this.testTwoIsPrime();
        this.test9IsPrime();
    }
    public void test0isPrime()
    {
    	
        assertTrue(!PrimeCollection.isPrime(0));
    }
    public void testTwoIsPrime()
    {
        assertTrue(PrimeCollection.isPrime(2));
    }
    public void test9IsPrime()
    {
        assertTrue(!PrimeCollection.isPrime(9));
    }
}