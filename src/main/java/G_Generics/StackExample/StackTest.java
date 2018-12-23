package G_Generics.StackExample;

public class StackTest {
    public static void main(String[] args) {

        double[] doubleElements  = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[]    integerElements = {1,2,3,4,5,6,7,8,9,10};

        // create a Stack<Double> and a Stack<Integer>
        Stack<Double>  doubleStack = new Stack<>(5);
        Stack<Integer>  integerStack = new Stack<>(5);


    }
}
