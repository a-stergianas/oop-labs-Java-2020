import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Δημιουργήστε ένα παράθυρο με 3 κουμπιά, ένα που θα γράφει "3π", ένα "2π",
 * και ένα "1π", καθώς και ένα label που αρχικά θα δείχνει 0. H εφαρμογή σκοπό
 * έχει να μετράει τους πόντους μιας ομάδας μπάσκετ, και να τους ενημερώνει
 * έπειτα από τρίποντο, δίποντο και ελεύθερη βολή (αντίστοιχα με τα 3 κουμπιά).
 *
 * Άρα αν πατηθεί το κουμπί "3π" και μετά το "2π" το label θα πρέπει να δείξει
 * διαδοχικά "3", "5".
 *
 * Create a window with 3 buttons, the first one will be the "3p", the second the "2p" and
 * one more the "1p". Also, create a label that initial will display 0. This application will
 * keep count of the points of a basketball team and will update them after the team scores a three
 * pointer, a two pointer or one point.
 *
 * If the button "3p" is pressed and after that the "2p" button is pressed the label should consecutively
 * display "3" and "5".
 */

public class GUI {

    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private int score;
    private JLabel label;

    public GUI(){
        score = 0;

        frame = new JFrame("Πόντοι μπάσκετ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.add(panel, BorderLayout.CENTER);

        button3 = new JButton("3π");
        button2 = new JButton("2π");
        button1 = new JButton("1π");
        label = new JLabel(String.valueOf(score));

        panel.add(button3);
        panel.add(button2);
        panel.add(button1);
        panel.add(label);
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score+=1;
                label.setText(String.valueOf(score));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score+=2;
                label.setText(String.valueOf(score));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score+=3;
                label.setText(String.valueOf(score));
            }
        });
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }

}
