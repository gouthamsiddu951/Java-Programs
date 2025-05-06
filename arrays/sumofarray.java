import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args) {
    int sum=0;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter n size");
    int n = obj.nextInt();
    int [] arr = new int[n];
    System.out.println("enetr elements of "+n);
    for(int i=0;i<n;i++){
        arr[i]=obj.nextInt();
        sum+=arr[i];
    }
    System.out.println("the sum is "+sum);
    obj.close();
}
}
