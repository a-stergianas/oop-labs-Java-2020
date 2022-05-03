import org.junit.*;

import java.util.ArrayList;

public class ActorTest {
    public ActorTest() {

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
        Actor actor = new Actor("John", 45);
        Assert.assertEquals("John", actor.getName());
        Assert.assertEquals(45, actor.getAge());
        Actor actor2 = new Actor("Jennifer", 34);
        Assert.assertEquals("Jennifer", actor2.getName());
        Assert.assertEquals(34, actor2.getAge());
        Assert.assertEquals(new ArrayList<Movie>(), actor2.getMovies());

    }

    @Test
    public void addMovieTest() {
        Actor actor = new Actor("Jennifer", 34);
        actor.addMovie("movie1", 150, 2, 45);
        Assert.assertEquals("movie1", actor.getMovies().get(0).getTitle());
        Assert.assertEquals(150, actor.getMovies().get(0).getDuration());
        Assert.assertEquals(2, actor.getMovies().get(0).getOscars());
        Assert.assertEquals(45, actor.getMovies().get(0).getBudget());
        actor.addMovie("movie2", 250, 0, 35);
        Assert.assertEquals("movie2", actor.getMovies().get(1).getTitle());
        Assert.assertEquals(250, actor.getMovies().get(1).getDuration());
        Assert.assertEquals(0, actor.getMovies().get(1).getOscars());
        Assert.assertEquals(35, actor.getMovies().get(1).getBudget());
    }

    @Test
    public void totalActingTest() {
        Actor actor = new Actor("Jennifer", 34);
        actor.addMovie("movie1", 150, 2, 45);
        actor.addMovie("movie2", 30, 2, 45);
        actor.addMovie("movie3", 60, 2, 45);
        actor.addMovie("movie4", 200, 2, 45);
        Assert.assertEquals(350, actor.totalActingTime());
        actor.addMovie("movie5", 61, 2, 45);
        Assert.assertEquals(411, actor.totalActingTime());

    }

    @Test
    public void popularityTest() {
        Actor actor = new Actor("Jennifer", 34);
        actor.addMovie("movie1", 150, 0, 45);
        actor.addMovie("movie2", 30, 2, 45);
        actor.addMovie("movie3", 60, 0, 45);
        actor.addMovie("movie4", 200, 2, 45);
        Assert.assertEquals(2.0,actor.popularity(),0.01);
        actor.addMovie("movie5", 61, 6, 45);
        Assert.assertEquals(1.66,actor.popularity(),0.01);


    }


}
