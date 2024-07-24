//Reverse a String:
//Write a function that reverses a string. The input string is given as an array of characters char[].
//Write a function that reverses a given string.
public class Question1 {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Question1 class
        Question1 question = new Question1();

        // Define a sample char array to be reversed
        char[] sample = {'h', 'e', 'l', 'l', 'o'};

        // Print the original array
        System.out.println("Original array: " + new String(sample));

        // Reverse the array
        question.reverseString(sample);

        // Print the reversed array
        System.out.println("Reversed array: " + new String(sample));
    }
}
