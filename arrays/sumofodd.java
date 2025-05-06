import java.util.Scanner;
public class sumofodd {

    public static void main(String[] args) {
        int sumofeven=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the n size");
        int n = obj.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the "+ n +" elements");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sumofeven+=arr[i];
            }
        }
        System.out.println("the sum is "+ sumofeven);
        obj.close();
    }
    }


