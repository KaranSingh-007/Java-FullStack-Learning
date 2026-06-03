import java.util.*;
class Payment{
void pay(double amount){
System.out.println("Processing Payment....");
}
}
class UPI extends Payment{
@Override
void pay(double amount){
System.out.println("UPI payment Successful");
System.out.println("Amount Paid : Rs "+amount);
}
}
class CreditCard extends Payment{
@Override
void pay(double amount){
System.out.println("Credit card Payment Successful");
System.out.println("Amount Paid : Rs "+amount);
}
}
class NetBanking extends Payment{
@Override
void pay(double amount){
System.out.println("NetBanking Payment Successful");
System.out.println("Amount Paid : Rs "+amount);
}
}
public class UPIExample{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("====Online Payment System====");
System.out.println("Enter amount :");
double amount = sc.nextDouble();
System.out.println("\nSelect Payment Method");
System.out.println("1. UPI\n2. Credit Card\n3. Net Banking");
System.out.println("Enter Choice : ");
int choice = sc.nextInt();
Payment payment = null;
switch(choice){
case 1:
payment = new UPI();
break;
case 2:
payment = new CreditCard();
break;
case 3:
payment = new NetBanking();
break;
default:
System.out.println("INVALID CHOICE");
System.exit(0);
}
payment.pay(amount);
sc.close();
}
}
