package E_NIO.MyFileReader;

import java.util.Date;

public class Data {

    private int index;
    private String name;
    private String account;
    private double starting_balance;
    private double closing_balance;
    private Date last_modifed_date;

    public Data(int index, String name, String account, double starting_balance, double closing_balance, Date last_modifed_date) {
        this.index = index;
        this.name = name;
        this.account = account;
        this.starting_balance = starting_balance;
        this.closing_balance = closing_balance;
        this.last_modifed_date = last_modifed_date;
    }

    /*public Data(String line) {

        String[] tokens = line.split();

        this.index = tokens[0];
        this.name = tokens[1];
        this.account = tokens[2];
        this.starting_balance = tokens[3];
        this.closing_balance = tokens[4];
        this.last_modifed_date = tokens[5];
    }*/

//}

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getStarting_balance() {
        return starting_balance;
    }

    public void setStarting_balance(double starting_balance) {
        this.starting_balance = starting_balance;
    }

    public double getClosing_balance() {
        return closing_balance;
    }

    public void setClosing_balance(double closing_balance) {
        this.closing_balance = closing_balance;
    }

    public Date getLast_modifed_date() {
        return last_modifed_date;
    }

    public void setLast_modifed_date(Date last_modifed_date) {
        this.last_modifed_date = last_modifed_date;
    }


}


