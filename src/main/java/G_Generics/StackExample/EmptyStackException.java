package G_Generics.StackExample;

// EmptyStackException class declaration.
public class EmptyStackException extends RuntimeException {

    public EmptyStackException() {
        this("Stack is empty");
    }

    public EmptyStackException(String message) {
        super(message);
    }

}
