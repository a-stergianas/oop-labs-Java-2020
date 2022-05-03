import org.junit.*;

import static org.junit.Assert.assertEquals;

public class AlbumTest {
    public AlbumTest() {
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
    public void getDuration() {
        System.out.println("getDuration");
        String song = "Look Around";
        Album instance = new Album("I'm with you");
        instance.addSong("Look Around", 185);
        instance.addSong("Even your brutus", 150);
        instance.addSong("Dance, Dance, Dance", 215);
        int expResult = 185;
        int result = instance.getDuration(song);
        assertEquals(expResult, result);
        song = "police station";
        expResult = 0;
        result = instance.getDuration(song);
        assertEquals(expResult, result);

    }

    @Test
    public void getSongs() {
        System.out.println("getSongs");
        Album instance = new Album("I'm with you");
        instance.addSong("Look Around", 185);
        instance.addSong("Even your brutus", 150);
        int expresult = 335;
        String[] result = instance.getSongs();
        int sum = 0;
        for (String x : result) {
            sum += instance.getDuration(x);
        }
        assertEquals(expresult, sum);
    }
}
