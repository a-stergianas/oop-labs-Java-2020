import java.util.ArrayList;
import java.util.HashSet;

/**
 * Αυτή η κλάση αναπαριστά μια συλλογή μουσικών αλμπουμ ενός καλλιτέχνη.
 * This class represents a collection of music albums of an artist.
 */
public class Artist {
    private String name;
    ArrayList<Album> albums = new ArrayList<>();

    /**
     * Αρχικοποίηση του καλλιτέχνη με ένα όνομα.
     * Initialize artist with a name.
     *
     * @param name Το όνομα του καλλιτέχνη, the name of the artist.
     */
    public Artist(String name) {
        this.name=name;
    }

    /**
     * Η μέθοδος αυτή προσθέτει ένα άλμπουμ στη συλλογή του καλλιτέχνη
     * This method adds an album to the artist's collection.
     *
     * @param a To αλμπουμ, the album
     */
    public void addAlbum(Album a) {
        albums.add(a);
    }

    /**
     * Η μέθοδος αυτή επιστρέφει τον συνολικό αριθμό των μοναδικών κομματιών ενός καλλιτέχνη.
     * This method returns the total number of unique songs of the artist.
     *
     * @return Ο συνολικός αριθμός μοναδικών τραγουδιών, the total number of unique songs.
     */
    public int numberOfSongs() {
        HashSet<String> unique = new HashSet<>();
        for (Album album : albums) {
            String[] songs=album.getSongs();
            for(int i=0;i<songs.length;i++) {
                unique.add(songs[i]);
            }
        }
        return unique.size();
    }


    /**
     * Η μέθοδος αυτή επιστρέφει τον αριθμό των τραγουδιών ενός καλλιτέχνη που έχουν διάρκεια
     * μεγαλύτερη ή ίση με τον δοθέντα αριθμό δευτερολέπτων.
     * This method computes the total number of songs that their duration equals or exceeds in
     * seconds the given one.
     *
     * @param seconds Το κάτω όριο σε δευτερόλεπτα ενός τραγουδιού, the lower limit of a song's duration in seconds.
     * @return Το συνολικό αριθμό τραγουδιών που έχουν διάρκεια μεγαλύτερη η ίση με τα μεταβλητή seconds, the
     * total number of songs that equals or exceeds the given duration.
     */
    public int durationGreater(int seconds) {
        int sum=0;
        for(Album album:albums){
            String[] songs=album.getSongs();
            for(int i=0;i<songs.length;i++) {
                if (album.getDuration(songs[i]) >= seconds) {
                    sum += 1;
                }
            }
        }
        return sum;
    }


}
