class Findmax{

public static int Findmax(int arr[]){
int max=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}
}
return max;
}
public static void main(String[] args){
int []arr={1,2,3,4,5};
int maxvalue=Findmax(arr);
System.out.println(maxvalue);
}
}