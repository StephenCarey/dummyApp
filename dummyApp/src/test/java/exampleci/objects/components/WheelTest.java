package exampleci.objects.components;

import exampleci.objects.components.Engine;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class WheelTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param EngineTests name of the test case
     */
    public WheelTest( String testName )
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
    	Wheel testE = new Wheel(false, 50, 50, 6, "rims", "99-XP");
		
    	assertEquals("99-XP",testE.GetPartId());
    }
    
}

