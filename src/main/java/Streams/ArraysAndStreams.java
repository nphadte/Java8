package Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams {

    public static void main(String[] args) {
        Integer [] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        System.out.printf("Original values: %s%n", Arrays.asList(values));
    /*  System.out.println("Sorted values: %s%n",
                          Arrays.stream(values)
                                .sorted()
                                .collect(Collectors.toList()));
    */
    }


}
