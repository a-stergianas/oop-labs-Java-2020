import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Αναπτύξτε μια κλάση WordFrequency για την καταμέτρηση του πλήθους εμφάνισης
 * λέξεων σε αρχεία κειμένου. Η κλάση θα πρέπει να έχει μια μέθοδο
 * void calculateFrequency(String), η οποία θα δέχεται ως παράμετρο μια
 * συμβολοσειρά με το μονοπάτι προς κάποιο αρχείο κειμένου και θα υπολογίζει
 * πόσες φορές εμφανίζεται η κάθε διαφορετική λέξη στο αρχείο αυτό. O
 * διαχωρισμός των γραμμών σε λέξεις θα γίνεται με βάση το κενό, ενώ θα πρέπει
 * να αφαιρούνται και τυχόν κόμματα κολλημένα στο τέλος των λέξεων. Δύο λέξεις
 * θα θεωρούνται ίδιες, ανεξάρτητα από το αν είναι γραμμένες με πεζά, κεφαλαία
 * ή ανάμικτα γράμματα. Η κλάση θα πρέπει να έχει επίσης μεθόδους
 * void saveToBinaryFile(String) και void loadFromBinaryFile(String), οι οποίες
 * θα αποθηκεύουν/επαναφέρουν τις υπολογισμένες συχνότητες σε/από ένα δυαδικό
 * αρχείο. Τέλος η κλάση θα περιέχει μια μέθοδο int getFrequency(String),
 * η οποία θα δέχεται μια λέξη, και θα επιστρέφει την συχνότητα της.
 *
 * Develop a WordFrequency class that counts the number of times a word appears in a text file.
 * The class must have a method void calculateFrequency(String), which will have a string parameter
 * with the path of the text file and will compute the frequency of word that appears in this text file.
 * The space will be used as a separator between words, while you should also remove any commas at the end
 * of a word. The class will not be case-sensitive. Thus, a word is identical to another even if it is written
 * in lowercase, uppercase or mixed letters. The class should also have the methods void saveToBinaryFile(String)
 * and void loadFromBinaryFile(String) which will save/retrieve the computed frequencies to/from a binary file.
 * Finally, the class should have a method int getFrequency(String), which given a word will return its frequency.
 */
public class WordFrequency {

    private HashMap<String, Integer> words;
    public WordFrequency() {
        words = new HashMap<>();
    }

    /**
     * @param file αρχείο κειμένου, path to text file
     */
    public void calculateFrequency(String file) {
        String filelowercase = file.toLowerCase();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filelowercase));
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitedLine = line.split("[\\s,]+" );
                for(String word : splitedLine){
                    words.put(word.toLowerCase(),0);
                }
            }
            br.close();
            BufferedReader br2 = new BufferedReader(new FileReader(filelowercase));
            while ((line = br2.readLine()) != null) {
                String[] splitedLine = line.split("[\\s,]+" );
                for(String word : splitedLine){
                    word=word.toLowerCase();
                    if(words.containsKey(word)){
                        words.replace(word,words.get(word),words.get(word)+1);
                    }
                }
            }
            br2.close();
        }
        catch(Exception e) {
            System.out.print("Error");
        }
    }

    public void saveToBinaryFile(String file) {
        calculateFrequency(file);
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Map.Entry word : words.entrySet()) {
                bw.write((String)word.getKey());
                bw.write(" ");
                bw.write((String)word.getValue());
            }
            bw.close();
        }
        catch(Exception e) {
            System.out.print("Error");
        }
    }

    public void loadFromBinaryFile(String file) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitedLine = line.split(" ");
                for (int i = 1; i < splitedLine.length; i=i+2){
                    words.put(splitedLine[i],Integer.valueOf(splitedLine[i+1]));
                }
            }
            br.close();
        }
        catch(Exception e) {
            System.out.print("Error");
        }
    }

    public int getFrequency(String word) {
        int returnValue=0;
        if(words.containsKey(word)){
            returnValue = words.get(word);
        }
        return returnValue;
    }

}
