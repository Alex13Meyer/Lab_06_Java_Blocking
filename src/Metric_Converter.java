import java.util.Scanner;
public class Metric_Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    double meters;

    do {
        System.out.println("What is your measurement in meters? ");
        if (in.hasNextDouble()) {
            meters = in.nextDouble();
            break;
        } else {
            System.out.println("Input not valid. Please enter a valid value: ");
            in.next();
        }
    } while (true);
 double miles = meters * 0.001;
 double feet = meters * 3.281;
 double inches = meters * 39.37;

        System.out.println("Meters are equal to: ");
        System.out.println(" miles " + miles);
        System.out.println(" feet " + feet);
        System.out.println(" inches " + inches);
in.close();

    }
}