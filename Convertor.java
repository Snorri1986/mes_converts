package tempconvertor.consol_version;
import java.util.Scanner;
public class Convertor {
    public static void main(String[] args) {
        int grade; // ���� ������������
        char grade_system; // ���� ������������. � ����� ������� ������������ ������ ��������� grade.
        System.out.print("Please enter your grade value : ");
        Scanner sc1 = new Scanner(System.in);
        grade = sc1.nextInt();
        System.out.print("Please enter grade system(c-celcius,f-faringeith) : ");
        Scanner sc2 = new Scanner(System.in);
        grade_system = sc2.next().charAt(0);
        switch (grade_system) {
            case 'c': System.out.println(getCelcius(grade,grade_system));
                break;
            case 'f': System.out.println(getFaringeith(grade,grade_system));
                break;
        }
    }
    // ����� ������������ �������� � ������� ������� � ���������� �������� � String
    static String getCelcius(int g, char system) {
        double result;
        String answer = new String("Value in Celcius ");
        if (system == 'c') result = (g-32)/1.8000;
        else result = 0;
        return answer + result + " C";
    }
    // ����� ������������ �������� � ������� ���������� � ���������� �������� � String
    static String getFaringeith(int g, char system) {
        double result;
        String answer = new String("Value in Faringeith ");
        if (system == 'f') result = g*1.8000+32.00;
        else result = 0;
        return answer + result + " F";
    }
}


