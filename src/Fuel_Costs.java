import java.util.Scanner;
public class Fuel_Costs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallonsInTank;
        double milesPerGallon;
        double pricePerGallon;

        do {
            System.out.println("How many gallons of gas are in the fuel tank? ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid value. ");
                in.next();
            }
        } while (true);

        do {
            System.out.println("Enter the miles per gallon value: ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid value. ");
                in.next();
            }
        } while (true);
        do {
            System.out.println("Enter the price per gallon of gas: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid value. ");
                in.next();
            }
        } while (true);

        double costEvery100Miles = gallonsInTank * pricePerGallon;
        double distance = gallonsInTank * milesPerGallon;

        System.out.println("Cost per 100 miles: $" + costEvery100Miles);
        System.out.println("The that can be traveled with the gas in the tank: " + distance + "miles");

            in.close();
    }
}


