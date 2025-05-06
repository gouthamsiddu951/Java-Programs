import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base:");
        int base = scanner.nextInt();
        System.out.println("Enter exponent:");
        int exponent = scanner.nextInt();
        int result = 1;
        int i = 1;
        do {
            result *= base;
            i++;
        } while (i <= exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}