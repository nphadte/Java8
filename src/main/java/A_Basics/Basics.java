package A_Basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        System.out.printf("%s%s%n", "Welcome to", " the tour");

        // create a Scanner to Obtain an input from the command window
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.print("Enter your first number : ");
        num1 = input.nextInt();

        System.out.print("Enter your second number : ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of the 2 numbers :" + num1 + ": :" + num2 + " is :" + sum);

    }
}
