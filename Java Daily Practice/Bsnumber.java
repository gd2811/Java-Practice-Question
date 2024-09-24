public class Bsnumber{
    public static void main(String[] args) {
        int arr[] = { 3, 9 , 3 , 6 , -1};
        int largest = arr[0];  
        for (int num : arr) {
            if (num > largest) {
                largest = num;  
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}