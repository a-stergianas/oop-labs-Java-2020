
import java.util.ArrayList;
import java.util.List;

/**
 * Η κλάση Crypt, περιλαμβάνει δύο συλλογές συμβολοσειρών, μία προς κρυπτογράφηση και μία προς αποκρυπτογράφηση.
 * Στον κατασκευαστή της κλάσης αυτής θα δίνουμε ένα αντικείμενο αλγορίθμου απο/κρυπτογράφησης.
 *
 * Thic class contains to lists of strings, one list for ciphering and the other for deciphering. The class uses the
 * ciphering algorithm given to the constructor.
 */
public class Crypt{
    private List<String> forEncryption;
    private List<String> forDecryption;
    private CryptoAlgorithm crypto;

    /**
     * Ο κατασκευαστής της κλάσης / The constructor of the class
     * @param crypto Ένας αλγόριθμος κρυπτογράφησης / A ciphering algorithm
     */
    public Crypt(CryptoAlgorithm crypto) {
        this.crypto = crypto;
    }

    /**
     * Προσθήκη συμβολοσειράς προς κρυπτογράφηση / Add of a string for ciphering
     * @param message Η συμβολοσειρά / The string
     */
    public void addForEncryption(String message) {
        this.forEncryption.add(message);
    }

    /**
     * Προσθήκη συμβολοσειράς προς αποκρυπτογράφηση / Add of string for deciphering
     * @param message Η συμβολοσειρά / The string
     */
    public void addForDecryption(String message) {
        this.forDecryption.add(message);
    }

    /**
     * Επιστρέφει κρυπτογραφημένες τις συμβολοσειρές προς κρυπτογράφηση.
     * It returns the ciphered string that was given for ciphering.
     * @return
     */
    public ArrayList<String> getEncrypted() {
        ArrayList<String> result = new ArrayList<>();
        for(String s : forEncryption){
            result.add(crypto.encrypt(s));
        }
        return result;
    }

    /**
     * Επιστρέφει αποκρυπτογραφημένες τις συμβολοσειρές προς αποκρυπτογράφηση.
     * It returns the deciphered strings given for deciphering.
     */
    public ArrayList<String> getDecrypted() {
        ArrayList<String> result = new ArrayList<>();
        for(String s : forDecryption){
            result.add(crypto.decrypt(s));
        }
        return result;
    }
    
    
}
