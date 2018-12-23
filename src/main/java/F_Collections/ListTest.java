package F_Collections;

/*
 * https://www.javatpoint.com/collections-in-java
 * List <data-type> list1= new ArrayList();
 * List <data-type> list2 = new LinkedList();
 * List <data-type> list3 = new Vector();
 * List <data-type> list4 = new Stack();
 * https://www.javatpoint.com/difference-between-arraylist-and-linkedlist

 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args) {

        String[] colors =
                {"black", "yellow", "green", "blue", "violet", "silver"};

        List<String> linkedlist = new LinkedList<>();

        for (String color : colors) {
            linkedlist.add(color);
        }
        printList(linkedlist);

        printReversedList(linkedlist);
    }

    // output List content
    private static void printList(List<String> list) {
        System.out.printf("%nRegular list:%n");

        for (String color : list)
            System.out.printf("%s ", color);

        System.out.println();
    }

    // print reversed list
    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReversed List:%n");

        // print list in reverse order
        while (iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());
    }
}
