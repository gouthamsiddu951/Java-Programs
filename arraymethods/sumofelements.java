class sumofelements{

public static int sumofelements(int arr[]){
int sum=arr[0];
for(int i=1;i<arr.length;i++){
sum=sum+arr[i];
}
return sum;
}
public static void main(String[] args){
int[]arr={1,2,3,1};
int sumofall=sumofelements(arr);
System.out.println(sumofall);
}
}