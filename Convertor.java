/* Main class */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;



// test commit
public class Convertor {
    public static void main(String[] args) {
        int grade;
        char grade_system;
        // JFrame preferences
        JFrame frame = new JFrame("Converter");
        frame.setVisible(true);
        frame.setSize(600, 500); // optimal size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 27.03.2017
        frame.setLocationRelativeTo(null);  // always on the center of screen
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);

        // Add JLabel
        // JLabel temp_leb = new JLabel("Temperature convertion");


        // Add JPanel
        JPanel j_temperaute = new JPanel();
        j_temperaute.setPreferredSize(new Dimension(500,200));
        frame.getContentPane().add(j_temperaute);

        // Buttons
        JButton cf = new JButton();
        cf.setPreferredSize(new Dimension(150,50)); // 02.07.2018
        cf.setText("Celcius->Fahrenheit");
        JButton fc = new JButton();
        fc.setPreferredSize(new Dimension(150,50)); // 02.07.2018
        fc.setText("Fahrenheit->Celcius");
        JButton kc = new JButton();
        kc.setPreferredSize(new Dimension(130,50)); // 02.07.2018
        kc.setText("Kelvine->Celcius");          // Kelvine to Celcius

        // add buttons to JPanel
        j_temperaute.add(cf);
        j_temperaute.add(fc);
        j_temperaute.add(kc);
        //j_temperaute.add(temp_leb);


        // Button listeners
        cf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Forms.celc_to_far();
            }
        } );

        fc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Forms.far_to_celc();
            }
        } );

        kc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Forms.kelv_to_celc();
            }
        } );

    }

}


