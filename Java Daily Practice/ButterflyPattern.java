public class ButterflyPattern {
    public static void main(String[] args) {
        int rows = 5;
        //outer loop
        for(int i=1 ; i<=rows; i++){
            //inner loop
            for( int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            for( int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows-1 ; i>=1; i--){
            //inner loop
            for( int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            for( int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
