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
        cf.setPreferredSize(new Dimension(170,50)); // 02.07.2018
        cf.setText("Celcius->Fahrenheit");
        JButton fc = new JButton();
        fc.setPreferredSize(new Dimension(170,50)); // 02.07.2018
        fc.setText("Fahrenheit->Celcius");
        JButton kc = new JButton();
        kc.setPreferredSize(new Dimension(170,50)); // 02.07.2018
        kc.setText("Kelvine->Celcius");          // Kelvine to Celcius

        // new button for AmericanMesserments
        //land_mile->km
        JButton lm_km = new JButton();
        lm_km.setPreferredSize(new Dimension(170,50));
        lm_km.setText("Land_mile->Kilometer");

        //km->land_mile
        JButton km_lm = new JButton();
        km_lm.setPreferredSize(new Dimension(170,50));
        km_lm.setText("Kilometer->LandMile");

        //sea mile -> km
        JButton smile_km = new JButton();
        smile_km.setPreferredSize(new Dimension(170,50));
        smile_km.setText("SeaMile->Kilometer");

        //km -> sea mile
        JButton km_smile = new JButton();
        km_smile.setPreferredSize(new Dimension(170,50));
        km_smile.setText("Kilometer->SeaMile");

        // inch -> sm
        JButton inch_sm = new JButton();
        inch_sm.setPreferredSize(new Dimension(170,50));
        inch_sm.setText("Inch->Santimeter");

        // sm ->inch
        JButton sm_inch = new JButton();
        sm_inch.setPreferredSize(new Dimension(170,50));
        sm_inch.setText("Santimeter->Inch");

        // ft -> meter
        JButton ft_meter = new JButton();
        ft_meter.setPreferredSize(new Dimension(170,50));
        ft_meter.setText("Fut->Meter");

        // meter -> ft
        JButton meter_ft = new JButton();
        meter_ft.setPreferredSize(new Dimension(170,50));
        meter_ft.setText("Meter->Fut");

        // gallon -> litr
        JButton gal_litr = new JButton();
        gal_litr.setPreferredSize(new Dimension(170,50));
        gal_litr.setText("Gallon->Litr");

        // litr -> gallon
        JButton litr_gal = new JButton();
        litr_gal.setPreferredSize(new Dimension(170,50));
        litr_gal.setText("Litr->Gallon");

        // yard -> meter
        JButton yard_meter = new JButton();
        yard_meter.setPreferredSize(new Dimension(170,50));
        yard_meter.setText("Yard->Meter");

        // meter -> yard
        JButton meter_yard = new JButton();
        meter_yard.setPreferredSize(new Dimension(170,50));
        meter_yard.setText("Meter->Yard");


        // add buttons to JPanel
        j_temperaute.add(cf);
        j_temperaute.add(fc);
        j_temperaute.add(kc);
        j_temperaute.add(lm_km);
        j_temperaute.add(km_lm);
        j_temperaute.add(smile_km);
        j_temperaute.add(km_smile);
        j_temperaute.add(inch_sm);
        j_temperaute.add(sm_inch);
        j_temperaute.add(ft_meter);
        j_temperaute.add(meter_ft);
        j_temperaute.add(gal_litr);
        j_temperaute.add(litr_gal);
        j_temperaute.add(yard_meter);
        j_temperaute.add(meter_yard);



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

        // Add new listeners for AmericanMessurments buttons

    }

}


