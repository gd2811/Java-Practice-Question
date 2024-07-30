//Count the Occurrence of Each Element in an Array: Write a function that
//counts the number of times each element appears in a given array.
import java.util.HashMap; 
// Import the HashMap class from the java.util package
import java.util.Map; 
// Import the Map interface from the java.util package

public class ElementCounter { 
    // Declare a public class named ElementCounter
    public static void countOccurrences(int[] array) { 
        // Declare a public static method named countOccurrences that takes an array of integers as a parameter
        Map<Integer, Integer> elementCountMap = new HashMap<>();
         // Create a HashMap to store the count of each element

        for (int element : array) { 
            // Iterate over each element in the array
            if (elementCountMap.containsKey(element)) { 
                // Check if the element is already in the map
                elementCountMap.put(element, elementCountMap.get(element) + 1); 
                // If it is, increment its count by 1
            } else {
                elementCountMap.put(element, 1); 
                // If it is not, add it to the map with a count of 1
            }
        }

        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) { // Iterate over the entries in the map
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times"); // Print each element and its count
        }
    }

    public static void main(String[] args) { 
        // Declare the main method, the entry point of the program
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}; 
        // Initialize an array with some elements
        countOccurrences(array); 
        // Call the countOccurrences method with the array as an argument
    }
}

