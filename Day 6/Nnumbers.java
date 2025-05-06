import java.util.Scanner;

public class Nnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
