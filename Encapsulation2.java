class Employee {
    private int EmpId;
    private String EmpName;
    private double Salary;

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public void setSalary(double Salary) {
        if (Salary > 0) {
            this.Salary = Salary;
        } else {
            System.out.println("INVALID SALARY");
        }
    }

    public int getEmpId() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public double getSalary() {
        return Salary;
    }
}

public class Encapsulation2 {
    public static void main(String args[]) {
        Employee e = new Employee();

        e.setEmpId(101);
        e.setEmpName("Karan");
        e.setSalary(50000);

        System.out.println(e.getEmpId());
        System.out.println(e.getEmpName());
        System.out.println(e.getSalary());
    }
}