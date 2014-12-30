package exampleci.objects.components;

import exampleci.objects.components.Engine;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EngineTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param EngineTests name of the test case
     */
    public EngineTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EngineTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPartID()
    {
    	Engine testE = new Engine("12", "XXX-XXXXX-XX", "Generic", 8, 1.2);
		
    	assertEquals("12",testE.GetPartId());
    }
    
    public void testManufacturer()
    {
    	Engine testE = new Engine("12", "XXX-XXXXX-XX", "Generic", 8, 1.2);
		
    	assertEquals("Generic",testE.getManufacturer());
    }
    
    public void testSerial()
    {
    	Engine testE = new Engine("12", "XXX-XXXXX-XX", "Generic", 8, 1.2);
		
    	assertEquals("XXX-XXXXX-XX",testE.getSerialNo());
    }
}

