import java.util.HashSet;
import java.util.ArrayList;
/**
 * Η κλάση αναπαριστά αφορά έναν ποδοσφαιριστή
 * This class represents a football player
 *
 * @author 
 */
public class Player {
    private String name;
    private String position;
    private String nationality;
    private HashSet<FootballClub> previous_clubs;
    /* 
    * Αρχικοποίηση του ποδοσφαιριστή δίνοντας το όνομα,την θέση του, και την εθνικότητά του.
    * Initialization of the player with his name, his position, and his nationality
    *
    * @param name Το όνομα του παίκτη, the player's name
    * @param position Η θέση του παίκτη, the player's position
    * @param nationality Η εθνικότητα του παίκτη, the player's nationality
    */
    public Player(String name,String position,String nationality)
    {
        this.name=name;
        this.position=position;
        this.nationality=nationality;
    }

    /* Η μέθοδος αυτή προσθέτει μία ομάδα στην λίστα με τις ομάδες που είχε παίξει στο παρελθόν ο παίκτης
     * This methods adds a football club in the player's list of previous clubs
     *
     * @param club Η ομάδα, the club
     */
    public void addPreviousClub(FootballClub club) {
        previous_clubs.add(club);
    }
    /* H μέθοδος αυτή επιστρέφει το όνομα του παίκτη
     * This method returns the player's name
     */
    public String getName(){
        return name;
    }
    /* H μέθοδος αυτή επιστρέφει την θέση του παίκτη
     * This method returns the player's position
     */
    public String getPosition(){
        return position;
    }
    /* H μέθοδος αυτή επιστρέφει την εθνικότητα του παίκτη
     * This method returns the player's nationality
     */
    public String getNationality(){
        return nationality;
    }

    /* H μέθοδος αυτή επιστρέφει τον αριθμό των διαφορετικών πρωταθλημάτων στα οποία έχει παίξει ο παίκτης
     * This method returns the number of different leagues the player has played in
     */
    public int leaguesPlayed() {
        HashSet<String> unique = new HashSet<>();
        for(FootballClub f:previous_clubs){
                unique.add(f.getLeague());
        }
        return unique.size();
    }

    /* H μέθοδος αυτή επιστρέφει ένα ArrayList με τις ομάδες που έχει παίξει ο παίκτης οι οποίες είναι στο
     * πρωτάθλημα που δίνεται ως μεταβλητή.
     * This method returns an ArrayList with the teams the player has played in that are in the league given
     * as a parameter.
     *
     * @param league Το όνομα του πρωταθλήματος, the leagues name
     */

    public ArrayList<FootballClub> getClubs(String league){
        ArrayList<FootballClub> teams = new ArrayList<>();
        for(FootballClub f:previous_clubs){
            if(f.getLeague() == league){
                teams.add(f);
            }
        }
        return teams;
    }

}
