import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (N):");
        int n = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}