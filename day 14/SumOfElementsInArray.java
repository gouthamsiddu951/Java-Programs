public class SumOfElementsInArray {
    public static void main(String[] args) {
        
        int[] array = {3, 5, 7, 2, 8, -1, 4};

       
        int sum = calculateSum(array);

        
        System.out.println("The sum of elements in the array is: " + sum);
    }

   
    public static int calculateSum(int[] array) {
        int sum = 0; 
        for (int num : array) {
            sum += num; 
        }

        return sum; 
    }
}