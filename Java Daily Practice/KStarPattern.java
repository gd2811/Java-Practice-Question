public class KStarPattern {
    public static void main(String[] args) {
        int i, j;
        int n = 6;
        
        // outer loop to handle rows
        for (i = n; i >= 1; i--) {

            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }

        // outer loop to handle rows
        for (i = 2; i <= n; i++) {

            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
