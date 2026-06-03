import java.util.Scanner;
class InvalidAgeException extends Exception{
public InvalidAgeException(String message){
super(message);
}
}
class ExcepExample2{
static void validage(int age)
throws InvalidAgeException{
if(age < 18){
throw new InvalidAgeException("Age must be 18 or above for driving...");
}
System.out.println("Eligible for driving...");
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age:");
int a = sc.nextInt();
try{
validage(a);
}
catch(InvalidAgeException e){
System.out.println(e.getMessage());
}
}
}
