import java.io.*;
public class FileHand1{
public static void main(String args[]){
try{
File file = new File("demo.txt");
if(file.createNewFile()){
System.out.println("File Created Successfully...");
}else{
System.out.println("File Already Exists...");
}
}catch(IOException e){
System.out.println(e.getMessage());
}
}
}