/* Main class */
import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Convertor {
    public static void main(String[] args) {
        int grade;
        char grade_system;
        // JFrame preferences
        JFrame frame = new JFrame("Converter");
        frame.setVisible(true);
        frame.setSize(500, 600); // optimal size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 27.03.2017
        frame.setLocationRelativeTo(null);  // always on the center of screen
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);

        // Add JPanel
        JPanel j_temperaute = new JPanel();
        j_temperaute.setPreferredSize(new Dimension(500,200));
        frame.getContentPane().add(j_temperaute);

        WeatherTemp wt = new WeatherTemp();
        System.out.print("Please enter your grade value : ");
        Scanner sc1 = new Scanner(System.in);
        grade = sc1.nextInt();
        System.out.print("Please enter grade system(c-celcius,f-faringeith) : ");
        Scanner sc2 = new Scanner(System.in);
        grade_system = sc2.next().charAt(0);
        switch (grade_system) {
            case 'c':
                wt.showCelcius(grade);
                break;
            case 'f':
                wt.showFaringeith(grade);
                break;
        }
    }




}


