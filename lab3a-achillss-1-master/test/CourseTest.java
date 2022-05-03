import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * @author Grigorios Tsoumakas
 */
public class CourseTest {
    private Course instance;

    public CourseTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Course("oop", 3, 8);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of get methods.
     */
    @Test
    public void testGeters() {
        System.out.println("getEcts");
        Course instance = new Course("oop", 3, 8);
        int expResult = 8;
        int result = instance.getEcts();
        assertEquals(expResult, result);

        System.out.println("getSemester");
        Course instance2 = new Course("oop", 3, 8);
        int expResult2 = 3;
        int result2 = instance2.getSemester();
        assertEquals(expResult2, result2);
    }


    /**
     * Test of isWinter method, of class Course.
     */
    @Test
    public void testIsWinter() {
        System.out.println("isWinter");
        Course instance = new Course("oop", 3, 8);
        boolean expResult = true;
        boolean result = instance.isWinter();
        assertEquals(expResult, result);

        Course instance2 = new Course("dss", 6, 5);
        boolean expResult2 = false;
        boolean result2 = instance2.isWinter();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of isSpring method, of class Course.
     */
    @Test
    public void testIsSpring() {
        System.out.println("isSpring");
        Course instance = new Course("oop", 3, 8);
        boolean expResult = false;
        boolean result = instance.isSpring();
        assertEquals(expResult, result);


        Course instance2 = new Course("dss", 6, 5);
        boolean expResult2 = true;
        boolean result2 = instance2.isSpring();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of isCore method, of class Course.
     */
    @Test
    public void testIsCore() {
        System.out.println("isCore");
        Course instance = new Course("oop", 3, 8);
        boolean expResult = true;
        boolean result = instance.isCore();
        assertEquals(expResult, result);
        instance = new Course("wis", 7, 5);
        expResult = false;
        result = instance.isCore();
        assertEquals(expResult, result);

        Course instance2 = new Course("wis", 7, 5);
        boolean expResult2 = false;
        boolean result2 = instance2.isCore();
        assertEquals(expResult2, result2);
    }


}
