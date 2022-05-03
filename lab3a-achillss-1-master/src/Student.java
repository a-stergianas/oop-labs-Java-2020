import java.util.ArrayList;

/**
 * Αυτή η μέθοδος αναπαριστά έναν φοιτητή/τριά. Αποθηκεύει το όνομα, το επίθετο, το ΑΕΜ και λίστα με όλα μάθήματα
 * που έχει περάσει.
 * This class is about a student. It stores his/her name, surname, id and keeps a record of all courses he/she
 * has passed.
 */
public class Student {
    private String name;
    private String surname;
    private int aem;
    private ArrayList<Course> record;

    /**
     * Κατασκευαστής - Constructor
     */
    public Student(String name, String surname, int aem) {
        this.name=name;
        this.surname=surname;
        this.aem=aem;
        this.record=new ArrayList<>();
    }

    /**
     * Αυτή η μέθοδος καλείται όταν ο φοιτητής περνάει ένα μάθημα και προσθέτει αυτό το μάθημα στη λίστα μαθημάτων.
     * This method is called if the student passes a course and adds such a course in his/her record
     */
    public void passedCourse(String name, int semester, int ects) {
        this.record.add(new Course(name,semester,ects));
    }

    /**
     * Αυτή η μέθοδος επιστρέφει τα ECTS των μαθημάτων που ο φοιτητής έχεις περάσει τα χειμερινά εξάμηνα.
     * This method returns the ects of courses that the student has passed in winter semesters.
     */
    public int winterEcts() {
        int sum=0;
        for(Course course: record){
            if(course.isWinter()){
                sum+= course.getEcts();
            }
        }
        return sum;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει τον αριθμό των περασμένων μαθημάτων σε ένα συγκεκριμενο εξάμηνο.
     * This method returns the number of passed courses of a particular semester.
     */
    public int passedCoursesOfSemester(int semester) {
        int sum=0;
        for(Course course: record){
            if(course.getSemester()==semester){
                sum+=1;
            }
        }
        return sum;
    }
}
