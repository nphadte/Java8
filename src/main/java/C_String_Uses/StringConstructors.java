package C_String_Uses;

public class StringConstructors {

    public static void main(String[] args) {

        // define an charArray
        char[] charArray = { 'b','i','r','t','h',' ','a'};
        String s = new String("hello");

        System.out.println("The length of String s is :" + s.length() );
        // reverse the String

        for ( int i = s.length()-1 ; i >= 0 ; i-- ){
                System.out.printf("%c", s.charAt(i)) ;
        }
    }
}
