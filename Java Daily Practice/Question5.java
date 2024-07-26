//Find the Intersection of Two Arrays: Write a function that finds the elements
//present in both a given pair of arrays.
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        System.out.print("Intersection result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
//import java.util.*;: This line imports the necessary Java utility classes, including HashSet and Set.
//public class ArrayIntersection {: This defines a class named ArrayIntersection.
//   public int[] intersection(int[] nums1, int[] nums2) {: This is the method that calculates the intersection of two arrays. It takes two integer arrays (nums1 and nums2) as input and returns an integer array.
//  Set<Integer> set1 = new HashSet<>();: Creates a HashSet called set1 to store unique elements from nums1.
//    Set<Integer> resultSet = new HashSet<>();: Creates another HashSet called resultSet to store the intersection result.
//    for (int num : nums1) { set1.add(num); }: Iterates through each element in nums1 and adds it to set1.
//    for (int num : nums2) { if (set1.contains(num)) { resultSet.add(num); } }: Iterates through each element in nums2. If an element exists in set1, it’s added to the resultSet.
//    int[] result = new int[resultSet.size()];: Creates an integer array called result with the size equal to the number of elements in resultSet.
//    int i = 0; for (int num : resultSet) { result[i++] = num; }: Converts the resultSet to an array by copying its elements into result.
//   Finally, the method returns the result array containing the intersection elements.
