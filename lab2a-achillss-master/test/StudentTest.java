import org.junit.*;

public class StudentTest {

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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void setAndGet() {
        Student student = new Student(1111, "Nick");
        Assert.assertEquals(1111, student.getId());
        Assert.assertEquals("Nick", student.getName());
        student.setId(2222);
        Assert.assertEquals(2222, student.getId());
        student.setName("james");
        Assert.assertEquals("james", student.getName());
    }

    @Test
    public void testIsSenior() {
        Student student = new Student(1234, "Nick");
        Assert.assertTrue(student.isSenior(1234));
        Assert.assertFalse(student.isSenior(1233));
        student.setId(1500);
        Assert.assertFalse(student.isSenior(1200));
        Assert.assertTrue(student.isSenior(1800));
    }

    @Test
    public void testGetLab() {
        Student student = new Student(1234, "Nick");
        Assert.assertEquals(3, student.getLab(4));
        Assert.assertEquals(2, student.getLab(3));
        student.setId(6768);
        Assert.assertEquals(1, student.getLab(2));
        student.setId(6767);
        Assert.assertEquals(2, student.getLab(2));

    }
}
