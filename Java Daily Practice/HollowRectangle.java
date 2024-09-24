public class HollowRectangle {
    public static void main(String[] args) {
        int rows =4;
        int columns = 5;
        //outer loop
        for(int i=1 ; i<=rows; i++){
            //inner loop
            for( int j=1 ; j<=columns; j++){
                if(i == 1 || j == 1 || i == rows || j == columns ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
}
    

