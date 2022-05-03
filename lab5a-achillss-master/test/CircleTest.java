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
public class CircleTest {
    
    public CircleTest() {
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
     * Test of getArea method, of class Circle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Circle instance = new Circle(30);
        double expResult = 2827.433;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.1);
        instance = new Circle(20);
        expResult = 1256.637;
        result = instance.getArea();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of getPerimeter method, of class Circle.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        Circle instance = new Circle(30);
        double expResult = 188.4956;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.1);
        instance = new Circle(20);
        expResult = 125.6637;
        result = instance.getPerimeter();
        assertEquals(expResult, result, 0.1);
    }

    
}
