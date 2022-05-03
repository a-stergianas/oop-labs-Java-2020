/**
 * Βρείτε τα λάθη που υπάρχουν στον κώδικα προκειμένου να περνάτε με επιτυχία τα tests. Δημιουργήστε
 * test για κάθε μέθοδο μιας κλάσης στο αρχείο CustomTest.
 * Η κλάση Brick αναπαριστά ένα τούβλο.
 * Correct the mistakes found in the code in order to succeed in all tests.
 * Create additional tests for each method in CustomTest file.
 * Brick models a simple brick.
 */
public class Brick {
    // Constant.
    private static final int WEIGHT_PER_CM3 = 2;  // weight per cubic cm in grams - βάρος ανά κυβικό εκατοστό (cm^3) σε γραμμάρια

    private double height;
    private double width;
    private double depth;

    /**
     * Δημιούργησε ένα Brick δίνοντας το μέγεθος πλευρών του σε εκατοστά (cm)
     * Create a Brick given edge lengths in centimeters.
     *
     * @param height The brick's height. To ύψος του τούβλου.
     * @param width  The brick's width. Το πλάτος του τούβλου.
     * @param depth  The brick's depth. Το βάθος του τούβλου.
     */
    public Brick(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    /**
     * @return The surface area of this brick in square centimeters. Το εμβαδό της επιφάνειας του τούβλου σε τετραγωνικά
     * εκατοστά (cm^2)
     */
    public double getSurfaceArea() {
        double side1 = width * height;
        double side2 = width * depth;
        double side3 = depth * height;
        double total = (side1 + side2 + side3) * 2;

        return total;
    }

    /**
     * @return The weight of this brick in kg. Το βάρος του τούβλου σε κιλά.
     */
    public double getWeight() {
        return (getVolume() * WEIGHT_PER_CM3) / 1000;
    }

    /**
     * @return The volume of this brick in cubic centimeters. Ο όγκος του τούβλου σε κυβικά εκατοστά.
     */
    public double getVolume() {
        return width * height * depth;
    }

    /**
     * @return The height of this brick in centimeters. Το ύψος του τούβλου σε εκατοστά.
     */
    public double getHeight() {
        return height;
    }
}
