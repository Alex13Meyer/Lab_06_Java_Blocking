import java.util.Scanner;
public class Rectangle_Info {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width;
        double height;

        do {
            System.out.println("What is the width of the rectangle? ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                break;
            } else {
                System.out.println("Input not valid. Please enter valid value: ");
                in.next();
            }
        } while (true);
        do {
            System.out.println("What is the height of the rectangle? ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                break;
            } else {
                System.out.println("Input not valid. Please enter valid value: ");
                in.next();
            }
        } while (true);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Rectangle diagonal length: " + diagonal);


    }
}