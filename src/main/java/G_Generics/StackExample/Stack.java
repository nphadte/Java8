package G_Generics.StackExample;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {

    private final ArrayList<T> elements;

    // constructor creates a stack of the specified number of elements
    public Stack() {
        this(10); // default stack size
    }

    public Stack(int capacity){
        int initCapacity = capacity > 0 ? capacity : 10 ;
        elements = new ArrayList<T>(initCapacity);
    }

    // push element onto stack
    public void push(T pushValue)
    {
        elements.add(pushValue); // place pushValue on Stack
    }

    // return the top element if not empty; else throw EmptyStackException
    public T pop()
    {
        if (elements.isEmpty()) // if stack is empty
            throw new EmptyStackException();

        // remove and return top element of Stack
        return elements.remove(elements.size() - 1);
    }
}
