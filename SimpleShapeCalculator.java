import java.util.Scanner;

public class SimpleShapeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Shape Calculator!");

        while (true) {
            System.out.println("\nChoose a shape to calculate its area:");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Rectangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting. Thank you for using the Shape Calculator!");
                break;
            }

            double area = 0.0;
            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter the radius of the circle: ");
                        double radius = scanner.nextDouble();
                        area = Math.PI * radius * radius;
                    }
                    case 2 -> {
                        System.out.print("Enter the base of the triangle: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter the height of the triangle: ");
                        double height = scanner.nextDouble();
                        area = 0.5 * base * height;
                    }
                    case 3 -> {
                        System.out.print("Enter the side of the square: ");
                        double side = scanner.nextDouble();
                        area = side * side;
                    }
                    case 4 -> {
                        System.out.print("Enter the length of the rectangle: ");
                        double length = scanner.nextDouble();
                        System.out.print("Enter the width of the rectangle: ");
                        double width = scanner.nextDouble();
                        area = length * width;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }

                if (choice >= 1 && choice <= 4) {
                    System.out.printf("The area is: %.2f\n", area);
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.nextLine(); // Clear input buffer
            }
        }

        scanner.close();
    }
}
