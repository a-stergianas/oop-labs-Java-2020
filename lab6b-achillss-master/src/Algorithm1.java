
import java.util.*;

/**
 * Η κλάση αναπαριστά έναν αλγόριθμο που κρυπτογραφεί/ αποκρυπτογραφεί ένα μήνυμα με πεζούς λατινικούς χαρακτήρες,
 * με τη χρήση λεξιλογίου το οποίο αντιστοιχεί κάθε χαρακτήρα σε έναν 2-ψήφιο κωδικό αριθμό.
 *
 * This class represents a cipher/ decipher algorithm of a message containing lower-case latin letters, with the use of
 * a dictionary it matches a letter with a 2-digit number.
 */
public class Algorithm1 implements CryptoAlgorithm{

    static final private char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
        'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u',
        'v', 'w', 'x', 'y', 'z', ' '};
    static final private int[] numbers = {99, 66, 67, 68, 69, 70, 71,
        72, 73, 74, 75, 76, 77, 78,
        79, 80, 81, 82, 83, 84, 85,
        86, 87, 88, 89, 90, 32};
    private Map<Character, Integer> charToInt;
    private Map<Integer, Character> intToChar;

    /**
     * Ο κατεσκευαστής της κλάσης / The constructor
     */
    public Algorithm1() {
        for(int i=0;i<27;i++){
            this.charToInt.put(letters[i],numbers[i]);
            this.intToChar.put(numbers[i],letters[i]);
        }
    }

    /**
     * Κρυπτογράφηση ενός μηνύματος κειμένου / Ciphering of a text message
     * @param message Το κείμενο / The text message
     * @return Το κρυπτογραφημένο αποτέλεσμα / The ciphered message
     */
    public String encrypt(String message) {
        String result = "";
        for(int i=0;i<message.length();i++){
            result = result + charToInt.get(message.charAt(i));
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
        for(int i=0;i<message.length();i=i+2){
            result = result + intToChar.get(Integer.parseInt(message.substring(i,i+1)));
        }
        return result;
    }
}
