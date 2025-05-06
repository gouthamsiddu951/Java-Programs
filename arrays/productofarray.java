import java.util.Scanner;
public class productofarray {
    public static void main(String[] args) {
    int product=1;
    Scanner obj = new Scanner(System.in);
    System.out.print("enter n size");
    int n =obj.nextInt();
    int [] arr = new int[n];
    System.out.println("enter "+n+" elements");
    for(int i=0;i<n;i++){
        arr[i]=obj.nextInt();
        product=product*arr[i];
    }
    System.out.println("the product is "+product);
    obj.close();
}
}