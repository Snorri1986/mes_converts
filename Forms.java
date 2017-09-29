import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

/**
 * Created by Snorri on 27.09.2017.
 */
public class Forms {
    public static void celc_to_far()
    {
        //JFrame
        JFrame fr_celc_to_far = new JFrame("Celc<->Fahr");
        fr_celc_to_far.setBounds(100, 100, 450, 300);
        fr_celc_to_far.setLocationRelativeTo(null);
        fr_celc_to_far.setVisible(true);
        SpringLayout sl_celc_to_far = new SpringLayout();
        fr_celc_to_far.getContentPane().setLayout(sl_celc_to_far);

        // JTextField
        JTextField tf_celc_to_far = new JTextField();
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, tf_celc_to_far, 26, SpringLayout.NORTH, fr_celc_to_far.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.WEST, tf_celc_to_far, 133, SpringLayout.WEST, fr_celc_to_far.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.EAST, tf_celc_to_far, -144, SpringLayout.EAST, fr_celc_to_far.getContentPane());
        fr_celc_to_far.getContentPane().add(tf_celc_to_far);
        tf_celc_to_far.setColumns(10);

        // JLabel
        JLabel lb_celc_to_far = new JLabel("Value in Celcius #");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, lb_celc_to_far, 3, SpringLayout.NORTH, tf_celc_to_far);
        sl_celc_to_far.putConstraint(SpringLayout.EAST, lb_celc_to_far, -21, SpringLayout.WEST, tf_celc_to_far);
        fr_celc_to_far.getContentPane().add(lb_celc_to_far);

        // Buttons

        JButton btnCalc_cf = new JButton("Calculate");
        sl_celc_to_far.putConstraint(SpringLayout.WEST, btnCalc_cf, 119, SpringLayout.WEST, fr_celc_to_far.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.SOUTH, btnCalc_cf, -10, SpringLayout.SOUTH, fr_celc_to_far.getContentPane());
        fr_celc_to_far.getContentPane().add(btnCalc_cf);


        JButton btnCancel_kc = new JButton("Clear");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, btnCancel_kc, 0, SpringLayout.NORTH, btnCalc_cf);
        //sl_kelv_to_celc.putConstraint(SpringLayout.WEST, btnCancel_kc, 0, SpringLayout.WEST);
        fr_celc_to_far.getContentPane().add(btnCancel_kc);

    }

    public static void far_to_celc()
    {
        JFrame fr_far_to_celc = new JFrame("Fahr<->Celc");
        fr_far_to_celc.setBounds(100, 100, 450, 300);
        fr_far_to_celc.setLocationRelativeTo(null);
        fr_far_to_celc.setVisible(true);
        SpringLayout sl_far_to_celc = new SpringLayout();
        fr_far_to_celc.getContentPane().setLayout(sl_far_to_celc);

        // JTextField
        JTextField tf_far_to_celc = new JTextField();
        sl_far_to_celc.putConstraint(SpringLayout.NORTH, tf_far_to_celc, 26, SpringLayout.NORTH, fr_far_to_celc.getContentPane());
        sl_far_to_celc.putConstraint(SpringLayout.WEST, tf_far_to_celc, 133, SpringLayout.WEST, fr_far_to_celc.getContentPane());
        sl_far_to_celc.putConstraint(SpringLayout.EAST, tf_far_to_celc, -144, SpringLayout.EAST, fr_far_to_celc.getContentPane());
        fr_far_to_celc.getContentPane().add(tf_far_to_celc);
        tf_far_to_celc.setColumns(10);

        // JLabel
        JLabel lb_celc_to_far = new JLabel("Value in Fahren. #");
        sl_far_to_celc.putConstraint(SpringLayout.NORTH, lb_celc_to_far, 3, SpringLayout.NORTH, tf_far_to_celc);
        sl_far_to_celc.putConstraint(SpringLayout.EAST, lb_celc_to_far, -21, SpringLayout.WEST, tf_far_to_celc);
        fr_far_to_celc.getContentPane().add(lb_celc_to_far);

        // Buttons

        JButton btnCalc_fc = new JButton("Calculate");
        sl_far_to_celc.putConstraint(SpringLayout.WEST, btnCalc_fc, 119, SpringLayout.WEST, fr_far_to_celc.getContentPane());
        sl_far_to_celc.putConstraint(SpringLayout.SOUTH, btnCalc_fc, -10, SpringLayout.SOUTH, fr_far_to_celc.getContentPane());
        fr_far_to_celc.getContentPane().add(btnCalc_fc);


        JButton btnCancel_kc = new JButton("Clear");
        sl_far_to_celc.putConstraint(SpringLayout.NORTH, btnCancel_kc, 0, SpringLayout.NORTH, btnCalc_fc);
        //sl_kelv_to_celc.putConstraint(SpringLayout.WEST, btnCancel_kc, 0, SpringLayout.WEST);
        fr_far_to_celc.getContentPane().add(btnCancel_kc);

    }

    public static void kelv_to_celc()
    {
        JFrame fr_kelv_to_celc = new JFrame("Kelv<->Celc");
        fr_kelv_to_celc.setBounds(100, 100, 450, 300);
        fr_kelv_to_celc.setLocationRelativeTo(null);
        fr_kelv_to_celc.setVisible(true);
        SpringLayout sl_kelv_to_celc = new SpringLayout();
        fr_kelv_to_celc.getContentPane().setLayout(sl_kelv_to_celc);

        // JTextField
        JTextField tf_kelv_to_celc = new JTextField();
        sl_kelv_to_celc.putConstraint(SpringLayout.NORTH, tf_kelv_to_celc, 26, SpringLayout.NORTH, fr_kelv_to_celc.getContentPane());
        sl_kelv_to_celc.putConstraint(SpringLayout.WEST, tf_kelv_to_celc, 133, SpringLayout.WEST, fr_kelv_to_celc.getContentPane());
        sl_kelv_to_celc.putConstraint(SpringLayout.EAST, tf_kelv_to_celc, -144, SpringLayout.EAST, fr_kelv_to_celc.getContentPane());
        fr_kelv_to_celc.getContentPane().add(tf_kelv_to_celc);
        tf_kelv_to_celc.setColumns(10);

        // JLabel
        JLabel lb_celc_to_far = new JLabel("Value in Kelvin #");
        sl_kelv_to_celc.putConstraint(SpringLayout.NORTH, lb_celc_to_far, 3, SpringLayout.NORTH, tf_kelv_to_celc);
        sl_kelv_to_celc.putConstraint(SpringLayout.EAST, lb_celc_to_far, -21, SpringLayout.WEST, tf_kelv_to_celc);
        fr_kelv_to_celc.getContentPane().add(lb_celc_to_far);

        // Buttons

        JButton btnCalc_kc = new JButton("Calculate");
        sl_kelv_to_celc.putConstraint(SpringLayout.WEST, btnCalc_kc, 119, SpringLayout.WEST, fr_kelv_to_celc.getContentPane());
        sl_kelv_to_celc.putConstraint(SpringLayout.SOUTH, btnCalc_kc, -10, SpringLayout.SOUTH, fr_kelv_to_celc.getContentPane());
        fr_kelv_to_celc.getContentPane().add(btnCalc_kc);


        JButton btnCancel_kc = new JButton("Clear");
        sl_kelv_to_celc.putConstraint(SpringLayout.NORTH, btnCancel_kc, 0, SpringLayout.NORTH, btnCalc_kc);
        //sl_kelv_to_celc.putConstraint(SpringLayout.WEST, btnCancel_kc, 0, SpringLayout.WEST);
        fr_kelv_to_celc.getContentPane().add(btnCancel_kc);
    }
}
