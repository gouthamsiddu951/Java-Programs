import java.util.Scanner;

public class LargestDigitFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); 

        int largestDigit = 0; 
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10; 
        }

        System.out.println("The largest digit is: " + largestDigit); 

        scanner.close();
    }
}