class StrongNum{
    public static void main(String[] args){
        int num = 145;  // The number to check
        int temp = num; // Save the original number for comparison
        int sum = 0;

        // Loop through each digit of the number
        while(num > 0){
            int digit = num % 10; // Get the last digit
            int fact = 1;

            // Calculate the factorial of the digit
            for(int i = 1; i <= digit; i++){
                fact = fact * i;
            }

            sum = sum + fact;  // Add the factorial to sum
            num = num / 10;    // Remove the last digit from num
        }

        // Check if the sum of factorials equals the original number
        if(sum == temp){
            System.out.println("strong");
        } else {
            System.out.println("not strong");
        }
    }
}
