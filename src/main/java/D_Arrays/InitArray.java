package D_Arrays;

public class InitArray {
    public static void main(String[] args) {
        // declare variable array and initialize it with an array object
        final int ARRAY_LENGTH = 10; // constant
        int[] array = new int[ARRAY_LENGTH]; // new creates the array object
        int[] array2 = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);

        int total = 0;
        // add each element's value to total
        for (int number : array2)
            total += number;

        System.out.printf("Total of array elements: %d%n", total);
    }
}
