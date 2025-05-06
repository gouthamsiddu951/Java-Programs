import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt(); 

        int i = 1; 
        System.out.println("Numbers from 1 to " + N + ":");
        while (i <= N) {
            System.out.print(i + " "); 
            i++; 
        }

        scanner.close(); 
    }
}