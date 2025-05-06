import java.util.Scanner;
public class duplicateelement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enetr n ele");
        int n=obj.nextInt();
        System.out.println("enter"+n+"ele");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        boolean hasDublicate=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("found "+arr[i]);
                hasDublicate=true;
                    break;
                    
            }
            }
                }
                if(!hasDublicate){
                    System.out.println("not found");
                }
                obj.close();
            }
        }
    
    
