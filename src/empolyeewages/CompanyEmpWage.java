package empolyeewages;

public class CompanyEmpWage {
    //Declaring the object referred variables
    public final String companyName;
    public final int empWagePerHour;
    public final int maxWorkingHours;
    public final int maxWorkingDays;
    public int monthlySalary;

    //Declaring Parameterised Constructor
    public CompanyEmpWage(String companyName, int empWagePerHour, int maxWorkingHours, int maxWorkingDays) {
        this.companyName = companyName;
        this.empWagePerHour = empWagePerHour;
        this.maxWorkingHours = maxWorkingHours;
        this.maxWorkingDays = maxWorkingDays;
        monthlySalary = 0;
    }

    //Setter method for monthlySalary
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Total Wage for Company: "+companyName+" is "+monthlySalary;
    }
}
