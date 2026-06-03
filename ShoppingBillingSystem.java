import java.util.Scanner;

public class ShoppingBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String customerName = "";
        long mobileNumber = 0;
        double totalBill = 0;
        boolean registered = false;
        boolean premiumMember = false;
        int choice;

        while (true) {
            System.out.println("\n==== ONLINE SHOPPING SYSTEM ====");
            System.out.println("1. Register Customer");
            System.out.println("2. Add Products");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();

                    System.out.print("Enter Customer Name : ");
                    customerName = sc.nextLine();

                    System.out.print("Enter Mobile Number : ");
                    mobileNumber = sc.nextLong();

                    System.out.print("Premium Member (true/false) : ");
                    premiumMember = sc.nextBoolean();

                    registered = true;

                    System.out.println("Customer Registered Successfully");
                    break;

                case 2:
                    if (registered) {
                        System.out.print("How many products : ");
                        int count = sc.nextInt();

                        for (int i = 1; i <= count; i++) {
                            System.out.println("\nProduct " + i);

                            System.out.print("Enter Product Price : ");
                            double price = sc.nextDouble();

                            System.out.print("Enter Quantity : ");
                            int quantity = sc.nextInt();

                            if (price > 0 && quantity > 0) {
                                double amount = price * quantity;
                                totalBill = totalBill + amount;
                            } else {
                                System.out.println("Invalid Product Details");
                                i--;
                            }
                        }

                        System.out.println("Products Added Successfully");
                    } else {
                        System.out.println("Register Customer First");
                    }
                    break;

                case 3:
                    if (registered) {
                        double discount = 0;
                        double deliveryCharge;
                        double finalAmount;

                        if (totalBill >= 50000) {
                            discount = totalBill * 20 / 100;
                        } else if (totalBill >= 20000) {
                            discount = totalBill * 10 / 100;
                        } else {
                            discount = 0;
                        }

                        if (premiumMember) {
                            discount = discount + 500;
                        }

                        if (totalBill >= 1000) {
                            deliveryCharge = 0;
                        } else {
                            deliveryCharge = 100;
                        }

                        finalAmount = totalBill - discount + deliveryCharge;

                        System.out.println("\n==== BILL ====");
                        System.out.println("Customer : " + customerName);
                        System.out.println("Mobile : " + mobileNumber);
                        System.out.println("Total Bill : " + totalBill);
                        System.out.println("Discount : " + discount);
                        System.out.println("Delivery Charge : " + deliveryCharge);
                        System.out.println("Final Amount : " + finalAmount);

                        if (finalAmount >= 30000) {
                            System.out.println("VIP Customer");
                        } else {
                            System.out.println("Regular Customer");
                        }
                    } else {
                        System.out.println("No Customer Found");
                    }
                    break;

                case 4:
                    System.out.println("Thank You For Shopping...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}