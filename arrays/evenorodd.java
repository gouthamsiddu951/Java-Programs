import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        int evencount=0;
        int oddcount=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter n elements");
        int n =obj.nextInt();
        System.out.println("enter "+n+" elemts");
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
             arr[i]=obj.nextInt();
             if(arr[i]%2==0){
                evencount++;
             }
             else{
                oddcount++;
             }
        }
        System.out.println("even "+evencount);
        System.out.println("odd "+oddcount);
        obj.close();
    }
    
}
