import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Η κλάση αυτή αποθηκεύει τα τραγούδια που υπάρχουν σε ένα μουσικό άλμπουμ. Ενα μουσικό album χαρακτηρίζεται από
 * τον τίτλο, και μία συλλογή τραγουδιών. Η συλλογή τραγουδιών περιλαμβάνει τον τίτλο και τη διάρκεια του τραγουδιού.
 * This class saves the songs of a music album. A music album consists of a title and a collection of songs. Each song
 * in the collection has a title and a duration.
 */

public class Album {
    private String albumTitle;
    HashMap<String,Integer> collection = new HashMap<>();

    /**
     * Αρχικοποίηση αντικειμένου με τον τίτλο του άλμπουμ.
     * Initialize object with the album's title.
     *
     * @param albumTitle
     */
    public Album(String albumTitle) {
        this.albumTitle=albumTitle;
    }

    /**
     * Η μέθοδος αυτή προσθέτει ένα τραγούδι στο άλμπουμ.
     * This method adds a song to the album.
     *
     * @param title    Ο τίτλος του τραγουδιού, the title of the song
     * @param duration Η διάρκεια του τραγουδιού σε δευτερόλεπτα, the duration of the song in seconds
     */
    public void addSong(String title, int duration) {
        collection.put(title,duration);
    }

    /**
     * Επιστρέφει την διάρκεια ενός τραγουδιού δοθέντος του τίτλου.
     * Αν το τραγούδι δεν υπάρχει επιστρέφει 0.
     * Returns the duration of the song given its title, if the song
     * doesn't exist it returns 0.
     *
     * @param title ο τίτλος του τραγουδιού, the title of the song.
     * @return Την διάρκεια του τραγουδιού ή 0, the duration of the song or 0.
     */
    public int getDuration(String title) {
        if(collection.containsKey(title)){
            return collection.get(title);
        }
        else{
            return 0;
        }

    }

    /**
     * Η μέθοδος αυτή επιστρέφει έναν πίνακα με όλους τους τίτλους των τραγουδιών.
     * This method returns a table with all the songs' title.
     *
     * @return Έναν πίνακα με τους τίτλους των τραγουδιών, a table with the songs' title.
     */
    public String[] getSongs() {
        String[] songs = new String[collection.size()];
        Iterator<Map.Entry<String,Integer>> it;
        it = collection.entrySet().iterator();
        int i=0;
        while (it.hasNext()) {
            Map.Entry<String,Integer> e = it.next();
            songs[i] = e.getKey();
            i++;
        }
        return songs;
    }
}
