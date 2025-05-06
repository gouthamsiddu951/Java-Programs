import java.util.Scanner;

public class SimpleCalculator {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        switch (choice) {
            case 1:
                double sum = num1 + num2;
                System.out.println("Result: " + sum);
                break;
            case 2:
                double difference = num1 - num2;
                System.out.println("Result: " + difference);
                break;
            case 3:
                double product = num1 * num2;
                System.out.println("Result: " + product);
                break;
            case 4:
                if (num2 != 0) {
                    double quotient = num1 / num2;
                    System.out.println("Result: " + quotient);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }
    }
}
