import java.util.*;

// Custom Exception: Account Not Found
class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

// Custom Exception: Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Account Class
class Account {
    private int accountNumber;
    private String customerName;
    private double balance;

    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if(amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance!"
            );
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account No : " + accountNumber +
               "\nCustomer   : " + customerName +
               "\nBalance    : ₹" + balance;
    }
}

// Main Class
public class Project1 {

    static Scanner sc = new Scanner(System.in);

    // Collection Framework
    static HashMap<Integer, Account> accounts =
            new HashMap<>();

    // Create Account
    public static void createAccount() {

        System.out.print("Enter Account Number : ");
        int accNo = sc.nextInt();
        sc.nextLine();

        if(accounts.containsKey(accNo)) {
            System.out.println("Account Already Exists!");
            return;
        }

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        Account account =
                new Account(accNo, name, balance);

        accounts.put(accNo, account);

        System.out.println("Account Created Successfully!");
    }

    // Search Account
    public static Account searchAccount(int accNo)
            throws AccountNotFoundException {

        if(!accounts.containsKey(accNo)) {
            throw new AccountNotFoundException(
                    "Account Not Found!"
            );
        }

        return accounts.get(accNo);
    }

    // Deposit
    public static void depositMoney() {

        try {

            System.out.print("Enter Account Number : ");
            int accNo = sc.nextInt();

            Account acc = searchAccount(accNo);

            System.out.print("Enter Amount : ");
            double amount = sc.nextDouble();

            acc.deposit(amount);

            System.out.println(
                    "Deposit Successful!"
            );

        } catch(Exception e) {
            System.out.println(
                    "Error : " + e.getMessage()
            );
        }
    }

    // Withdraw
    public static void withdrawMoney() {

        try {

            System.out.print("Enter Account Number : ");
            int accNo = sc.nextInt();

            Account acc = searchAccount(accNo);

            System.out.print("Enter Amount : ");
            double amount = sc.nextDouble();

            acc.withdraw(amount);

            System.out.println(
                    "Withdrawal Successful!"
            );

        } catch(Exception e) {

            System.out.println(
                    "Error : " + e.getMessage()
            );
        }
    }

    // Display Account
    public static void displayAccount() {

        try {

            System.out.print(
                    "Enter Account Number : "
            );

            int accNo = sc.nextInt();

            Account acc =
                    searchAccount(accNo);

            System.out.println("\n" + acc);

        } catch(Exception e) {

            System.out.println(
                    "Error : " + e.getMessage()
            );
        }
    }

    // Display All Accounts
    public static void displayAllAccounts() {

        if(accounts.isEmpty()) {

            System.out.println(
                    "No Accounts Found!"
            );

            return;
        }

        System.out.println(
                "\n===== ALL ACCOUNTS ====="
        );

        for(Account acc : accounts.values()) {

            System.out.println(acc);

            System.out.println(
                    "----------------------"
            );
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println(
                    "\n===== BANK MANAGEMENT SYSTEM ====="
            );

            System.out.println(
                    "1. Create Account"
            );

            System.out.println(
                    "2. Deposit Money"
            );

            System.out.println(
                    "3. Withdraw Money"
            );

            System.out.println(
                    "4. Search Account"
            );

            System.out.println(
                    "5. Display All Accounts"
            );

            System.out.println(
                    "6. Exit"
            );

            System.out.print(
                    "Enter Choice : "
            );

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    displayAccount();
                    break;

                case 5:
                    displayAllAccounts();
                    break;

                case 6:
                    System.out.println(
                            "Thank You!"
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid Choice!"
                    );
            }

        } while(choice != 6);
    }
}