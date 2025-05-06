import java.util.Scanner;

public class occuranceofnum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("entter arr size");
        int n = obj.nextInt();
        int [] arr=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        boolean[] counted = new boolean[n];
        for(int i=0;i<arr.length;i++){
            if(!counted[i]){
                int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    counted[j]=true;
                }
            }
            System.out.println(arr[i]+" occured "+ count +" times");
        }
       
    }
    obj.close();
}
}
