public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        
        int[] array = {3, 5, 7, 2, 8, -1, 4};

      
        int secondSmallest = findSecondSmallest(array);

      
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        } else {
            System.out.println("The array does not have a second smallest element.");
        }
    }

   
    public static int findSecondSmallest(int[] array) {
       
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

     
        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = num; // 
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

       
        return secondSmallest;
    }
}