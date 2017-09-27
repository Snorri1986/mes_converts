import javax.swing.*;
import java.awt.*;

/**
 * Created by Snorri on 27.09.2017.
 */
public class Forms {
    public static void celc_to_far()
    {
        JFrame frame = new JFrame("Celc<->Fahr");
        frame.setVisible(true);
        frame.setSize(250, 200); // optimal size
        frame.setLocationRelativeTo(null);  // always on the center of screen
        frame.setBackground(Color.WHITE);

        // Add JPanel
        JPanel j_cel_far = new JPanel(new BorderLayout());
        //j_cel_far.setPreferredSize(new Dimension(250,50));
        //j_cel_far.setBackground(Color.GREEN);  // for test reason
        frame.getContentPane().add(j_cel_far);

        // Add JTextField
        JTextField jtf_celc_to_far = new JTextField();
        jtf_celc_to_far.setSize(20,20);
        //frame.getContentPane().add(jtf_celc_to_far);
        j_cel_far.add(jtf_celc_to_far);
    }

    public static void far_to_celc()
    {
        JFrame frame = new JFrame("Fahr<->Celc");
        frame.setVisible(true);
        frame.setSize(250, 200); // optimal size
        frame.setLocationRelativeTo(null);  // always on the center of screen
        frame.setBackground(Color.WHITE);

        // Add JPanel
        JPanel j_far_cel = new JPanel(new BorderLayout());
        //j_far_cel.setPreferredSize(new Dimension(250,50));
        //j_far_cel.setBackground(Color.GREEN);  // for test reason
        frame.getContentPane().add(j_far_cel);

        // Add JTextField
        JTextField jtf_far_to_celc = new JTextField();
        jtf_far_to_celc.setSize(20,20);
        //frame.getContentPane().add(jtf_far_to_celc);
        j_far_cel.add(jtf_far_to_celc);

    }

    public static void kelv_to_celc()
    {
        JFrame frame = new JFrame("Kelv<->Celc");
        frame.setVisible(true);
        frame.setSize(250, 200); // optimal size
        frame.setLocationRelativeTo(null);  // always on the center of screen
        frame.setBackground(Color.WHITE);

        // Add JPanel
        JPanel j_kelv_cel = new JPanel(new BorderLayout());
        //j_kelv_cel.setPreferredSize(new Dimension(250,50));
        //j_kelv_cel.setBackground(Color.GREEN);  // for test reason
        frame.getContentPane().add(j_kelv_cel);

        // Add JTextField
        JTextField jtf_kelv_to_celc = new JTextField();
        jtf_kelv_to_celc.setSize(20,20);
        //frame.getContentPane().add(jtf_kelv_to_celc);
        j_kelv_cel.add(jtf_kelv_to_celc);
    }
}
