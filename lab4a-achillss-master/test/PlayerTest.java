import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PlayerTest {

    public PlayerTest() {
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
     * Test of leaguesPlayed method of Player
     */
    @Test
    public void testLeaguesPlayed() {
        FootballClub club1 = new FootballClub("Paok","Super League Greece");
        FootballClub club2 = new FootballClub("Manchester United", "Premier League");
        FootballClub club3 = new FootballClub("Bayern Leverkusen", "Bundesliga");
        Player player1= new Player("Dimitar Berbatov","Striker","Bulgarian");
        player1.addPreviousClub(club1);
        player1.addPreviousClub(club2);
        player1.addPreviousClub(club3);
        int exp_result=3;
        int result=player1.leaguesPlayed();
        assertEquals(exp_result, result);
        FootballClub club4 = new FootballClub("dummy_name", "Bundesliga");
        player1.addPreviousClub(club4);
        int exp_result2=3;
        int result2=player1.leaguesPlayed();
        assertEquals(exp_result2, result2);
    }

    /**
     * Test of setIncrement method, of class Heater.
     */
    @Test
    public void testGetClubs() {
        FootballClub club1 = new FootballClub("Paok","Super League Greece");
        FootballClub club2 = new FootballClub("Manchester United", "Premier League");
        FootballClub club3 = new FootballClub("Bayern Leverkusen", "Bundesliga");
        Player player1= new Player("Dimitar Berbatov","Striker","Bulgarian");
        player1.addPreviousClub(club1);
        player1.addPreviousClub(club2);
        player1.addPreviousClub(club3);
        String exp_result="Bayern Leverkusen";
        ArrayList<FootballClub> clubs=player1.getClubs("Bundesliga");
        String result="";
        for (FootballClub c : clubs){
             result= c.getName();
        }
        assertEquals(exp_result, result);
        FootballClub club4 = new FootballClub("dummy_name", "Bundesliga");
        player1.addPreviousClub(club4);
        int exp_result2=2;
        int result2=player1.getClubs("Bundesliga").size();
        assertEquals(exp_result2, result2);
    }

}