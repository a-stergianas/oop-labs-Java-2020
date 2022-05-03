/**
 * Αυτή η κλάση αναπαριστά μια ταινία. Κάθε ταινία περιέχει έναν τίτλο, διάρκεια σε λεπτά, αριθμό oscars που έχει
 * κερδίσει και το συνολικό ποσό που ξοδεύτηκε από την παραγωγή σε εκκατομύρια.
 * This class represents a movie. Each movie contains a title, its duration in minutes, the number of oscars won and
 * the total amount spent from the production in millions.
 */
public class Movie {
    private String title;
    private int duration;
    private int oscars;
    private int budget;

    /**
     * Κατασκευαστής - Constructor
     */
    public Movie(String title, int duration, int oscars, int budget) {
        this.title=title;
        this.duration=duration;
        this.oscars=oscars;
        this.budget=budget;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει το τίτλο της ταινίας.
     * This method returns the movie's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει την διάρκεια της ταινίας.
     * This movie returns the movie's duration.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει τα oscars που έχει κερδίσει η ταινία.
     * This method returns the total oscars the movie won.
     */
    public int getOscars() {
        return oscars;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει το συνολικό ποσό που ξοδεύτηκε από την παραγωγή.
     * This method returns the total amount spent by the production.
     */
    public int getBudget() {
        return budget;
    }

    /**
     * Αυτή η μέθοδος υπολογίζει τον δείκτη oscars - το συνολικό budget προς τον αριθμό των oscars.
     * This method returns the oscar index - the total budget to the number of oscars won.
     * double value = (double) value
     */
    public double oscarIndex() {
        if(oscars==0){
            return 0;
        }
        else {
            return budget / (double) oscars;
        }
    }
}
