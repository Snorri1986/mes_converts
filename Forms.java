//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

/**
 * Created by Denys Shabelnyk on 27.09.2017.
 */

/* Remove candidate */

/*public class Forms {

    int val = 0;
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

        // 02.07.2018
        btnCalc_cf.addActionListener(new ActionListener() {
            @Override
            // 04.07.2018
            public void actionPerformed(ActionEvent e) {
                double res = 0.0;
                WeatherTemp wt = new WeatherTemp();
                JFrame res_window = new JFrame("Celsius_to_Fahrenheit");
                res_window.setLocationRelativeTo(null);
                res = wt.showFaringeith(Integer.parseInt(tf_celc_to_far.getText().trim()));
                String lab_res = String.valueOf(res) + " F"; // convert double to string
                JLabel res_test = new JLabel(lab_res);
                res_window.add(res_test);
                res_window.pack();
                res_window.setVisible(true);
                tf_celc_to_far.setText(" ");
            }
            //
        });



        JButton btnCancel_kc = new JButton("Clear");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, btnCancel_kc, 0, SpringLayout.NORTH, btnCalc_cf);
        //sl_kelv_to_celc.putConstraint(SpringLayout.WEST, btnCancel_kc, 0, SpringLayout.WEST);
        fr_celc_to_far.getContentPane().add(btnCancel_kc);

        // 02.07.2018
        btnCancel_kc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf_celc_to_far.setText(" ");
            }
        });
        //

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

        // 02.07.2018
        btnCalc_fc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 04.07.2018
                double res = 0.0;
                WeatherTemp wt = new WeatherTemp();
                JFrame res_window = new JFrame("Fahrenheit_to_Celcius");
                res_window.setLocationRelativeTo(null);
                res = Math.round(wt.showCelcius(Integer.parseInt(tf_far_to_celc.getText().trim())));
                String lab_res = String.valueOf(res) + " C"; // convert double to string
                JLabel res_test = new JLabel(lab_res);
                res_window.add(res_test);
                res_window.pack();
                res_window.setVisible(true);
                tf_far_to_celc.setText(" ");
            }
        });
        //


        JButton btnCancel_kc = new JButton("Clear");
        sl_far_to_celc.putConstraint(SpringLayout.NORTH, btnCancel_kc, 0, SpringLayout.NORTH, btnCalc_fc);
        //sl_kelv_to_celc.putConstraint(SpringLayout.WEST, btnCancel_kc, 0, SpringLayout.WEST);
        fr_far_to_celc.getContentPane().add(btnCancel_kc);

        // 02.07.2018
        btnCancel_kc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf_far_to_celc.setText(" ");
            }
        });
        //

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

        // 04.07.2018
        btnCalc_kc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double res = 0.0;
                WeatherTemp wt = new WeatherTemp();
                JFrame res_window = new JFrame("Kelvin_to_Celcius");
                res_window.setLocationRelativeTo(null);
                res = wt.showCelciusFromKelvin(Integer.parseInt(tf_kelv_to_celc.getText().trim()));
                String lab_res = String.valueOf(res) + " C"; // convert double to string
                JLabel res_test = new JLabel(lab_res);
                res_window.add(res_test);
                res_window.pack();
                res_window.setVisible(true);
                tf_kelv_to_celc.setText(" ");
            }
        });
        //


        JButton btnCancel_kc = new JButton("Clear");
        sl_kelv_to_celc.putConstraint(SpringLayout.NORTH, btnCancel_kc, 0, SpringLayout.NORTH, btnCalc_kc);
        fr_kelv_to_celc.getContentPane().add(btnCancel_kc);

        // 04.07.2018
        btnCancel_kc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf_kelv_to_celc.setText(" ");
            }
        });
        //
    }
}*/
