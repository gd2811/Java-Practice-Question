public class FullInvertedHalfPyramid {
    public static void main(String[] args) {
        int rows = 5;
        //outer loop
        for(int i= 1; i<= rows ; i++){
            //inner loop -> for space
            for(int j=1 ; j <= rows-i ; j++){
                System.out.print(" ");
            }
            //inner loop -> for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
