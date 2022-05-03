/**
 * Κλάση που αναπαριστά έναν κύλινδρο. Η κλασή θα πρέπει να επεκτείνει την κλάση κύκλος.
 * Class that represents a cylinder. This class should extend the Circle class
 */
public class Cylinder extends Circle {

    private double h;
    /**
     * Κατασκευαστής/ Constructor
     *
     * @param r ακτίνα του κυλίνδρου, the cylinder's radius
     * @param h ύψος του κυλίνδρου, the cylinder's height
     */
    public Cylinder(double r, double h) {
        super(r);
        this.h=h;
    }

    /**
     * Υπολογίζει τον όγκο του κυλίνδρου, ο οποίος ισούται με το εμβαδό μίας
     * εκ των βάσεων του επί το ύψος του.
     * <p>
     * Computes the volume of the cylinder which equals the total area of its base multiplied by its height.
     *
     * @return όγκος του κυλίνδρου, the volume of the cylinder
     */
    public double getVolume() {
        return super.getArea()*h;
    }

    /**
     * Επιστρέφει τo εμβαδό του κυλίνδρου, το οποίο ισούται με το άθροισμα
     * του εμβαδού των δύο βάσεων και του εμβαδού της παράπλευρης επιφάνειας,
     * το οποίο ισούται με την περίμετρο της μίας βάσης επί το ύψος
     * Computes the area of a cylinder, which equals the sum of the area of both bases and
     * the lateral surface area. The lateral surface area equals the perimeter of the base multiplied by the height.
     *
     * @return Το εμδαδό του κυλίνδρου/ The surface area of the cylinder
     */
    public double getArea() {
        return super.getArea()*2+(super.getPerimeter()*h);
    }

}
