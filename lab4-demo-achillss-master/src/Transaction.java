import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Η κλάση αυτή αφορά μια συναλλαγή ενός πελάτη με ένα supermarket. Με άλλα 
 * λόγια αντιπροσωπεύει το καλάθι με τα προϊόντα που αγόρασε σε μια επίσκεψη. 
 * This class represents a transaction of a super market customer. In other words,
 * the basket with the products of a visit to the supermarket.
 *
 */
public class Transaction {

 
    public Transaction() {
        // συμπληρώστε τον κώδικα
        // fill your code here
    }
    
    /**
     * Η μέθοδος αυτή αντιστοιχεί στο σκανάρισμα ενός προϊόντος και άρα στην 
     * προσθήκη του στην τρέχουσα συναλλαγή ενός πελάτη.
     * This method represents the scanning process in a supermarket. It adds the product
     * to the current transaction.
     * 
     * @param product συμβολοσειρά με το όνομα του προϊόντος, π.χ. γάλα, string containing the name of
     *                the product e.g. milk
     */
    public void scanItem(String product) {
        // συμπληρώστε τον κώδικα
        // fill your code here
    }

    /**
     * Η μέθοδος αυτή αντιστοιχεί στο σκανάρισμα πολλών προϊόντων του ίδιου
     * είδους και προσθήκη τους στην τρέχουσα συναλλαγή ενός πελάτη. 
     *
     * This method represents the scanning of the same product multiple times
     * and adds them to the customers transactions.
     *
     * @param product συμβολοσειρά με το όνομα του προϊόντος, π.χ. γάλα, string containing the name of
     *               the product e.g. milk
     * @param amount ποσότητα προϊόντος, the amount of the products
     */
    public void scanItems(String product, int amount) {
        // συμπληρώστε τον κώδικα
        // fill your code here
    }
    
    /**
     * Η μέθοδος αυτή επιστρέφει τo πλήθος εμφάνισης ενός προϊόντος στο 
     * καλάθι ενός πελάτη. 
     * The number of times a product appears in the basket.
     *
     * @param product συμβολοσειρά με το όνομα του προϊόντος, π.χ. γάλα, string containing the name of
     *               the product e.g. milk
     */
    public int getAmountOfProduct(String product) {
        // συμπληρώστε τον κώδικα
        // fill your code here
    }
    
    /**
     * Η μέθοδος αυτή επιστέφει έναν πίνακα με τα ονόματα των προϊόντων που
     * υπάρχουν στο καλάθι του πελάτη. Αν το ίδιο προϊόν υπάρχει πάνω από μία 
     * φορές στο καλάθι, θα πρέπει στον επιστρεφόμενο πίνακα να εμφανίζεται μία 
     * φορά μόνο.
     *
     * This method returns a table with the names of the products that exist in the basket.
     * The returning table should not contain duplicate items and each product should appear only once.
     * 
     * @return ο πίνακας με τα ονόματα των προϊόντων, the table with the names of the products purchased.
     */
    public String[] getProducts() {
        // συμπληρώστε τον κώδικα
        // fill your code here
    }    
}
