import java.io.*;
public class FileHand2{
public static void main(String args[]){
try{
FileWriter wr = new FileWriter("demo.txt");
wr.write("Karan Singh\n");
wr.write("Java Learner"); 
wr.close();
System.out.println("Data Written");
}catch(Exception e){
System.out.println(e.getMessage());
}
}
}