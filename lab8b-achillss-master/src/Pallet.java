
/**
 * Βρείτε τα λάθη που υπάρχουν στον κώδικα προκειμένου να περνάτε με επιτυχία τα tests.  Δημιουργήστε
 * test για κάθε μέθοδο μιας κλάσης στο αρχείο CustomTest.
 * Μιά παλέτα (Pallet) είναι ένας σωρός από τούβλα πάνω σε μια ξύλινη βάση.
 * Correct the mistakes found in the code in order to succeed in all tests. Create additional tests for each method
 * in CustomTest file.
 * A pallet is a stack of bricks on a wooden base.
 *
 */
public class Pallet {
    private static final double BASE_WEIGHT = 6.5;  // in kg
    private static final double BASE_HEIGHT = 15;  // in cm

    private Brick aBrick;
    private int bricksInPlane;
    private int height;

    /**
     * Create a pallet with a given number of bricks. Δημιούργησε μια παλλέτα δίνοντας τον αριθμό των τούβλων.
     *
     * @param bricksInPlane The number of bricks in each level on the base. Ο αριθμός των τούβλων στην βάση.
     * @param height        The number of bricks stacked on top of each other. Ο αριθμός των τούβλων που στιβάζονται το ένα
     *                      πάνω στο άλλο
     * @param brick         One of the bricks on the pallet. Ένα τούβλο της παλέτας.
     */
    public Pallet(int bricksInPlane, int height, Brick brick) {
        this.bricksInPlane = bricksInPlane;
        this.height = height;
        aBrick = brick;
    }

    /**
     * @return The weight of the pallet (in kg). Το βάρος της παλέτας (in kg).
     */
    public double getWeight() {
        int numberOfBricks = bricksInPlane * height;
        return aBrick.getWeight() * numberOfBricks + BASE_WEIGHT;
    }

    /**
     * @return The height of the pallet (in cm) / Το ύψος της παλέτας (σε cm)
     */
    public double getHeight() {
        return (aBrick.getHeight() * height) + BASE_HEIGHT;
    }
}
