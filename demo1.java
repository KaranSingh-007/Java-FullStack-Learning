import java.util.*;

class Cust {
    Scanner sc = new Scanner(System.in);

    public int withdraw(int b1) {
        System.out.println("Enter amount");
        int amount = sc.nextInt();
        return b1 - amount;
    }

    public int deposit(int b1) {
        System.out.println("Enter amount");
        int amount = sc.nextInt();
        return b1 + amount;
    }
}

public class demo1 {
    public static void main(String[] args) {
        Cust cu = new Cust();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String s1 = sc.next();

        System.out.println("Enter Account Number");
        int a1 = sc.nextInt();

        System.out.println("Enter Balance");
        int b1 = sc.nextInt();

        System.out.println("1. Withdraw, 2. Deposit");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();

        if (ch == 1) {
            int n1 = cu.withdraw(b1);
            System.out.println("Hi " + s1 + " your current balance = " + n1);
        } else if (ch == 2) {
            int n1 = cu.deposit(b1);
            System.out.println("Hi " + s1 + " your current balance = " + n1);
        } else {
            System.out.println("Invalid Choice");
        }
    }
}