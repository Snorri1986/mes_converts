/**
 * Created by Denys Shabelnyk on 16.07.2018.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

public class AstronomyMesserments {

    // First space speed depened with Earth
    protected static void showFirstSpaceSpeed() {

        String firstSpeed = "7.91";

        JFrame fr_first_speed = new JFrame("FirstSpaceSpeed");
        fr_first_speed.setBounds(100, 100, 450, 300);
        fr_first_speed.setLocationRelativeTo(null);
        fr_first_speed.setVisible(true);
        SpringLayout sl_celc_to_far = new SpringLayout();
        fr_first_speed.getContentPane().setLayout(sl_celc_to_far);

        // JTextField
        JTextField tf_first_speed = new JTextField();
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, tf_first_speed, 26, SpringLayout.NORTH, fr_first_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.WEST, tf_first_speed, 144, SpringLayout.WEST, fr_first_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.EAST, tf_first_speed, -100, SpringLayout.EAST, fr_first_speed.getContentPane());
        fr_first_speed.getContentPane().add(tf_first_speed);
        tf_first_speed.setText(String.valueOf(firstSpeed) + " km/sec");
        tf_first_speed.setColumns(10);

        // JLabel
        JLabel lb_first_speed = new JLabel("FirstSpaceSpeed(Earth)");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, lb_first_speed, 3, SpringLayout.NORTH, tf_first_speed);
        sl_celc_to_far.putConstraint(SpringLayout.EAST, lb_first_speed, 0, SpringLayout.WEST, tf_first_speed);
        fr_first_speed.getContentPane().add(lb_first_speed);

        // JButton
        JButton btnCalc_firstSpeed = new JButton("Close");
        sl_celc_to_far.putConstraint(SpringLayout.WEST, btnCalc_firstSpeed, 119, SpringLayout.WEST, fr_first_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.SOUTH, btnCalc_firstSpeed, -10, SpringLayout.SOUTH, fr_first_speed.getContentPane());
        fr_first_speed.getContentPane().add(btnCalc_firstSpeed);

        // JButtonListener
        btnCalc_firstSpeed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr_first_speed.dispose();
            }
        });
    }

    // Second space speed depened with Earth
    protected static void showSecondSpaceSpeed() {
        String secondSpeed = "11.2";

        JFrame fr_second_speed = new JFrame("SecondSpaceSpeed");
        fr_second_speed.setBounds(100, 100, 450, 300);
        fr_second_speed.setLocationRelativeTo(null);
        fr_second_speed.setVisible(true);
        SpringLayout sl_celc_to_far = new SpringLayout();
        fr_second_speed.getContentPane().setLayout(sl_celc_to_far);

        // JTextField
        JTextField tf_second_speed = new JTextField();
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, tf_second_speed, 26, SpringLayout.NORTH, fr_second_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.WEST, tf_second_speed, 150, SpringLayout.WEST, fr_second_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.EAST, tf_second_speed, -1, SpringLayout.EAST, fr_second_speed.getContentPane());
        fr_second_speed.getContentPane().add(tf_second_speed);
        tf_second_speed.setText(String.valueOf(secondSpeed) + " km/sec");
        tf_second_speed.setColumns(5);

        // JLabel
        JLabel lb_second_speed = new JLabel("SecondSpaceSpeed(Earth)");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, lb_second_speed, 3, SpringLayout.NORTH, tf_second_speed);
        sl_celc_to_far.putConstraint(SpringLayout.EAST, lb_second_speed, 1, SpringLayout.WEST, tf_second_speed);
        fr_second_speed.getContentPane().add(lb_second_speed);

        // JButton
        JButton btnCalc_secondSpeed = new JButton("Close");
        sl_celc_to_far.putConstraint(SpringLayout.WEST, btnCalc_secondSpeed, 119, SpringLayout.WEST, fr_second_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.SOUTH, btnCalc_secondSpeed, -10, SpringLayout.SOUTH, fr_second_speed.getContentPane());
        fr_second_speed.getContentPane().add(btnCalc_secondSpeed);

        // JButtonListener
        btnCalc_secondSpeed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr_second_speed.dispose();
            }
        });


    }

    // Third space speed depended with Earth
    protected static void showThirdSpaceSpeed() {
        String thirdSpeed = "16.650";

        JFrame th_second_speed = new JFrame("ThirdSpaceSpeed");
        th_second_speed.setBounds(100, 100, 450, 300);
        th_second_speed.setLocationRelativeTo(null);
        th_second_speed.setVisible(true);
        SpringLayout sl_celc_to_far = new SpringLayout();
        th_second_speed.getContentPane().setLayout(sl_celc_to_far);

        // JTextField
        JTextField tf_third_speed = new JTextField();
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, tf_third_speed, 26, SpringLayout.NORTH, th_second_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.WEST, tf_third_speed, 150, SpringLayout.WEST, th_second_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.EAST, tf_third_speed, -1, SpringLayout.EAST, th_second_speed.getContentPane());
        th_second_speed.getContentPane().add(tf_third_speed);
        tf_third_speed.setText(String.valueOf(thirdSpeed) + " km/sec");
        tf_third_speed.setColumns(5);

        // JLabel
        JLabel lb_third_speed = new JLabel("ThirdSpaceSpeed(Earth)");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, lb_third_speed, 3, SpringLayout.NORTH, tf_third_speed);
        sl_celc_to_far.putConstraint(SpringLayout.EAST, lb_third_speed, 1, SpringLayout.WEST, tf_third_speed);
        th_second_speed.getContentPane().add(lb_third_speed);

        // JButton
        JButton btnCalc_thirdSpeed = new JButton("Close");
        sl_celc_to_far.putConstraint(SpringLayout.WEST, btnCalc_thirdSpeed, 119, SpringLayout.WEST, th_second_speed.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.SOUTH, btnCalc_thirdSpeed, -10, SpringLayout.SOUTH, th_second_speed.getContentPane());
        th_second_speed.getContentPane().add(btnCalc_thirdSpeed);

        // JButtonListener
        btnCalc_thirdSpeed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                th_second_speed.dispose();
            }
        });
    }

    //Astronomical unit
    protected static void showAstroUnit() {
        String astroUnit = "1.496*10^8";

        JFrame jf_astro_unit = new JFrame("AstroUnit");
        jf_astro_unit.setBounds(100, 100, 450, 300);
        jf_astro_unit.setLocationRelativeTo(null);
        jf_astro_unit.setVisible(true);
        SpringLayout sl_celc_to_far = new SpringLayout();
        jf_astro_unit.getContentPane().setLayout(sl_celc_to_far);

        // JTextField
        JTextField tf_astro_unit = new JTextField();
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, tf_astro_unit, 26, SpringLayout.NORTH, jf_astro_unit.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.WEST, tf_astro_unit, 150, SpringLayout.WEST, jf_astro_unit.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.EAST, tf_astro_unit, -1, SpringLayout.EAST, jf_astro_unit.getContentPane());
        jf_astro_unit.getContentPane().add(tf_astro_unit);
        tf_astro_unit.setText(String.valueOf(astroUnit) + " km");
        tf_astro_unit.setColumns(5);

        // JLabel
        JLabel lb_astro_unit = new JLabel("OneAstroUnit");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, lb_astro_unit, 3, SpringLayout.NORTH, tf_astro_unit);
        sl_celc_to_far.putConstraint(SpringLayout.EAST, lb_astro_unit, -10, SpringLayout.WEST, tf_astro_unit);
        jf_astro_unit.getContentPane().add(lb_astro_unit);

        // JButton
        JButton btnCalc_astro_unit = new JButton("Close");
        sl_celc_to_far.putConstraint(SpringLayout.WEST, btnCalc_astro_unit, 119, SpringLayout.WEST, jf_astro_unit.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.SOUTH, btnCalc_astro_unit, -10, SpringLayout.SOUTH, jf_astro_unit.getContentPane());
        jf_astro_unit.getContentPane().add(btnCalc_astro_unit);

        // JButtonListener
        btnCalc_astro_unit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf_astro_unit.dispose();
            }
        });

    }
}
