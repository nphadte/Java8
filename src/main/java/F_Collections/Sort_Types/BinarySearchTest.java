package F_Collections.Sort_Types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "black", "yellow","purple", "tan", "pink"};
        List<String> list =
                new ArrayList<>(Arrays.asList(colors));

        // search list for various values
        //printSearchResults(list, "black"); // first item
        printSearchResults(list, "red"); // middle item
        printSearchResults(list, "pink"); // last item
        printSearchResults(list, "yellow"); // below lowest
        printSearchResults(list, "gray"); // does not exist
        //printSearchResults(list, "teal"); // does not exist

    }


    private static void printSearchResults(List<String> list, String key) {
        int result = 0;
        System.out.println("Searching for the key:" + key);

        result = Collections.binarySearch(list, key);

        if ( result >  0)
            System.out.println("Found at index :" + key + ":  :" +  result);
        else
            System.out.println("Not Found :" + result);
    }
}
