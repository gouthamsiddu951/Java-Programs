import java.util.Scanner;

public class CheckPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else {
            System.out.println("The number " + number + " is not positive.");
        }
        scanner.close();
    }
}