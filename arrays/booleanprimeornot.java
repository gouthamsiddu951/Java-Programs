import java.util.Scanner;

public class booleanprimeornot {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enetr size of arr:");
        int n = obj.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean isprime=true;
            if(arr[i]<=1){
                isprime=false;
            }else{
                for(int j=2;j<Math.sqrt(arr[i]);j++){
                    if(arr[i]%j==0){
                        isprime=false;
                    }
                }
            }
            if(isprime){
                System.out.println(arr[i]+" is prime");
            }
            else{
                System.out.println(arr[i]+" not prime");
            }
        }
        obj.close();
}
}
