import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
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


        btnCalc_cf.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
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
                                res = am.landMiletoKm(Math.abs(Double.parseDouble(tf.getText().trim())));
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
                                res = am.kmToLandMile(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " miles";
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
                                res = am.seaMilestoKm(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " km";
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
                                res = am.kmToSeaMiles(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " miles";
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
                                res = am.inchToSm(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " sm";
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
                                res = am.smToInch(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " inch";
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
                                res = am.ftToMeter(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " meters";
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
                                res = am.meterToFt(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " futs";
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
                                res = am.gallToLitr(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " litrs";
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
                                res = am.litrToGall(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " gallons";
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
                                res = am.yardToMeter(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " meters";
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
                                res = am.meterToYard(Math.abs(Double.parseDouble(tf.getText().trim())));
                                lab_res = String.valueOf(res) + " yards";
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

                                DecimalFormat sF = new DecimalFormat("##.#");
                                res = wt.showFaringeith(Double.parseDouble(tf.getText().trim()));
                                lab_res = String.valueOf(sF.format(res)).replace(",",".") + " F"; // convert double to string
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
                                res = wt.showCelcius(Double.parseDouble(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " C";
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
                                res = wt.showCelciusFromKelvin(Double.parseDouble(tf.getText().trim()));
                                lab_res = String.valueOf(res) + " C";
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
        });



        JButton btnCancel_kc = new JButton("Clear");
        sl_celc_to_far.putConstraint(SpringLayout.NORTH, btnCancel_kc, 0, SpringLayout.NORTH, btnCalc_cf);
        fr.getContentPane().add(btnCancel_kc);

        btnCancel_kc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(" ");
            }
        });

    }
}
