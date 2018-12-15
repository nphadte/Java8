package D_Arrays;

public class BarChart {

    public static void main(String[] args) {

        int[] data = {2,5, 5, 4, 6, 8, 6, 1, 0, 7, 5};

        System.out.println("Display stars corresponding to data in each index ");
        System.out.println("Grade distribution:");

        for ( int i: data){
            for ( int x = 0 ; x < i ; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
