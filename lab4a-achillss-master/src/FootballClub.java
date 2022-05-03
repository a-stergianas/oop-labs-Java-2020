import java.util.HashMap;
import java.util.Iterator;
/**
 * Η κλάση αυτή αναπαριστά μια ομάδα ποδοσφαίρου
 * This class represents a football club
 *
 * @author
 */
public class FootballClub {
    private String name;
    private String league;
    private HashMap <Integer,Player> current_roster;

    /* Αρχικοποίηση της ομάδας με το όνομα της και το πρωτάθλημα στο οποίο παίζει
    * Initialization of the football club with it's name and the league it plays in
    *
    * @param name Το όνομα της ομάδας, the name of the team
    * @param league Το πρωτάθλημα στο οποίο παίζει η ομάδα, the league the team plays in
    */

    public FootballClub(String name,String league){
        this.name=name;
        this.league=league;
    }

    /* Η μέθοδος αυτή προσθέτει έναν παίκτη στο ρόστερ της ομάδας
     * This method adds a player inside the club's roster
     *
     * @param number ο αριθμός φανέλας του παίκτη, the player's number
     * @param player ο παίκτης, the player
     */

    public void addPlayer(int number,Player player){
        current_roster.put(number,player);
    }
    /* Μέθοδος που επιστρέφει το όνομα της ομάδας
     * Method that returns the club's name
     */
    public String getName(){
        return name;
    }

    /* Μέθοδος που θα επιστρέφει το πρωτάθλημα στο οποίο παίζει η ομάδα
     * Method that returns the league the team plays in
     */
    public String getLeague() {
        return league;
    }

   /* Η μέθοδος αυτή επιστρέφει το όνομα ενός παίκτη δοθέντος τον αριθμό φανέλας του. Αν δεν υπάρχει
    * ο αριθμός φανέλας η μέθοδος αυτή να επιστρέφει "none"
    * This method return a player's name given his number. If there is no such number this method should
    * return "none
    */
   public String getPlayerName(int number){
       if(current_roster.containsKey(number)){
           return current_roster.get(number).getName();
       }
       else {
           return "none";
       }
   }

   /* H μέθοδος αυτή επιστρέφει έναν πίνακα με τις εθνικότητες όλων των παικτών της ομάδας (δεν πειράζει αν
    * υπάρχει στον πίνακα δύο φορές η ίδια εθνικότητα)
    * This method returns an array with the nationalities of all the players in the club (it is ok if the same
    * nationality appears multiple times inside the array)
    */

   public String[] getNationalities(){
       String[] nationalities=new String[current_roster.size()];
       int i =0;
       for (Integer a : current_roster.keySet()){
           nationalities[i] = current_roster.get(a).getNationality();
           i++;
       }
        return nationalities;
    }

}

