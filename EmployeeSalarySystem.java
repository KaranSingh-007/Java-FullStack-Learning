import java.util.Scanner;

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeId;
        String employeeName;
        int age;
        double basicSalary;
        double bonus;
        double tax;
        double finalSalary;
        boolean isPermanent;

        System.out.println("==== Employee Salary System ====");

        System.out.print("Enter Employee Id: ");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Monthly Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Employee Permanent? true/false: ");
        isPermanent = sc.nextBoolean();

        double yearlySalary;
        yearlySalary = basicSalary * 12;

        bonus = yearlySalary * 10 / 100;
        tax = yearlySalary * 5 / 100;
        finalSalary = yearlySalary + bonus - tax;

        age++;

        boolean highSalary;
        highSalary = finalSalary > 500000;

        boolean eligibleForLoan;
        eligibleForLoan = isPermanent && finalSalary > 300000;

        System.out.println();
        System.out.println("==== Employee Details ====");
        System.out.println("Employee Id = " + employeeId);
        System.out.println("Name = " + employeeName);
        System.out.println("Next Year Age = " + age);
        System.out.println("Monthly Salary = " + basicSalary);
        System.out.println("Yearly Salary = " + yearlySalary);
        System.out.println("Bonus Amount = " + bonus);
        System.out.println("Tax Amount = " + tax);
        System.out.println("Final Salary = " + finalSalary);
        System.out.println("High Salary Employee = " + highSalary);
        System.out.println("Loan Eligible = " + eligibleForLoan);
    }
}