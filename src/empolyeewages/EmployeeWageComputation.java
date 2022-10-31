package empolyeewages;

public class EmployeeWageComputation {
    // Default Constructor
    public EmployeeWageComputation()
    {
        System.out.println("Welcome to Employee Wage Computation Program..!");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        EmployeeWageComputation employee = new EmployeeWageComputation();

        //Calculating employee wage for different companies.
        System.out.println("Calculating the salary for different companies : ............");
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.addCompanyEmployeeWage("Google",40,100,20);
        employeeWageBuilder.addCompanyEmployeeWage("Microsoft",20,150,18);
        employeeWageBuilder.addCompanyEmployeeWage("Amazon",60,180,22);
        employeeWageBuilder.addCompanyEmployeeWage("Apple",30,190,26);
        employeeWageBuilder.computeEmpWage();
        System.out.println();
        System.out.println("Total Wage for Amazon Company : "+employeeWageBuilder.getTotalWage("Amazon"));

    }
}
