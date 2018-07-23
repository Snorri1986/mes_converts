import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Denys Shabelnyk on 11.07.2018.
 */
public class FormShower {

    // JFrame.title, JLabel.text, Object calculation method
    static void showForm(String title,String label, WeatherTemp wt, AmericanMesserments am) {

        AmericanMesserments amer_mess = am;
        WeatherTemp weather = wt;

        //JFrame
        JFrame fr = new JFrame(title);
        fr.setBounds(100, 100, 450, 300);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        SpringLayout sl_celc_to_far = new SpringLayout();
        fr.getContentPane().setLayout(sl_celc_to_far);

        // JTextField
        JTextField tf = new JTextField();
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, tf, 26, SpringLayout.NORTH, fr.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.WEST, tf, 133, SpringLayout.WEST, fr.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.EAST, tf, -144, SpringLayout.EAST, fr.getContentPane());
        fr.getContentPane().add(tf);
        tf.setColumns(10);

        // JLabel
        JLabel lb = new JLabel(label);
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, lb, 3, SpringLayout.NORTH, tf);
        sl_celc_to_far.putConstraint(SpringLayout.EAST, lb, -21, SpringLayout.WEST, tf);
        fr.getContentPane().add(lb);

        // Buttons

        JButton btnCalc_cf = new JButton("Calculate");
        sl_celc_to_far.putConstraint(SpringLayout.WEST, btnCalc_cf, 119, SpringLayout.WEST, fr.getContentPane());
        sl_celc_to_far.putConstraint(SpringLayout.SOUTH, btnCalc_cf, -10, SpringLayout.SOUTH, fr.getContentPane());
        fr.getContentPane().add(btnCalc_cf);

        // 02.07.2018
        btnCalc_cf.addActionListener(new ActionListener() {
            @Override
            // 04.07.2018
            public void actionPerformed(ActionEvent e) {
                /*double res = 0.0;
                Object wt = new mes();
                JFrame res_window = new JFrame("Celsius_to_Fahrenheit");
                res_window.setLocationRelativeTo(null);
                res = wt.showFaringeith(Integer.parseInt(tf_celc_to_far.getText().trim()));
                String lab_res = String.valueOf(res) + " F"; // convert double to string
                JLabel res_test = new JLabel(lab_res);
                res_window.add(res_test);
                res_window.pack();
                res_window.setVisible(true);
                tf_celc_to_far.setText(" ");*/
                //System.out.println("HelloWorld");

                //shared values
                String lab_res;
                JLabel res_test;

                if (am != null) {
                    double res = 0.0;
                    JFrame res_window = new JFrame(title);
                    res_window.setLocationRelativeTo(null);
                    switch(title) {
                        case "LandMile->Kilometer" :
                            try {
                                res = am.landMiletoKm(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " km"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            }catch (NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Kilometer->LandMile" :
                            try {
                                res = am.kmToLandMile(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " miles"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch (NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "SeaMile->Kilometer" :
                            try {
                                res = am.seaMilestoKm(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " km"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch (NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Kilometer->SeaMile" :
                            try {
                                res = am.kmToSeaMiles(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " miles"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch(NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Inch->Santimeter" :
                            try {
                                res = am.inchToSm(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " sm"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch (NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Santimeter->Inch" :
                            try {
                                res = am.smToInch(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " inch"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch(NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Fut->Meter" :
                            try {
                                res = am.ftToMeter(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " meters"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch(NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Meter->Fut" :
                            try {
                                res = am.meterToFt(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " futs"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch(NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Gallon->Litr" :
                            try {
                                res = am.gallToLitr(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " litrs"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch (NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Litr->Gallon" :
                            try {
                                res = am.litrToGall(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " gallons"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch(NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Yard->Meter" :
                            try {
                                res = am.yardToMeter(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " meters"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch (NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Meter->Yard" :
                            try {
                                res = am.meterToYard(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " yards"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch (NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;
                    }
                }
                else if (wt != null) {
                    double res = 0.0;
                    JFrame res_window = new JFrame(title);
                    res_window.setLocationRelativeTo(null);
                    switch(title) {
                        case "Celc<->Fahr" :
                            try {
                                res = wt.showFaringeith(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " F"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch(NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Fahr<->Celc" :
                            try {
                                res = wt.showCelcius(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " C"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch(NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;

                        case "Kelv<->Celc" :
                            try {
                                res = wt.showCelciusFromKelvin(Integer.parseInt(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " C"; // convert double to string
                                res_test = new JLabel(lab_res);
                                res_window.add(res_test);
                                res_window.pack();
                                res_window.setVisible(true);
                                tf.setText(" ");
                            } catch(NumberFormatException ex) {
                                new NumFormException();
                            }
                            break;
                    }

                }
            }
            //
        });



        JButton btnCancel_kc = new JButton("Clear");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, btnCancel_kc, 0, SpringLayout.NORTH, btnCalc_cf);
        //sl_kelv_to_celc.putConstraint(SpringLayout.WEST, btnCancel_kc, 0, SpringLayout.WEST);
        fr.getContentPane().add(btnCancel_kc);

        // 02.07.2018
        btnCancel_kc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(" ");
            }
        });
        //


    }
}
