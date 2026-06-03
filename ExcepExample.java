import java.util.Scanner;
class ExcepExample {
    static void withdraw(double balance, double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }
        System.out.println("Withdraw Successful");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();
        try {
            withdraw(balance, amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}