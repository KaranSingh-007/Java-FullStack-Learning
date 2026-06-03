import java.util.*;
public class ExcepHandling{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
try{
System.out.println("Enter 1st value");
int n1 = sc.nextInt();
System.out.println("Enter 2nd value");
int n2 = sc.nextInt();
int res = n1/n2;
System.out.println("result = "+res);
}catch(Exception e){
System.out.println("Sorry you can't divide with zero");
}
finally{
System.out.println("Completed");
}
}
}
