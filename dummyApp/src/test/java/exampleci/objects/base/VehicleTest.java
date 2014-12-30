package exampleci.objects.base;

import exampleci.objects.base.Vehicle;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class VehicleTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param VehicleTests name of the test case
     */
    public VehicleTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( VehicleTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Vehicle testV = new Vehicle();
    	
    	assertFalse(testV.isEnginRunning());
    	testV.StartVehicle();
        assertTrue( testV.isEnginRunning() );
    }
}
