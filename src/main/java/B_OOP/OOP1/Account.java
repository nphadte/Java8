// Account class that contains an name instance variable
// and methods to set and get its value.
package B_OOP.OOP1;

import java.util.Objects;

public class Account {
    private String name; // instance variable
    private double balance; // instance variable

    public Account(String name) {
        this.name = name;
    }

    // All the appropriate constructors need to be provided that will be used for constructing the object
    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 &&
                Objects.equals(name, account.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance);
    }
}
