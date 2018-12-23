package B_OOP.OOP_Polymorphism;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    //
    public BasePlusCommissionEmployee(String firstName, String lastname,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastname, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
                    "Base Salary must b >= 0.0");

        }
        this.baseSalary = baseSalary;
    }

    // calculate earnings
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }


}
