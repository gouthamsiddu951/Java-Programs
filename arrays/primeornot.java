import java.util.Scanner;

    public class primeornot {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the number of elements:");
            int n = obj.nextInt();
            int[] arr = new int[n];
            
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= 1) {
                    System.out.println(arr[i] + " is not prime");
                } else {
                    int count = 0;
                    for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                        if (arr[i] % j == 0) {
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        System.out.println(arr[i] + " is prime");
                    } else {
                        System.out.println(arr[i] + " is not prime");
                    }
                }
            }
            obj.close();
        }
    }
    

