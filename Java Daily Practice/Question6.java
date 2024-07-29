//Remove Duplicates from an Array :Write a function that removes duplicate
//elements from a given array while preserving the order.
public class Question6 { 
    // Declare a public class named Solution
    public int removeDuplicates(int[] nums) { 
        // Declare a public method named removeDuplicates that returns an integer and takes an array of integers as a parameter
        int j = 1; 
        // Initialize an integer variable j to 1 to keep track of the position for the next unique element
        for (int i = 1; i < nums.length; i++) { // Start a for loop from the second element to the end of the array
            if (nums[i] != nums[i - 1]) { // Check if the current element is different from the previous element
                nums[j] = nums[i]; // Assign the current element to the position j in the array
                j++; 
                // Increment j to move to the next position for the next unique element
            }
        }
        return j; 
        // Return the length of the array after removing duplicates
    }

    public static void main(String[] args) { 
        // Declare the main method, the entry point of the program
        Question6 solution = new Question6(); 
        // Create an instance of the Solution class
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5}; 
        // Initialize an array with some duplicate elements
        int length = solution.removeDuplicates(nums); 
        // Call the removeDuplicates method and store the returned length
        System.out.println("The length of the array after removing duplicates is: " + length); // Print the length of the array after removing duplicates
        System.out.print("The modified array is: "); 
        // Print a message indicating the start of the modified array output
        for (int i = 0; i < length; i++) { 
            // Iterate over the modified array up to the returned length
            System.out.print(nums[i] + " "); 
            // Print each element of the modified array
        }
    }
} // Close the Solution class

