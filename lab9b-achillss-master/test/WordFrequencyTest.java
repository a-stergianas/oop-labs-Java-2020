
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
public class WordFrequencyTest {
    
    public WordFrequencyTest() {
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
     * Test of calculateFrequency method, of class WordFrequency.
     */
    @Test
    public void testCalculateFrequency1() {
        System.out.println("calculateFrequency");
        WordFrequency instance;
        int freq;
        instance = new WordFrequency();
        instance.calculateFrequency("text-a.txt");
        freq = instance.getFrequency("the");
        assertEquals(4, freq);
        instance = new WordFrequency();
        instance.calculateFrequency("text-b.txt");
        freq = instance.getFrequency("the");
        assertEquals(3, freq);
    }

    /**
     * Test of calculateFrequency method, of class WordFrequency.
     */
    @Test
    public void testCalculateFrequency2() {
        System.out.println("calculateFrequency");
        WordFrequency instance;
        int freq;
        instance = new WordFrequency();
        instance.calculateFrequency("text-a.txt");
        freq = instance.getFrequency("bigmouth");
        assertEquals(6, freq);
        instance = new WordFrequency();
        instance.calculateFrequency("text-b.txt");
        freq = instance.getFrequency("it");
        assertEquals(14, freq);
        freq = instance.getFrequency("you");
        assertEquals(34, freq);
    }

    /**
     * Test of calculateFrequency method, of class WordFrequency.
     */
    @Test
    public void testCalculateFrequency3() {
        System.out.println("calculateFrequency");
        WordFrequency instance;
        int freq;
        instance = new WordFrequency();
        instance.calculateFrequency("text-a.txt");
        freq = instance.getFrequency("earned");
        assertEquals(0, freq);
        instance = new WordFrequency();
        instance.calculateFrequency("text-b.txt"); 
        freq = instance.getFrequency("bigmouth");
        assertEquals(0, freq);   
    }

    /**
     * Test of calculateFrequency method, of class WordFrequency.
     */
    @Test
    public void testCalculateFrequency4() {
        System.out.println("calculateFrequency");
        WordFrequency instance;
        int freq;
        instance = new WordFrequency();
        instance.calculateFrequency("text-a.txt");
        instance.saveToBinaryFile("temp1.dat");
        instance = new WordFrequency();
        instance.loadFromBinaryFile("temp1.dat");
        freq = instance.getFrequency("the");
        assertEquals(4, freq);
        instance = new WordFrequency();
        instance.calculateFrequency("text-b.txt");
        instance.saveToBinaryFile("temp2.dat");
        instance = new WordFrequency();
        instance.loadFromBinaryFile("temp2.dat");
        freq = instance.getFrequency("the");
        assertEquals(3, freq);
    }


    
    
}
