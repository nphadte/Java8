package F_Collections;

// Collection interface demonstrated via an ArrayList object.

import java.util.ArrayList;
import java.util.List;

/*
 *  given an Array of Strings, add it to an ArrayList
 *  given 2 arrays of String, remove the 2nd subset from the first and print the resulting List
 */
public class CollectionTest {
    public static void main(String[] args) {

        // add elements in colors array to list
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};

        List<String> list = new ArrayList<>();

        for ( String s : colors ){
            list.add(s);
        }

        list.forEach(System.out::println);
    }
}
