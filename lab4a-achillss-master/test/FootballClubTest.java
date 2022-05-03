import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class FootballClubTest {

    public FootballClubTest() {
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
     * Test of getPlayerName method of FootballClub
     */
    @Test
    public void testGetPlayerName(){
        Player player1 = new Player("Dimitar Berbatov","Striker","Bulgarian");
        Player player2 = new Player("Karol Swiderski","Striker","Polish");
        Player player3 = new Player("Jose Crespo","Defender","Spanish");
        FootballClub club1 = new FootballClub("PAOK","Super League Greece");
        club1.addPlayer(10,player1);
        club1.addPlayer(9,player2);
        club1.addPlayer(15,player3);
        String exp_result = "Karol Swiderski";
        String result = club1.getPlayerName(9);
        assertEquals(exp_result, result);
        String exp_result2= "none";
        String result2= club1.getPlayerName(20);
        assertEquals(exp_result2,result2);
    }
    /**
     * Test of getNationalities method of FootballClub
     */
    @Test
    public void testGetNationalities(){
        Player player1 = new Player("Dimitar Berbatov","Striker","Bulgarian");
        Player player2 = new Player("Karol Swiderski","Striker","Polish");
        Player player3 = new Player("Jose Crespo","Defender","Spanish");
        FootballClub club1 = new FootballClub("PAOK","Super League Greece");
        club1.addPlayer(10,player1);
        club1.addPlayer(9,player2);
        club1.addPlayer(15,player3);
        int exp_result = 3;
        int result = club1.getNationalities().length;
        assertEquals(exp_result, result);
        Player player4 = new Player("dummy_player","Defender","Greek");
        club1.addPlayer(100,player4);
        ArrayList<String> exp_result2= new ArrayList<>();
        exp_result2.add("Greek");
        exp_result2.add("Spanish");
        exp_result2.add("Polish");
        exp_result2.add("Bulgarian");
        String [] result2 = club1.getNationalities();
        for(int i =0; i<result2.length;i++){
            assertTrue(exp_result2.contains(result2[i]));
        }

    }
}