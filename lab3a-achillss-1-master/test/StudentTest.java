import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * @author Grigorios Tsoumakas
 */
public class StudentTest {
    Student instance;

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Student("greg", "tsoumakas", 123);
        instance.passedCourse("oop", 3, 8);
        instance.passedCourse("wis", 7, 5);
        instance.passedCourse("dss", 6, 5);
        instance.passedCourse("android", 6, 5);
    }

    @After
    public void tearDown() {
    }


    /**
     * Test of winterEcts method, of class Student.
     */
    @Test
    public void testWinterEcts() {
        System.out.println("winterEcts");
        int expResult = 13;
        int result = instance.winterEcts();
        assertEquals(expResult, result);
    }

    /**
     * Test of passedCoursesOfSemester method, of class Student.
     */
    @Test
    public void testPassedCoursesOfSemester() {
        System.out.println("passedCoursesOfSemester");
        int semester = 6;
        int expResult = 2;
        int result = instance.passedCoursesOfSemester(semester);
        assertEquals(expResult, result);
    }

}
