import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CryptTest {
    public CryptTest(){

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
    public void testHierarchy(){
        Algorithm1 alg1 = new Algorithm1();
        assertTrue(alg1 instanceof CryptoAlgorithm);
        Algorithm2 alg2 = new Algorithm2('-');
        assertTrue(alg2 instanceof CryptoAlgorithm);
    }

    @Test
    public void algorithm1Test(){
        Algorithm1 alg1 = new Algorithm1();
        assertEquals("678368",alg1.encrypt("csd"));
        assertEquals("99858472",alg1.encrypt("auth"));
        assertEquals("java",alg1.decrypt("74998699"));
        assertEquals("void",alg1.decrypt("86797368"));
    }
    @Test
    public void algorithm2Test(){
        Algorithm2 alg2 = new Algorithm2('@');
        assertEquals("d@s@c",alg2.encrypt("csd"));
        assertEquals("h@t@ @u@a",alg2.encrypt("au th"));
        assertEquals("java",alg2.decrypt("a@v@a@j"));
        assertEquals("void",alg2.decrypt("d@i@o@v"));
    }

    @Test
    public void cryptTest(){
        Crypt c1 = new Crypt(new Algorithm1());
        Crypt c2 = new Crypt(new Algorithm2('-'));
        c1.addForEncryption("this is a java world");
        c1.addForEncryption("in java we trust");
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("8472738332738332993274998699328779827668");
        arr1.add("73783274998699328769328482858384");
        assertEquals(arr1,c1.getEncrypted());
        c1.addForDecryption("7879326772699984737871");
        c1.addForDecryption("846983843269866982898472737871");
        arr1 = new ArrayList<>();
        arr1.add("no cheating");
        arr1.add("test everything");
        assertEquals(arr1,c1.getDecrypted());
        c2.addForDecryption("d-l-r-o-w- -a-v-a-j");
        c2.addForDecryption("e-k-a-c- -f-o- -e-c-e-i-p");
        arr1 = new ArrayList<>();
        arr1.add("java world");
        arr1.add("piece of cake");
        assertEquals(arr1,c2.getDecrypted());
        c2.addForEncryption("you shall not pass");
        c2.addForEncryption("inheritance and abstract");
        arr1 = new ArrayList<>();
        arr1.add("s-s-a-p- -t-o-n- -l-l-a-h-s- -u-o-y");
        arr1.add("t-c-a-r-t-s-b-a- -d-n-a- -e-c-n-a-t-i-r-e-h-n-i");
        assertEquals(arr1,c2.getEncrypted());

    }
}
