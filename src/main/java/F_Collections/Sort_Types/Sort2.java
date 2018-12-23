package F_Collections.Sort_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // creating a List from Arrays
        List<String> list = Arrays.asList(suits);
        System.out.println("Unsorted array elements: " + list);

        /* sort this List using the Collections sort method */
        Collections.sort(list);
        System.out.println("Print the sorted array :" +list);

        // sort in the reverse order using a Comparator
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Print the reverse sorted array :" +list);
    }
}
