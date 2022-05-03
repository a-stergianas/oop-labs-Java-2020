/**
 * Αυτή η κλάση αναπαριστά έναν φοιτητή.
 * This class represents a student.
 */
public class Student {


    // Δημιουργήστε έναν κατασκευαστή που θα δέχεται ως όρισμα το ID (ΑΕΜ) και το όνομα του φοιτητή.
    // Create a constructor with two parameters, the student's ID and the student's name.
    private int id;
    private String name;
    public  Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    /**
     * Μέθοδος που επιστρέφει το ID του φοιτητή.
     * This method should return the student's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Μέθοδος που επιστρέφει το όνομα του φοιτητή.
     * This method should return the student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Μέθοδος που αλλάζει το ID του φοιτητή.
     * This method should change the student's ID.
     */
    public void setId(int id) {
        this.id=id;
    }

    /**
     * Μέθοδος που αλλάζει το όνομα του φοιτητή.
     * This method should change the student's name.
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * Αυτή η μέθοδος ελέγχει αν ένας φοιτητής φοιτεί σε μεγαλύτερο έτος δοθέντος το μικρότερο AEM
     * του τρέχοντος έτος.
     * This method returns if the student is an older student given the first (smallest) ID of the
     * current year students.
     */
    public boolean isSenior(int firstID) {
        if(id<=firstID){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Δοθέντος τον αριθμό των εργαστηριακών τμημάτων για ένα μάθημα αυτή η μέθοδος επιστρέφει το
     * εργαστήριο που πρέπει να παρακολουθήσει ο φοιτητής -> (id mod #labs) + 1
     * Given the number of the labs for a course this method returns the lab the student should attend.
     * The formula is: (id mod #labs) + 1
     */
    public int getLab(int labs) {
        return id % labs + 1;
    }
}
