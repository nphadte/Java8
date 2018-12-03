package A_Basics.Enum_Sample;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books:");
        for ( Book book : Book.values()){
            System.out.println("The Book and its Title and copyRightyear is :" + book + ": :" + book.getTitle() +
                    ": :" + book.getCopyrightYear()  );

        }

        System.out.printf("%nDisplay a range of enum constants:%n");
        for ( Book  book : EnumSet.range(Book.JHTP, Book.CPPHTP)){
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
}