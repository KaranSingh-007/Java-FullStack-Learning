import java.io.*;
import java.util.Scanner;
public class FileHand4{
public static void main(String args[]){
try{
File file = new File("demo.txt");
Scanner sc = new Scanner(file);
while(sc.hasNextLine()){
System.out.println(sc.nextLine());
}sc.close();
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}