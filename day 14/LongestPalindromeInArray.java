public class LongestPalindromeInArray {
    public static void main(String[] args) {
       
        String[] array = {"racecar", "hello", "level", "world", "noon", "madam", "apple"};

        
        String longestPalindrome = findLongestPalindrome(array);

       
        if (longestPalindrome != null) {
            System.out.println("The longest palindrome in the array is: " + longestPalindrome);
        } else {
            System.out.println("No palindrome found in the array.");
        }
    }

 
    public static String findLongestPalindrome(String[] array) {
        String longest = null; // Initialize longest palindrome as null

        for (String str : array) {
            if (isPalindrome(str)) {
           
                if (longest == null || str.length() > longest.length()) {
                    longest = str; // Update longest palindrome
                }
            }
        }

        return longest;
    }

    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true;
    }
}