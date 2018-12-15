package A_Basics;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 *  Write a program to use Scanner to import values from th keyboard , check if it's an integer ,
 *  compare it with an random generator and store it in a file
 *
 */
public class Test1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = 0  ;
        System.out.println("Enter the number :");

        while ( input.hasNext() ){
            try {
                num1 = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            } catch (NoSuchElementException e) {

            } catch (IllegalStateException e) {

            }
        }

        System.out.println("The number entered is :" + num1);

    }


}
