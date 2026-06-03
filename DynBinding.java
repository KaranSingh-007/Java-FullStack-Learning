import java.util.*;
class addition{
public void add(int a, int b){
add = a+b;
System.out.println(+add);
}}
class subtraction{
public void sub(int a, int b){
sub = a-b;
System.out.println(+sub);
}}
class multiple{
public void add(int a, int b){
mul = a+b;
System.out.println(+mul);
}}
public class DynBinding{
public static void main(String[] args){
addition ad = new addition();
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1. for addition./n 2. for subtraction./n 3. for multiplication");
int choice = sc.nextInt();
switch(choice){
case 1:
ad.add();
}
}
}