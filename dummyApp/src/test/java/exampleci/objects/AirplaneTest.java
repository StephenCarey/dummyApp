package exampleci.objects;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AirplaneTest extends TestCase {
	   /**
     * Create the test case
     *
     * @param EngineTests name of the test case
     */
    public AirplaneTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AirplaneTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testStartEngine()
    {
    	Airplane testA = new Airplane();
		assertFalse(testA.isPlaneRunning());
		testA.startEngine();
    	assertTrue(testA.isPlaneRunning());
    }
	
	
}
