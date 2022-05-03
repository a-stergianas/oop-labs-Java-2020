import java.util.ArrayList;

/**
 * Αυτή η κλάση αναπαριστά έναν/μία ηθοποιό με το όνομα του/της, την ηλικία του/της και την λίστα με τις ταινίες
 * στις οποίες έχει παίξει.
 * This class represents an actor/actress with his/her name, age and list of movies he/she participated.
 */
public class Actor {
    private String name;
    private int age;
    private ArrayList<Movie> movies;

    /**
     * Κατασκευαστής - Constructor
     */
    public Actor(String name, int age) {
        this.name=name;
        this.age=age;
        this.movies=new ArrayList<>();
    }

    /**
     * Αυτή η μέθοδος επιστρέφει το όνομα του ηθοποιού.
     * This method returns the actor's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει την ηλικία του ηθοποιού.
     * This method returns the actor's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Αυτή η μέθοδος προσθέτει μια ταινία στην λίστα ταινιών του ηθοποιού.
     * This methods adds a movie to hir/her lists of movies.
     */
    public void addMovie(String title, int duration, int oscars, int budget) {
        movies.add(new Movie(title,duration,oscars,budget));
    }

    /**
     * Αυτή η μέθοδος επιστρέφει τις ταινίες στις οποίες έχει παίξει ο ηθοποιός.
     * This methods returns the movies the actor has participated.
     */
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    /**
     * Αυτή η μέθοδος υπολογίζει τον χρόνο σε λεπτά που ο/η ηθοποιός έχει παίξει σε ταινίες μεγάλου μήκους (>1 ώρα)
     * This method computes the total play time of the actor in long movies (>1 hour)
     */
    public int totalActingTime() {
        int sum=0;
        for(Movie movie: movies){
            if(movie.getDuration()>60){
                sum+=movie.getDuration();
            }
        }
        return sum;
    }

    /**
     * Αυτή η μέθοδος υπολογίζει την "δημοφιλία" του/της ηθοποιού. Η δημοφιλία υπολογίζεται ως ο συνολικός αριθμός των
     * ταινιών που έχει παίξει προς τον αριθμό των οσκαρικών ταινιών που έχει παίξει.
     * This method computes the "popularity" of the actor. The popularity is the total number of movies he/she
     * participated to the total number of oscar-winning movies he/she participated.
     */
    public double popularity() {
        int totalOscars=0;
        for(Movie movie: movies){
            if(movie.oscarIndex()>0){
                totalOscars+=1;
            }
        }
        return movies.size()/ (double) totalOscars;
    }
}
