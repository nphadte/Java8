package B_OOP.OOP1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name on the Account");
        String thename = input.nextLine();

        myAccount.setName(thename);

        System.out.println("The Name in object myAccount is :" + myAccount.getName());
    }
}
