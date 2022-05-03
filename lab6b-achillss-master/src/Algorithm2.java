/**
 * Η κλάση αναπαριστά έναν αλγόριθμο που κρυπτογραφεί/αποκρυπτογραφεί ένα μήνυμα με πεζούς λατινικούς χαρακτήρες,
 * αντιστρέφοντας τη σειρά των χαρακτήρων, διαχωρίζοντας τους με έναν ειδικό χαρακτήρα (delimiter).
 * Για παράδειγμα, το αποτέλσμα της κρυπογράφησης του μηνύματος “this is a java world” θα ήταν ως εξής:
 * “d-l-r-o-w- -a-v-a-j- -a- -s-i- -s-i-h-t”.
 *
 * Thic class represents a ciphering/ deciphering algorithm of a text message containg lower-case latin letters. It
 * reversed the sequence of the letters and separates them with a special delimiter. For example the result of the
 * message “this is a java world” is “d-l-r-o-w- -a-v-a-j- -a- -s-i- -s-i-h-t”
 */
public class Algorithm2 implements CryptoAlgorithm{

    private char delimiter;

    /**
     * Κατασκευαστής της κλάσης / The constructor
     * @param delimiter Το διαχωριστικό του αλγορίθμου / The delimiter used by  the algorithm
     */
    public Algorithm2(char delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Κρυπτογράφηση ενός μηνύματος κειμένου / Ciphering of a text message
     * @param message Το κείμενο / The text message
     * @return Το κρυπτογραφημένο αποτέλεσμα / The ciphered message
     */
    public String encrypt(String message) {
        String result = "";
        for(int i=message.length()-1; i>=0; i--){
            result = result + message.charAt(i);
            if(i!=0){
                result = result + delimiter;
            }
        }
        return result;
    }

    /**
     * Αποκρυπτογράφηση ενός μηνύματος / Deciphering of a text message
     * @param message Το κρυπτογραφημένο κείμενο / The ciphered message
     * @return Το αποκρυπτογραφημένο κείμενο / The deciphered message
     */

    public String decrypt(String message) {
        String result = "";
        for(int i=message.length()-1; i>=0; i=i-2){
            result = result + message.charAt(i);
        }
        return result;
    }

}
