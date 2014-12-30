package exampleci.objects.components;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import exampleci.objects.components.Exhaust;

public class ExhaustTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param EngineTests name of the test case
     */
    public ExhaustTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ExhaustTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPartID()
    {
    	Exhaust testE = new Exhaust();
    	assertEquals("01",testE.GetPartId());
    }
    
    public void testEmmissions()
    {
    	Exhaust testE = new Exhaust();
    	assertEquals("low",testE.GetEmmissionType());
    }
}
