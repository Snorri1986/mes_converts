/* Main class */
import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Convertor {
    public static void main(String[] args) {
        int grade;
        char grade_system;
        // JFrame preferences
        JFrame frame = new JFrame("Converter");
        frame.setVisible(true);
        frame.setSize(500,400); // optimal size
        // on the center of any screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
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
            case 'f': wt.showFaringeith(grade) ;
                      break;
        }
    }




}


