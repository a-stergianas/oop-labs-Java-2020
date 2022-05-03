/**
 * Κλάση που αναπαριστά έναν κύκλο
 *
 * Class that represents a circle
 */
public class Circle {

    private double r;
    /**
     * Κατασκευαστής / Constructor
     *
     * @param r η ακτίνα του κύκλου, the circle's radius
     */
    public Circle(double r) {
        this.r=r;
    }

    /**
     * Επιστρέφει το εμβαδό του κύκλου. Το εμβαδό είναι π*r*r, όπου r η ακτίνα
     * του κύκλου. Το π μπορείτε να το πάρετε από την κλάση Math, με Math.PI
     * <p>
     * Returns the total area of the circle. The formula is π*r*r, where r is the radius of the circle. You can get π
     * from the Math class, using Math.PI.
     *
     * @return εμβαδό του κύκλου/ the circle's total area.
     */
    public double getArea() {
        return Math.PI*r*r;
    }

    /**
     * Επιστρέφει την περίμετρο του κύκλου. Η περίμετρος του κύκλου ισούται με
     * 2π*r, όπου r η ακτίνα του κύκλου.
     *
     * Returns the perimeter of the circle. The perimeter of the circle is equal to 2π*r,
     * where r is the circle's radius
     *
     * @return Την περίμετρο του κύκλου, the circle's perimeter.
     */
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    /**
     * Επιστρέφει την ακτίνα του κύκλου / Returns the radius of the circle.
     *
     * @return ακτίνα του κύκλου, the circle's radius.
     */
    public double getRadius() {
        return r;
    }
}
