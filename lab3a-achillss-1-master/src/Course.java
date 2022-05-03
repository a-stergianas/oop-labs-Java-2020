/**
 * Αυτή η κλάση αναπαριστά ένα μάθημα του Τμήματος Πληροφορικής. Τα πεδία που αποθηκεύονται είναι το όνομα του μαθήματος,
 * το εξάημνο που προσφέρεται και ο αριθμός των ECTS.
 * This class represent a course of the csd department. Fields stored are the
 * name of the course, its semester, and its ECTS credits.
 */
public class Course {
    private String name;
    private int semester;
    private int ects;

    /**
     * Κατασκευαστής - Constructor (name, semester, ects)
     */
    public Course(String name, int semester, int ects) {
        this.name=name;
        this.semester=semester;
        this.ects=ects;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει τα ECTS του μαθήματος.
     * This method returns the ECTS credits of the course.
     */
    public int getEcts() {
        return ects;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει το εξάμηνο.
     * This method returns the semester.
     */
    public int getSemester() {
        return semester;
    }

    /**
     * Αυτή η μέθοδος ελέγχει αν το μάθημα είναι χειμερινού εξαμήνου.
     * This methods checks if the course is in the winter semester.
     */
    public boolean isWinter() {
        if (semester%2==0){
            return false;
        }
        return true;
    }

    /**
     * Αυτή η μέθοδος ελέγχει αν το μάθημα είναι εαρινού εξαμήνου.
     * This methods checks if the course is in the spring semester.
     */
    public boolean isSpring() {
        if (semester%2==0){
            return true;
        }
        return false;
    }

    /**
     * Αυτή η μέθοδος ελέγχει αν το μάθημα είναι ένα μάθημα κορμού (εώς το 5ο εξάμηνο).
     * This method checks if the course is a core course (until the 5th semester).
     */
    public boolean isCore() {
        if(semester<=5){
            return true;
        }
        return false;
    }

}
