import java.util.Scanner;
public class CtoF_Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        while (true) {
            System.out.println("What is the temperature in Celsius? ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                break;
            } else {
                System.out.println("Bad Input. Please enter a valid temperature: ");
            }
        }
        fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        if (celsius == 0) {
            System.out.println("The temperature is equal to the freezing point of water! ");
        } else if (celsius == 100) {
            System.out.println("The temperature is equal to the boiling point of water! ");
        }
    in.close();
        }
    }

