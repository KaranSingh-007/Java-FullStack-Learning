import java.util.InputMismatchException;
import java.util.Scanner;


class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

   
    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be greater than zero");
        }

        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }

    
    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful");
    }

    
    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }
}


public class Transaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account(10000);

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            try {

                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("Enter Deposit Amount : ");
                        double depositAmount = sc.nextDouble();

                        account.deposit(depositAmount);
                        break;

                    case 2:

                        System.out.print("Enter Withdrawal Amount : ");
                        double withdrawAmount = sc.nextDouble();

                        account.withdraw(withdrawAmount);
                        break;

                    case 3:

                        account.checkBalance();
                        break;

                    case 4:

                        System.out.println("Thank You...");
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice");
                }

            }

            catch (InputMismatchException e) {

                System.out.println(
                        "Invalid Input. Please Enter Numeric Value.");
                sc.nextLine();
            }

            catch (IllegalArgumentException e) {

                System.out.println(
                        "Error : " + e.getMessage());
            }

            catch (InsufficientBalanceException e) {

                System.out.println(
                        "Error : " + e.getMessage());
            }

            catch (Exception e) {

                System.out.println(
                        "Unexpected Error : " + e.getMessage());
            }
        }
    }
}