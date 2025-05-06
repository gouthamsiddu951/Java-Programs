import java.util.Scanner;
public class findelement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter n elements");
        int n = obj.nextInt();
        System.out.println("enetr"+n+"elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("find existing ele");
        int searchelement=obj.nextInt();
        boolean exist=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchelement){
                exist=true;
                break;
            }
           
        }if(exist){
            System.out.println("exist");
        }
        else{
            System.out.println("not exist");
        }
        obj.close();
    }

    
}
