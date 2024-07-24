public class Question2 {
    // Function to find the maximum element in an array
    public static int findMaximum(int[] arr) {
        int max = arr[0]; // Assume first element is the maximum initially
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        return max; // Return the maximum element
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30}; // Example array
        int max = findMaximum(arr); // Find the maximum element
        System.out.println("The maximum element in the array is: " + max); // Print the result
    }
}
