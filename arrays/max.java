import java.util.Scanner;
public class max {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = obj.nextInt();
        
        System.out.println("Enter " + n + " numbers:");
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Max element: " + max);
        obj.close(); 
    }

}
