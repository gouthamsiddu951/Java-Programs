import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter n");
        int n =obj.nextInt();
        System.out.println("enter "+n+" ele");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
for(int i=0;i<arr.length;i++){
System.out.println("before swap "+ arr[i]);
}
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[i]){
            int temp=0;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
for(int i=0;i<arr.length;i++){
    System.out.println("After swap "+ arr[i] );
}
obj.close();
    }
}
