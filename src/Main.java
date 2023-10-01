import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Rectangle Information Program!");
        System.out.print("Enter the length of the rectangle: ");

        double length = 0;
        if (scanner.hasNextDouble()) {
            length = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid numeric length.");
            scanner.close();
            return;
        }

        System.out.print("Enter the width of the rectangle: ");
        double width = 0;
        if (scanner.hasNextDouble()) {
            width = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid numeric width.");
            scanner.close();
            return;
        }

        if (length <= 0 || width <= 0) {
            System.out.println("Invalid input. Length and width must be positive numbers.");
        } else {
            double area = length * width;
            double perimeter = 2 * (length + width);

            // Calculate the length of the diagonal using the Pythagorean theorem
            double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

            System.out.println("Rectangle Information:");
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Length of Diagonal: " + diagonal);
        }

        scanner.close();
    }
}


