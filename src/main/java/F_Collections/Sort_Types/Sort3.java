package F_Collections.Sort_Types;
// Collections method sort with a custom Comparator object.


import java.util.*;

public class Sort3 {

    public static void main(String[] args) {
        List<Date>  list = new ArrayList<>();

        list.add(new Date(2018, 10, 12));
        list.add(new Date(2017, 4, 11));
        list.add(new Date(2018, 7, 11));
        list.add(new Date(2018, 2, 10));
        list.add(new Date(2018, 5, 20));
        list.add(new Date(2018, 8, 17));

        // output List elements
        System.out.println("Unsorted array of elements:" + list);

        //sort in order using a comparator
        Collections.sort(list);

        System.out.println("Sorted array of elements:" + list);

    }
}
