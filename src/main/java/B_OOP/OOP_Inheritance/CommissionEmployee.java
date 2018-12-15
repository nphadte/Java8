package B_OOP.OOP_Inheritance;

public class CommissionEmployee {

    /*  make the access modifiers for the member variables to protected to ensure that they get accessed in child classes
    */
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public  CommissionEmployee( String firstName, String lastName,
                                String socialSecurityNumber, double grossSales,
                                double commissionRate){
        // implicit call to Object's default constructor occurs here
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        if ( grossSales < 0.0 ){
            throw  new IllegalArgumentException("Gross Sales must be > 0.0");
        }
        this.grossSales = grossSales;
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if ( grossSales < 0.0 ){
            throw  new IllegalArgumentException("Gross Sales must be > 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    // calculate earnings
    public double earnings()
    {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
