// Poll analysis program.
// To determine how many students got the same grades
package D_Arrays;

public class StudentPoll {

    public static void main(String[] args) {

        // student response array (more typically, input at run time)
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
                2, 3, 3, 2, 14};
        int[] frequency = new int[15]; // array of frequency counters

        for (int d : responses) {
            System.out.println("The value is :" + d);
            frequency[d]++;
        }

        for (int i = 0; i < frequency.length; i++) {

            System.out.println("frequency[" + i + "] = " + frequency[i]);
        }

    }
}
