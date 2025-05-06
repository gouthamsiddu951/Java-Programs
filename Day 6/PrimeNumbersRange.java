import java.util.Scanner;

public class PrimeNumbersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N to find all prime numbers up to N: ");
        int N = scanner.nextInt();
        
        System.out.println("Prime numbers between 1 and " + N + ":");
        
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
