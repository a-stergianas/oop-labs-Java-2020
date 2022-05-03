import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grigorios Tsoumakas
 */
public class CylinderTest {
    
    public CylinderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getVolume method, of class Cylinder.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Cylinder c = new Cylinder(30, 20);
        double expResult = 56548.67;
        double result = c.getVolume();
        assertEquals(expResult, result, 0.1);
        c = new Cylinder(20, 20);
        expResult = 25132.74;
        result = c.getVolume();
        assertEquals(expResult, result, 0.1);
    }

    
    @Test
    public void testInheritance() {
        boolean expResult = true;
        Cylinder c = new Cylinder(10, 20);
        boolean result = (c instanceof Circle);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getArea method, of class Cylinder.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Cylinder instance = new Cylinder(30, 20);
        double expResult = 9424.78;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.1);
        instance = new Cylinder(20, 20);
        expResult = 5026.548;
        result = instance.getArea();
        assertEquals(expResult, result, 0.1);
    }
    
}
