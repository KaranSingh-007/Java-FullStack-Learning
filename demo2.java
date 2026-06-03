class abc{
public void add(int a, int b){
int res = a+b;
System.out.println("Addition of two numbers : "+res);
}
public void sub(int a, int b){
int subtract = a-b;
System.out.println("Subtraction of two numbers :"+subtract);
}
public void mul(int a, int b){
int multiply = a*b;
System.out.println("Multiplication of two numbers :"+multiply);
}
}

public class demo2{
public static void main(String[] args){
abc ab = new abc();
abc su = new abc();
abc mu = new abc();
ab.add(5,5);
ab.sub(5,5);
ab.mul(5,5);
}
}