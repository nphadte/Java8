package A_Basics.VariableScope;
// Scope class demonstrates field and local variable scopes.

public class Scope {
    // field that is accessible to all methods of this class
    private static int x = 1;


    // method main creates and initializes local variable x
    // and calls methods useLocalVariable and useStaticField
    public static void main(String[] args) {

        int x = 5;  // method's local variable x shadows field x
        System.out.printf("local x in main is %d%n", x);

        useLocalVariable(); // useLocalVariable has function local x
        useStaticField(); // useField uses class Scope's field x
        useLocalVariable(); // useLocalVariable reinitializes function local x
        useStaticField(); // class Scope's field x retains its value
        System.out.printf("local x in main is %d%n", x);
    }

    public static void useLocalVariable() {
        int x = 25;  // initialized each time useLocalVariable is called

        System.out.printf(
                "%nlocal x on entering method useLocalVariable is %d%n", x);
        ++x; // modifies this method's local variable x
        System.out.printf(
                "local x before exiting method useLocalVariable is %d%n", x);


    }

    public static void useStaticField() {
        System.out.printf(
                "%nfield x on entering method useField is %d%n", x);
        x *= 10; // modifies class Scope's field x
        System.out.printf(
                "field x before exiting method useField is %d%n", x);
    }
}
