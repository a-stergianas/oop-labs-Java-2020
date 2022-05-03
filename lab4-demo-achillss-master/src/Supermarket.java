import java.util.ArrayList;
import java.util.HashSet;

/**
 * Η κλάση αυτή αποθηκεύει στη μνήμη τις συναλλαγές σε ένα σούπερ μάρκετ.
 * This class saves in memory all the transactions of a supermarket.
 *
 */
public class Supermarket {


    public Supermarket(){
        // fill your code here
    }
   
    /**
     * Αυτή η μέθοδος αποθηκεύει μια συναλλαγή
     * This method saves a transaction
     * 
     * @param t μια συναλλαγή , a transaction
     */
    public void addTransaction(Transaction t) {
        // fill your code here
    }
    
    /**
     * Αυτή η μέθοδος επιστρέφει το πλήθος όλων των πωλήσεων ενός προϊόντος σε 
     * όλες τις αποθηκευμένες συναλλαγές.
     * This method returns the total number of sales of a product from all saved transactions.
     * 
     * @param product ένα προϊόν , a product
     * @return το πλήθος των πωλήσεων του προϊόντος, the total sales number
     */
    public int getTotalSalesOfProduct(String product) {
        // fill your code here
    }
    
    /**
     * Η μέθοδος αυτή επιστρέφει το πλήθος των μοναδικών προϊόντων που έχουν
     * βρεθεί σε συναλλαγές.
     * This method returns the number of unique products that have been found
     * in the transactions.
     * 
     * @return Το πλήθος των μοναδικών προϊόντων, the total number of unique products
     */
    public int uniqueProducts() {
        // fill your code here
    }
    
}
