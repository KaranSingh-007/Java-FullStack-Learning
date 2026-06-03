class Employee {
    protected String name = "Karan";
}

class Manager extends Employee {
    void display() {
        System.out.println("Name: " + name);
    }
}

public class ProtectedEx {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}