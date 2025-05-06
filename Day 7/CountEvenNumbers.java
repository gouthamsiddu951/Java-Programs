import java.util.Scanner;

public class CountEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt(); 

        int count = 0;         int i = 1; 
        // Use a while loop to count even numbers between 1 and N
        while (i <= N) {
            if (i % 2 == 0) { 
                count++; 
            }
            i++; 
        }

        System.out.println("The count of even numbers between 1 and " + N + " is: " + count); // Print the count

        scanner.close(); 
    }
}