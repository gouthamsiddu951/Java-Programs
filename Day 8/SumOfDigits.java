import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int sum = 0;
        int digit;
        do {
            digit = num % 10;
            sum += digit;
            num /= 10;
        } while (num > 0);
        System.out.println("Sum of digits: " + sum);
    }
}