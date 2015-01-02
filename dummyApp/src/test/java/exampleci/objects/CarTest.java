package exampleci.objects;

import exampleci.objects.components.Engine;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CarTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param EngineTests name of the test case
     */
    public CarTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CarTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testStartEngine()
    {
    	Car testC = new Car();
		assertFalse(testC.isCarRunning());
		testC.startCar();
    	assertTrue(testC.isCarRunning());
    }
}

