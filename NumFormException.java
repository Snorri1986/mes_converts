import javax.swing.*;
/**
 * Created by Denys Shabelnyk on 23.07.2018.
 * My own NumberFormatException Class
 */
public class NumFormException {
    public NumFormException() {
        JFrame err_window = new JFrame("Warning!");
        err_window.setLocationRelativeTo(null);
        String warn_mess = "Only numbers are allowed!";
        JLabel err_lab = new JLabel(warn_mess);
        err_window.add(err_lab);
        err_window.pack();
        err_window.setVisible(true);
    }
 }
