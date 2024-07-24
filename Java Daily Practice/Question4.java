//Find the Missing Number in an Array: Given an array of consecutive integers
//with one missing element, write a function to find the missing number.abstract 
public class Question4 {
    // Method to find the missing number in an array of consecutive integers
    public static int findMissingNumber(int[] nums) {
        // Initialize result with the length of the array
        int res = nums.length;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Update result by adding the index and subtracting the array element
            res += i - nums[i];
        }
        
        // Ensure the result is positive
        return Math.abs(res);       
    }

    public static void main(String[] args) {
        // Example array with a missing number
        int[] arr = {1, 2, 4, 5, 6};
        // Print the missing number
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }
}
