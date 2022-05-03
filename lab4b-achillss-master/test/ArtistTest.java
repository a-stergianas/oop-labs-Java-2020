import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ArtistTest {
    public ArtistTest() {
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
    public void numberOfSongs() {
        System.out.println("numberOfSongs");
        Artist instance = new Artist("Red Hot Chili Peppers");
        Album album = new Album("I'm with you");
        album.addSong("Look Around", 185);
        album.addSong("Even your brutus", 150);
        album.addSong("Dance, Dance, Dance", 215);
        instance.addAlbum(album);
        album = new Album("I'm with you #2");
        album.addSong("Look Around", 185);
        album.addSong("Even your brutus", 190);
        album.addSong("Dance, Dance, Dance, Dance", 315);
        instance.addAlbum(album);
        int expResult = 4;
        int result = instance.numberOfSongs();
        assertEquals(expResult, result);
        album = new Album("I'm with you #3");
        album.addSong("Additional Song #1", 100);
        instance.addAlbum(album);
        expResult = 5;
        result = instance.numberOfSongs();
        assertEquals(expResult, result);
    }

    @Test
    public void durationGreater() {
        System.out.println("numberOfSongs");
        Artist instance = new Artist("Red Hot Chili Peppers");
        Album album = new Album("I'm with you");
        album.addSong("Look Around", 185);
        album.addSong("Even your brutus", 150);
        album.addSong("Dance, Dance, Dance", 215);
        instance.addAlbum(album);
        album = new Album("I'm with you #2");
        album.addSong("Look Around", 185);
        album.addSong("Even your brutus", 190);
        album.addSong("Dance, Dance, Dance, Dance", 315);
        instance.addAlbum(album);
        int expResult = 3;
        int result = instance.durationGreater(190);
        assertEquals(expResult,result);
        expResult = 1;
        result = instance.durationGreater(315);
        assertEquals(expResult,result);
        expResult = 0;
        result = instance.durationGreater(320);
        assertEquals(expResult,result);

    }
}
