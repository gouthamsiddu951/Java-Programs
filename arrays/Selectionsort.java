public class Selectionsort {
    public static void main(String[] args) {
        int[]arr={64,23,12,15,11};
        for(int  i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;i<arr.length;i++){
                j=min;
            }
            if(arr[min]<arr[i]){
                min=arr[i];
                arr[i]=arr[j];
                arr[j]=min;
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
    
}
