package F_Collections.Mathematical_Calcs;

/*
 * Factorial Symbol. The factorial function (symbol: !) says to multiply all whole numbers from our chosen number down to 1. Examples: 4! = 4 × 3 × 2 × 1 = 24; 7!
 */

public class FactorialCalculator {

    // recursive declaration of method factorial
    public static long factorial(long n) {
        long result = 1;

        // iterative declaration of method factorial
        for (long i = n; i >= 1; i--) {
            result *= i;

        }
        return result;
    }

    public static void main(String[] args) {
        // calculate the factorials of 0 through 10
        for (int i = 0; i <= 10; i++) {
            System.out.println("The factorial of :" + i + " is :" + factorial(i));
        }
    }
}
