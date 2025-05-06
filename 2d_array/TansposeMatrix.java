// to print Transpose matrix array

import java.util.Scanner;
class TansposeMatrix{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("enter rows:");
int rows=s.nextInt();
System.out.print("enter coloumns:");
int coloumns=s.nextInt();
int [][]arr=new int[rows][coloumns];
System.out.println("enter elements of array:");
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
arr[i][j]=s.nextInt();
}
}
System.out.println("before matrix ");
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
System.out.println("after output");
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
System.out.print(arr[j][i]+" ");

}
System.out.println();
}
}
}