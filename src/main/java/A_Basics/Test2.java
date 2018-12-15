package A_Basics;

import java.util.Scanner;

/*
  Input 3 integers and display the naximun of those 3 numbers
   Normally to call a static method, you need to call you with the ClassName.static_method_name , however ,
    since findmaxnumber is the public static of this class , hence we could directly call it without the classname
    If, we had to call the Math.sqrt static method, then it would be Math.sqrt, where Math is the className and sqrt is
    the static methodName
*/
public class Test2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int num1 = input.nextInt();
        System.out.println("Enter the second number :");
        int num2 = input.nextInt();
        System.out.println("Enter the third number :");
        int num3 = input.nextInt();

        System.out.println("The maximum number is :" + findmaxnumber(num1, num2, num3));

    }

    public static int findmaxnumber(int x, int y, int z) {
        int result = 0;
        if (x > result) {
            result = x;
        }
        if (y > result) {
            result = y;
        }
        if (z > result) {
            result = z;
        }
        return result;
    }
}

