import org.junit.*;

public class MovieTest {

    public MovieTest() {
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
    public void getTests() {
        Movie movie1 = new Movie("movie1", 150, 1, 24);
        Assert.assertEquals("movie1", movie1.getTitle());
        Assert.assertEquals(150, movie1.getDuration());
        Assert.assertEquals(1, movie1.getOscars());
        Assert.assertEquals(24, movie1.getBudget());
        Movie movie2 = new Movie("lordoftherings", 210, 4, 50);
        Assert.assertEquals("lordoftherings", movie2.getTitle());
        Assert.assertEquals(210, movie2.getDuration());
        Assert.assertEquals(4, movie2.getOscars());
        Assert.assertEquals(50, movie2.getBudget());
    }

    @Test
    public void oscarIndexTest() {
        Movie movie1 = new Movie("movie1", 32, 2, 24);
        Assert.assertEquals(12, movie1.oscarIndex(), 0.01);
        Movie movie2 = new Movie("movie2", 32, 5, 24);
        Assert.assertEquals(4.8, movie2.oscarIndex(), 0.01);
        Movie movie3 = new Movie("movie2", 32, 0, 2);
        Assert.assertEquals(0.0, movie3.oscarIndex(), 0.01);


    }
}