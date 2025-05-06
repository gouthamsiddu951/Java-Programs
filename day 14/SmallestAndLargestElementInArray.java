
public class SmallestAndLargestElementInArray {
    public static void main(String[] args) {
       
        int[] array = {3, 5, 7, 2, 8, -1, 4};

       
        int[] result = findSmallestAndLargest(array);

 
        System.out.println("The smallest element in the array is: " + result[0]);
        System.out.println("The largest element in the array is: " + result[1]);
    }

    
    public static int[] findSmallestAndLargest(int[] array) {
        
        int smallest = array[0];
        int largest = array[0];

       
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        
        return new int[]{smallest, largest};
    }
}